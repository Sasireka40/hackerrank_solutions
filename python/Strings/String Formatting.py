def print_formatted(number):
    # your code goes here
    space = len(bin(number)[2:])
    for i in range(1, number+1):
        print(f"{i:{space}d} {i:{space}o} {i:{space}X} {i:{space}b}")

