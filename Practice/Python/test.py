number_list = [1, 2, 3, -4, 5, 6, -7, 8]
filtered = list(filter(lambda x: x < 0, number_list))
print(filtered)


def fibonacci_generator():
    a = b = 1
    while True:
        yield a
        a, b = b, a+b


fib = fibonacci_generator()

for i in fib:
    if i > 500:
        break
    else:
        print('Generated: ', i)