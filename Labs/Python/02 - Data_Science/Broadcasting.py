import numpy as np
import csv

# with open('AAPL-2016.csv', newline='') as a:
#     reader = csv.DictReader(a)
#     shares_data2016 = np.empty((0, 6))
#     for row in reader:
#         oneRow = np.array([[row['Open'], row['High'],
#                             row['Low'], row['Close'],
#                             row['Adj Close'],
#                             row['Volume']]], dtype=float)
#         shares_data2016 = np.append(shares_data2016, oneRow, axis=0)
#
# projection = np.array(shares_data2016[:, [0, 3]])
# print(projection)

with open('AAPL-2017.csv', newline='') as a:
    reader = csv.DictReader(a)
    shares_data2017 = np.empty((0, 6))
    for row in reader:
        oneRow = np.array([[row['Open'], row['High'],
                            row['Low'], row['Close'],
                            row['Adj Close'],
                            row['Volume']]], dtype=float)
        shares_data2017 = np.append(shares_data2017, oneRow, axis=0)

projection = np.array(shares_data2017[:, [0, 3]])
print(projection)