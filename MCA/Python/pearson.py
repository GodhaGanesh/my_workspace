import pandas as pd
data = {
    'studyHours' : [2, 4, 6, 8, 10],
    'marks' : [50, 55, 65, 70, 80]
}
db = pd.DataFrame(data)
print("Pearson")
print(db.corr(method = 'pearson'))
print('\nSpearman')
print(db.corr(method = 'spearman'))