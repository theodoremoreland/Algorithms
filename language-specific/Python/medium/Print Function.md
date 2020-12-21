<pre>
Read an integer N.

Without using any string methods, try to print the following:
123...N
Note that "..." represents the values in between.

Input Format:
The first line contains an integer .

Output Format:
Output the answer as explained in the task.

Sample Input:
3

Sample Output:
123
</pre>

<pre><code>
from __future__ import print_function

if __name__ == '__main__':
    n = int(raw_input())

hey = ""

for i in range(n):
    i = str(i + 1)
    hey = hey + i
print(hey)
</code></pre>