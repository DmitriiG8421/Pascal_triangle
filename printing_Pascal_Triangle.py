number_of_ones = int(input("Type a number: "))

def doSomething(j):
    return 1

print("\n")
listOfLists = []

for i in range(number_of_ones):

    list = [] 
    for j in range(i+1):
        list.append(doSomething(j))   

    #Second Option   list = [doSomething(j) for j in range(i+1)]   
    listOfLists.append(list)

    
print(listOfLists)



