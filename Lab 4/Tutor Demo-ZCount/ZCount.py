def zCount(s):
    count = 0
    for c in s:
        if c == 'z':
            count = count + 1
    return count

if __name__ == "__main__":
    print('z count = %d' %zCount(input('String: ')))
