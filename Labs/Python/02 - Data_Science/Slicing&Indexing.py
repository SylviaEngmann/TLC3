import numpy as np
import csv

with open('AAPL-2017.csv', newline='') as a:
    reader = csv.DictReader(a)
    shares_data2017 = np.empty((0, 6))
    for row in reader:
        oneRow = np.array([[row['Open'], row['High'],
                            row['Low'], row['Close'],
                            row['Adj Close'],
                            row['Volume']]], dtype=float)
        shares_data2017 = np.append(shares_data2017, oneRow, axis=0)


january = shares_data2017[0:20]
print(january)

january[0][5] = 100
print(january[0][5])
print(shares_data2017[0][5])

maxPrice = shares_data2017.max(axis=0)
print(maxPrice)

highAndLow = shares_data2017[:, [1, 2]]
print(highAndLow[0:5])