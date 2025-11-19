def solidSquare(line):
    for _ in range(line):
        print("*" * line)


def hollowSquare(line):
    for i in range(line):
        for j in range(line):
            if i in (0, line - 1) or j in (0, line - 1):
                print("*", end="")
            else:
                print(" ", end="")
        print()


def numberSquare(line):
    for i in range(line):
        print(str(i) * line)


def solidRectangle(row, column):
    for _ in range(row):
        print("*" * column)


if __name__ == "__main__":
    solidRectangle(5, 2)
