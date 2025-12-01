def solidSquare(line):
    for _ in range(line):
        print("*" * line)


def hollowSquare(line):
    for i in range(line):
        for j in range(line):
            if i in (0, line - 1) or j in (0, line - 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        print()


def numberSquare(line):
    for i in range(line):
        print(str(i) * line)


def solidRectangle(row, column):
    for _ in range(row):
        print("*" * column)


def hollowRectangle(row, column):
    for i in range(row):
        for j in range(column):
            if i in (0, row - 1) or j in (0, column - 1):
                print("*", end=" ")
            else:
                print(" ", end=" ")
        print()


def rightHalfTriangle(line):
    for i in range(line):
        for _ in range(i+1):
            print("*", end=" ")
        print()


def leftHalfTriangle(line):
    for i in range(line):
        for _ in reversed(range(line-i)):
            print(" ", end=" ")
        for _ in range(i+1):
            print("*", end=" ")
        print()


def invertedRightHalfTriangle(line):
    for i in reversed(range(line)):
        for _ in reversed(range(i+1)):
            print("*", end=" ")
        print()


def invertedLeftHalfTriangle(line):
    for i in range(line):
        for _ in reversed(range(line-i)):
            print("_", end=" ")
        for _ in range(i+1):
            print("*", end=" ")
        print()


if __name__ == "__main__":
    invertedLeftHalfTriangle(5)
