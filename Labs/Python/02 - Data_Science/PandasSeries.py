import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import datetime
import csv

with open('AAPL-2016.csv', newline='') as a:
    reader = csv.DictReader(a)
    shares_data2016 = np.empty((0, 2))
    for row in reader:
        oneRow = np.array([[row['Date'], row['Volume']]])
        shares_data2016 = np.append(shares_data2016, oneRow, axis=0)

print(shares_data2016)
date = [datetime.datetime.strptime(x,'%Y-%m-%d') for x in shares_data2016[:, 0]]
data = pd.Series(np.float64(shares_data2016[:, 1]), index=date)
data.plot()
plt.show()
