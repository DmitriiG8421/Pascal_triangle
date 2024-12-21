number_of_ones = input("Type a number: ")
print("\n")
list = [[1]]
for i in range(number_of_ones):
    a = [list[int(i)] + 1]
    list.append(a)
print(list)