<pre><code>
aSize = input()
aList = list(map(int, input().split()))
bSize = input()
bList = list(map(int, input().split()))
a = set(aList)
b = set(bList)
onlyInA = a.difference(b)  # Values which exist in a but not in b
onlyInB = b.difference(a)  # Values which exist in b but not in a
onlyInOneOrTheOther = list(onlyInA.union(onlyInB))
onlyInOneOrTheOther.sort()
[print(num) for num in onlyInOneOrTheOther]
</code></pre>