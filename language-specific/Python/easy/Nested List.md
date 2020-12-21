<pre>
Given the names and grades for each student in a Physics class of N students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.

Input Format:
The first line contains an integer, N , the number of students.
The 2N subsequent lines describe each student over 2 lines; the first line contains a student's name, and the second line contains their grade.
There will always be one or more students having the second lowest grade.

Output Format:
Print the name(s) of any student(s) having the second lowest grade in Physics; if there are multiple students, order their names alphabetically and print each one on a new line.

Sample Input:
5
Harry
37.21
Berry
37.21
Tina
37.2
Akriti
41
Harsh
39

Sample Output:
Berry
Harry
</pre>

<pre><code>
if __name__ == '__main__':
    students = []
    second_worst = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])

students = sorted(students, key=lambda item: item[1])

worst = students[0][1]

[students.remove(i) for i in students[:] if i[1] == worst]

[second_worst.append(i[0]) for i in students if i[1] == students[0][1]]

second_worst.sort()

for name in second_worst:
    print(name)
</code></pre>