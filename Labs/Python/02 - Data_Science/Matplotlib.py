import pandas as pd
import matplotlib.pyplot as plt

myDataFrame = pd.read_csv('AAPL-2017-copy.csv')
print(myDataFrame)
df = pd.DataFrame(index=myDataFrame["Date"])
df = pd.DataFrame(myDataFrame.head(40))

#x =
df.plot()
plt.show()