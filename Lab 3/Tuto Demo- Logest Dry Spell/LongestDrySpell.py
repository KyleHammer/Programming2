if __name__ == '__main__':
    max1 = 0
    count = 0
    
    rainfall = float(input('Rainfall: '))
    while rainfall != -1:
        if rainfall == 0:
            count = count + 1
        else:
            if count > max1:
                max1 = count             
            count = 0
        rainfall = float(input('Rainfall: '))
    
    if count > max1:
        max1 = count
    print('Longest dry spell = %d' %max1)