<pre>
Kevin and Stuart want to play the 'The Minion Game'.

Game Rules
Both players are given the same string, S.
Both players have to make substrings using the letters of the string S.
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.

Scoring
A player gets +1 point for each occurrence of the substring in the string S.

For Example:
String S = BANANA
Kevin's vowel beginning word = ANA
Here, ANA occurs twice in BANANA. Hence, Kevin will get 2 Points.
</pre>

<pre><code>
def minion_game(string):
    stuart = 0
    kevin = 0  # scores on vowel
    vowels = "aeiou"
    end = len(string)

    for idx, letter in enumerate(string):

        if (letter.lower() not in vowels):
            stuart += (end - idx)
        else:
            kevin += (end - idx)

    if (stuart > kevin):
        winner = "Stuart " + str(stuart)
    elif (kevin > stuart):
        winner = "Kevin " + str(kevin)
    else:
        winner = "Draw"

    print(winner)
</code></pre>