import pandas as pd

df = pd.read_csv("AI_Student_Life_india.csv")

# target_column = "Impact_on_Grades"
target_column = "Satisfaction_Level"

if target_column not in df.columns:
    print("Column not found in dataset")
    exit()

counts = df[target_column].value_counts()
percentages = df[target_column].value_counts(normalize=True) * 100

print("\nClass Distribution (Counts):")
print(counts)

print("\nClass Distribution (%):")
print(percentages)

max_percent = percentages.max()

print("\nAnalysis:")
if max_percent > 70:
    print("Dataset is IMBALANCED")
elif max_percent > 60:
    print("Slightly Imbalanced Dataset")
else:
    print("Dataset is BALANCED")