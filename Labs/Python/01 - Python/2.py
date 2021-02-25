# test = 5
# test1 = 5000 * 50000000
# test2 = 'j'
# test3 = 1j
# test4 = ("l",)
# test5 = [1]
# test6 = None

# print(type(1j))

######
# a = 0
# b = 1
# count = 0
# fib_list = []

# while count < 20:
#     results = a + b
#     fib_list.append(results)
#     a = b
#     b = results
#     count += 1

# print(fib_list)

#####
# name = "Sylvia"
# #print(name[-1])

# for i in name:
#     if name.index(i) != (name.__len__()-1):
#         print(i+":", end= "")
#     else:
#         print(i)


# #####
# user_input = []
# print("Please enter 10 numbers between 1 and 8")

# for i in range(1,11):
#     user_input.append(int(input('Next number: ')))

# print(user_input)
# print(user_input.count(5))
# #NB. Put a checker for when the user attempts to add a number less than 1 or greater than 8


#####
num_list = [1, 4, 9, 16, 25]
odd_num = [x for x in num_list if x%2 !=0]
print(odd_num)
