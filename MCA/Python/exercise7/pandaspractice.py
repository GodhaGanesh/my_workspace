# import pandas as pd

# data = {
#     "Students": ['Ganesh', 'Shyam', 'Shahsi', 'Teja', 'Siva', 'Thalapathy'],
#     "Marks": [0, 89, 99, 90, 100, 108]
# }

# df = pd.DataFrame(data)

# arr = df.to_numpy()

# print(df)
# print(arr)

import pandas as pd

info = pd.Series(['Jana', 'Gana', 'Mana'])

arr = info.to_numpy()

print(info)
print(arr)