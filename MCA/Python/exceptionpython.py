try:
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    
    result = num1 / num2
    
except ValueError:
    print("Error: Please enter valid numeric values.")

except ZeroDivisionError:
    print("Error: You cannot divide by zero.")

else:
    print(f"Result: {result}")

finally:
    print("Division operation complete.\n")


try:
    print("\n--- List Access ---")
    sample_list = [10, 20, 30, 40, 50]
    index = int(input("Enter an index (0-4): "))
    
    print(f"Element at index {index}: {sample_list[index]}")

except ValueError:
    print("Error: Please enter a valid integer index.")

except IndexError:
    print("Error: Index out of range.")

finally:
    print("List access operation complete.\n")

try:
    print("\n--- File Reader ---")
    filename = input("Enter filename to open: ")
    
    with open(filename, "r") as file:
        content = file.read()
        print("\nFile Content:")
        print(content)

except FileNotFoundError:
    print("Error: File not found.")

except PermissionError:
    print("Error: Permission denied.")

finally:
    print("File operation complete.\n")