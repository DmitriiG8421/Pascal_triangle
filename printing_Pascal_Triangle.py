number_of_ones = int(input("Type a number: "))
print("\n")
list = [[1]]
print(list)
for i in range(number_of_ones):
    a = [list[i][0] + 1]
    list.append(a)
    print(list)
