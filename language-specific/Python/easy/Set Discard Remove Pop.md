<pre><code>
import sys
n = int(input())
s = set(map(int, input().split()))

data = sys.stdin.readlines()
commandNum = data[0].rstrip('\n')

for line in data[1:]:
    line = line.split()
    command = line[0]
    if (command == "pop"):
        s.pop()
    elif (command == "remove"):
        s.remove(int(line[1]))
    elif (command == "discard"):
        s.discard(int(line[1]))
    else:
        continue
print(sum(s))
</code></pre>