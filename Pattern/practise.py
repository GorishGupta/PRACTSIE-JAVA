rows = 4
for i in range(rows, 0, -1):
    # For printing spaces
    for j in range(rows - i):
        print(" ", end="")
    # For printing stars
    for j in range(2 * i - 1):
        print("*", end="")
    print()  # Move to the next line

#For printing lower hollow pyramid 
for i in range(2, rows + 1):
    # Printing spaces
    for j in range(rows - i):
        print(" ", end="")
    # Printing stars and spaces
    for j in range(2 * i - 1):
        if i == rows or j == 0 or j == 2 * i - 2:  # Base row or edges or end of the pyramid
            print("*", end="")
        else:
            print(" ", end="")
    print()  # Move to the next line