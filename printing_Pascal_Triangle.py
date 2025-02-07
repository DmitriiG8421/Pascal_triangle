


number_of_rows = int(input("Type a number of rows: "))
print("\n")
pascaltriangle= [[1]]


#    1
#   1 1
#  1 2 1
# 1 3 3 1

for i in range(1,number_of_rows):
    previous_row = pascaltriangle[i-1]
    next_row = [1]

    for j in range(1,len(previous_row)):
        next_row.append(previous_row[j-1]+previous_row[j])
    
    next_row.append(1)
    pascaltriangle.append(next_row)



# for i in range(number_of_ones):
#     list1 = [] 
#     for j in range(i+1):
#         list1.append(doSomething(j))   
#     listOfLists.append(list1)



lenthslist= []
for i in pascaltriangle:
    lenthslist.append(len(i))
max_width = max(lenthslist)*2-1

for i in pascaltriangle:
    x = list(map(lambda a : str(a), i))
    print(" ".join(x).center(max_width," "))


print("End")








