import pandas as pd
import matplotlib.pyplot as plt

myDataFrame = pd.read_csv('AAPL-2017-copy.csv')
print(myDataFrame)
df = pd.DataFrame(index=myDataFrame["Date"])
df.plot()
plt.show()
