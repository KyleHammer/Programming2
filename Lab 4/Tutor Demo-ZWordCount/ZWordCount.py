def containsZ(word):
    return ('z' in word)

# Have to give different name for functions in python
def zWord(sentence):
    count = 0
    # split function in python defaultly ignore all space
    # (' ') can only split one space
    # (' +') doesn't work in python
    for word in sentence.split():
        if containsZ(word):
            count = count + 1
    return count

def zWords(sentences):
    sum1 = 0
    for sentence in sentences:
        sum1 += zWord(sentence.lower())
    return sum1

if __name__ == "__main__":
    sentences = ["green ideas Zleep furiously",
                 "a zebra graZed",
                 "zorro WAZ zore",
                 "I feel snoozy"]
    for sentence in sentences:
        print(sentence)
    
    print("Words containing a 'z' = %d" %zWords(sentences))
