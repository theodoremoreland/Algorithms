<pre><code>
def swap_case(s):
    swapped = ""
    for letter in s:
        if letter == letter.upper():
            letter = letter.lower()
        else:
            letter = letter.upper()
        swapped += letter
    return swapped
</code></pre>