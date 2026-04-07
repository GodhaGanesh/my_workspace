data = {
    'studyHours' : [2, 4, 6, 8, 10],
    'marks' : [50, 55, 65, 70, 80]
}
meanSH = sum(data['studyHours']) / len(data['studyHours'])
meanM = sum(data['marks']) / len(data['marks'])
r = (sum((data['studyHours'][i] - meanSH) * (data['marks'][i] - meanM) for i in range(len(data['studyHours'])))) / (sum((data['studyHours'][i] - meanSH)**2 for i in range(len(data['studyHours'])))*sum((data['marks'][i] - meanM)**2 for i in range(len(data['studyHours']))))**0.5
print("Pearson Correlation Coefficient:", r)
studyHours = [2, 4, 6, 8, 10]
marks = [50, 55, 65, 70, 80]

n = len(studyHours)

def rank(data):
    sorted_data = sorted((value, index) for index, value in enumerate(data))
    ranks = [0]*len(data)
    
    for rank, (value, index) in enumerate(sorted_data, start=1):
        ranks[index] = rank
        
    return ranks

rank_x = rank(studyHours)
rank_y = rank(marks)

d2_sum = 0
for i in range(n):
    d = rank_x[i] - rank_y[i]
    d2_sum += d**2

spearman = 1 - (6 * d2_sum) / (n * (n**2 - 1))

print("Spearman Rank Correlation:", spearman)