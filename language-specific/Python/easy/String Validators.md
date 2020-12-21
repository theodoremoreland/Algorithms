<pre><code>
if __name__ == '__main__':
    s = input()
    checks = [".isalnum()", ".isalpha()", ".isdigit()",
              ".islower()", ".isupper()"]
    for check in checks:
        statement = "False"
        for char in s:
            if (eval("'"+char+"'"+check)):
                statement = "True"
                break
        print(statement)
</code></pre>