<pre>
Consider a list (list = []). You can perform the following commands:

insert i e: Insert integer i at position e.
print: Print the list.
remove e: Delete the first occurrence of integer e.
append e: Insert integer e at the end of the list.
sort: Sort the list.
pop: Pop the last element from the list.
reverse: Reverse the list.

Initialize your list and read in the value of n followed by n lines of commands where each command will be of the 7 types listed above. Iterate through each command in order and perform the corresponding operation on your list.

Input Format:
The first line contains an integer, , denoting the number of commands.
Each line  of the  subsequent lines contains one of the commands described above.

Constraints:
The elements added to the list must be integers.

Output Format:
For each command of type print, print the list on a new line.

Sample Input:
12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print

Sample Output :
[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]
</pre>

<pre><code>
if __name__ == '__main__':
    arr = []
    N = int(input())

    for i in range(N):
        command = input()
        commandComponents = command.split(" ")
        command = commandComponents[0]
        if command == "insert":
            arg1 = int(commandComponents[1])
            arg2 = int(commandComponents[2])
            arr.insert(arg1, arg2)
        elif command == "remove":
            arg1 = int(commandComponents[1])
            arr.remove(arg1)
        elif command == "append":
            arg1 = int(commandComponents[1])
            arr.append(arg1)
        elif command == "sort":
            arr.sort()
        elif command == "pop":
            arr.pop()
        elif command == "reverse":
            arr.reverse()
        else:
            print(arr)
</code></pre>