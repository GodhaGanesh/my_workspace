def is_palindrome(num):
    return str(num) == str(num)[::-1]

def print_n_palindromes(n):
    count = 0
    num = 0
    while count < n:
        if is_palindrome(num):
            print(num)
            count += 1
        num += 1

n = int(input("Enter the number of palindrome numbers to print: "))
print_n_palindromes(n)