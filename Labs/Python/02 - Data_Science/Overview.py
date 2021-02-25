import numpy as np
import timeit

myArray = range(1000)
[x ** 2 for x in myArray]

print(timeit.timeit(setup='myArray = range(1000)', stmt='[x ** 2 for x in myArray]', number=1000))

otherArray = np.arange(1000)
otherArray ** 2

print(timeit.timeit(setup='otherArray = range(1000)', stmt='[x ** 2 for x in otherArray]', number=1000))
