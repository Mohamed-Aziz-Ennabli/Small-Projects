from raten import *
from summe import *

array = list(range(32))
num1 = 40 
num2 = 3
#Iterative Search  : 
iteration , index = iterativeSearch(array, num1)
if index != -1 : 
    print("Iteration: "+str(iteration)+", Result: " + str(index))
else : 
    print("Iteration: "+str(iteration), " Wert nicht exisitiert")

iteration , ind2 = iterativeSearch(array, num2)
if ind2 != -1 : 
    print("Iteration: "+str(iteration)+", Result: " + str(ind2))
else : 
    print("Iteration: "+str(iteration), " Wert nicht exisitiert")


#binary Search : 
iteration , index1= binarySearch(array, num1)
if index1 != -1 : 
    print("Iteration: "+str(iteration)+", Result: " + str(index1) )
else : 
    print("Iteration: "+str(iteration), " Wert nicht exisitiert")
iteration , ind1 = binarySearch(array, num2)
if ind1 != -1 :
    print("Iteration: "+str(iteration)+", Result: "+ str(ind1) )
else : 
    print("Iteration: "+str(iteration), " Wert nicht exisitiert")
    
#sorting array:   
array = [2*(10**8)] + [10**-7]*(10**7)

result_unsorted = sumArray(array)
result_sorted = sumArraySorted(array)
print("Ergibnis SortedArray : " ,result_sorted)
print("Ergibnis UnSortedArray : " ,result_unsorted)
print("Differenz : ", (result_sorted- result_unsorted))