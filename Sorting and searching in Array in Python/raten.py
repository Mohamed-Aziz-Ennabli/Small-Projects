def iterativeSearch(array, num):
    index = -1 
    iteration = 0 
    n = len(array)
    for i in range(n):
        iteration += 1 
        if array[i] == num :
            index = i 
            break  
    return iteration, index

def binarySearch(array, num):
    a=0 
    b= len(array)-1
    counter = 0 
    while a!= b : 
        counter += 1 
        m = (a+b)//2
        if num <= array[m] : 
            b = m 
        else : 
            a = m +1 
    if (array[a]== num) : 
        return counter ,b
    else : 
        return counter , -1
    
def sumArray(array):
    sum = 0 
    for werte in array : 
        sum += werte  # SUM = Sum + werte 
    return sum 
     
def sumArraySorted(array):
    array.sort()
    sum = sumArray(array)
    '''sum = 0 
    for werte in array : 
        sum += werte '''
    return sum
