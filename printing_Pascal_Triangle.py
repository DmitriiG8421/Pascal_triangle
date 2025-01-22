# number_of_ones = int(input("Type a number: "))
number_of_ones = 3

def doSomething(j):
    return 1

print("\n")
listOfLists = []

for i in range(number_of_ones):

    list1 = [] 
    for j in range(i+1):
        list1.append(doSomething(j))   

    #Second Option   list = [doSomething(j) for j in range(i+1)]   
    listOfLists.append(list1)



lenths = []
for i in listOfLists:
    lenths.append(len(i))
max_width = max(lenths)*2-1




for i in listOfLists:
    x = list(map(lambda a : str(a), i))
    print("_".join(x).center(max_width," "))


print("End")








