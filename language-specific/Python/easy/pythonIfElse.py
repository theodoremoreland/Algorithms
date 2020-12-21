# Task
# Given an integer, , perform the following conditional actions:
# If  is odd, print Weird
# If  is even and in the inclusive range of  to , print Not Weird
# If  is even and in the inclusive range of  to , print Weird
# If  is even and greater than , print Not Weird

# Input Format
# A single line containing a positive integer, .

# Output Format
# Print Weird if the number is weird; otherwise, print Not Weird.

# Sample Input 0
# 3

# Sample Output 0
# Weird

N = int(input())

if ((N % 2) >= 1) or (N % 2 == 0 and (N >= 6 and N <= 20)):
    string = "Weird"
elif (N >= 2 and N <= 5) or N > 20:
    string = "Not Weird"

print(string)
