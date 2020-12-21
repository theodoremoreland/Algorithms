import sys
data = sys.stdin.readlines()
N = data[0].rstrip('\n')
s = set()
for line in data[1:]:
    s.add(line.rstrip('\n'))
print(len(s))
