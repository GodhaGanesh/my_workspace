import pandas as pd
import matplotlib.pyplot as plt

data = pd.read_csv('AI_Student_Life_india.csv')

data.plot(kind='bar')

plt.show()