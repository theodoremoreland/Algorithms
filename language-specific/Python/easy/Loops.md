<pre>
Task
Read an integer N. For all non-negative integers i < N, print i**2. See the sample for details.

Input Format:
The first and only line contains the integer, .

Output Format:
Print  lines, one corresponding to each .

Sample Input:
5

Sample Output:
0
1
4
9
16
</pre>

<pre><code>
if __name__ == '__main__':
    n = int(raw_input())

for i in range(n):
    if n < 1 or n > 20:
        pass
    else:
        print(i * i)
</code></pre>