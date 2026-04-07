import pandas as pd

data = pd.read_csv("Smartphone_Usage_Productivity_Dataset_50000.csv")

numeric_data = data.select_dtypes(include=['int64','float64'])

pearson_corr = numeric_data.corr(method='pearson')

spearman_corr = numeric_data.corr(method='spearman')

print("Pearson Correlation Matrix:\n")
print(pearson_corr)

print("\nSpearman Correlation Matrix:\n")
print(spearman_corr)