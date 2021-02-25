# num = input("Please enter a number: ")

# if (int(num) % 2 == 0):
#     print(num, "is an even number")
# else:
#     print(num, "is an odd number")


#####
# name = "Sylvia"
# age = 18

# print(name)
# print(age)
# z = name,age
# print(z)


#####
# import random

# user_input = 0
# rand_num = 1

# while(int(user_input) != rand_num):
#     #print("The number you entered is ", user_input , "and the random number is ", rand_num)
#     user_input = input("Please enter any number of your choice: ")
#     rand_num = random.randint(10,15)

# print("You have guessed the right number now.")

#####
num_list = [1, 4, 9, 16, 25]
even_num = list(filter(lambda x: x%2 == 0, num_list))
print(even_num)

# for i in num_list:
#     if i % 2 == 0:
#         print(i)
#     else:
#         print()


#######
age = 5
calculated_years = 0
i = 0

while i < age:
    i += 1
    calculated_years += i

print("Calculated years is", calculated_years)

num_months = calculated_years * 12
num_days = calculated_years * 365
hours = num_days * 24

print(calculated_years, "years is", num_months, "months, ", num_days, "days and ", hours, "hours")