import pandas as pd
import numpy as np

data = {
    'A': [1, 2, 3],
    'B': [4, 5, 6]
}

df = pd.DataFrame(data)

df_array = df.to_numpy()
print("DataFrame:")
print(df)
print("\nConverted to NumPy array:")
print(df_array)

series = pd.Series([10, 20, 30, 40])

series_array = series.to_numpy()
print("\nSeries:")
print(series)
print("\nConverted to NumPy array:")
print(series_array)