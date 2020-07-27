def mutate_string(string, position, character):
    s = list(string)
    s[position] = character
    s = "".join(s)
    return s
