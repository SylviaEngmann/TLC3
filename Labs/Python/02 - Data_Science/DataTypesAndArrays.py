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

# print(shares_data2017)
# print(np.ndim(shares_data2017))
# print(np.shape(shares_data))


with open('AAPL-2016.csv', newline='') as a:
    reader = csv.DictReader(a)
    shares_data2016 = np.empty((0, 6))
    for row in reader:
        oneRow = np.array([[row['Open'], row['High'],
                            row['Low'], row['Close'],
                            row['Adj Close'],
                            row['Volume']]], dtype=float)
        shares_data2016 = np.append(shares_data2016, oneRow, axis=0)

# print(shares_data2016)
# print(np.ndim(shares_data2016))
# print(np.shape(shares_data2016))

# total_vol2017 = np.sum(shares_data2017)
# total_vol2016 = np.sum(shares_data2016)
total_vol2017 = shares_data2017.sum(axis=0)
total_vol2016 = shares_data2016.sum(axis=0)
# print(total_vol2017)
# print(total_vol2016)

print("Difference in volume between 2016 and 2017 is : ", total_vol2016 - total_vol2017)
change = total_vol2016 - total_vol2017
change_array = np.array(total_vol2016 - total_vol2017)
print(change_array.sum(axis=0))

# np.set_printoptions(formatter={'float': '{: 6.2f}'.format})
# np.set_printoptions()

combined_years = np.array(np.concatenate((shares_data2016, shares_data2017)))
print(combined_years)

np.savetxt("combined_years.txt", combined_years, fmt='%10.2f', delimiter=',')