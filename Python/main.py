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
        print("*" * i, end=" ")
        print()


def leftHalfTriangle(line):
    for i in range(line):
        for _ in reversed(range(line - i)):
            print(" ", end=" ")
        for _ in range(i + 1):
            print("*", end=" ")
        print()


def invertedRightHalfTriangle(line):
    for i in reversed(range(line)):
        for _ in reversed(range(i + 1)):
            print("*", end=" ")
        print()


def invertedLeftHalfTriangle(line):
    for i in range(line):
        for _ in reversed(range(line - i)):
            print("_", end=" ")
        for _ in range(i + 1):
            print("*", end=" ")
        print()


def floydTriangle(line):
    i = 1
    for j in range(line):
        for _ in range(j + 1):
            print(i, end=" ")
            i += 1
        print()


def pascalTriangle(line):

    def factorial(num):
        fact = 1
        for i in range(1, num + 1):
            fact = fact * i
        return int(fact)

    def nCr(n, r):
        return int(factorial(n) / (factorial(r) * factorial(n - r)))

    for i in range(line):
        for _ in reversed(range(line - i)):
            print("_", end="")
        for j in range(i + 1):
            print(nCr(i, j), end=" ")
        print()


def binaryTriangle(line):
    for i in range(line):
        for j in range(i + 1):
            if (i + j) % 2 == 0:
                print("0", end=" ")
            else:
                print("1", end=" ")
        print()


def pyramid(line):
    for i in range(line):
        for _ in reversed(range(line - i)):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        for _ in range(i + 1):
            print("*", end="")
        print()


def invertedPyramid(line):
    for i in range(line):
        print(" " * i, end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        for _ in reversed(range(line - i - 1)):
            print("*", end="")
        print()


def hollowPyramid(line):
    for i in range(line):
        for j in reversed(range(line - i)):
            print(" ", end=" ")
        print("*", end=" ")

        for j in range(1, i * 2 + 1):
            if j == i * 2 or i == line - 1:
                print("*", end=" ")
            else:
                print(" ", end=" ")
        print()


def invertedHollowPyramid(line):
    for i in range(line):
        for _ in range(2 * i + 1):
            print(" ", end="")
        for k in range(2 * (line - i) - 1):
            if k == 0 or k == 2 * (line - i) - 2 or i == 0:
                print("* ", end="")
            else:
                print("  ", end="")
        print()


def diamond(line):
    for i in range(line):
        for _ in reversed(range(line - i)):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        for _ in range(i - 1):
            print("*", end="")
        print()

    for i in range(line):
        print(" " * i, end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        for _ in reversed(range(line - i - 1)):
            print("*", end="")
        print()


def hollowDiamond(line):
    for i in range(line):
        for j in range(line - i):
            print(" ", end="")
        for j in range(2 * i):
            if j == 1 or j == 2 * i - 1:
                print("*", end="")
            else:
                print(" ", end="")
        print()

    for i in reversed(range(line - 1)):
        for j in range(line - i):
            print(" ", end="")
        for j in range(2 * i):
            if j == 1 or j == 2 * i - 1:
                print("*", end="")
            else:
                print(" ", end="")
        print()


def hourglass(line):
    for i in range(line):
        print(" " * i, end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        for _ in reversed(range(line - i - 1)):
            print("*", end="")
        print()
    for i in range(1, line):
        for _ in reversed(range(line - i - 1)):
            print(" ", end="")
        print("*" * (i + 1), end="")
        print("*" * (i), end="")
        print()


def hollowHourGlass(line):
    for i in range(line):
        for j in range(i):
            print(" ", end="")

        for j in reversed(range(line - i)):
            if j == line - i - 1 or i == 0:
                print("*", end="")
            else:
                print(" ", end="")

        for j in reversed(range(line - i - 1)):
            if j == 0 or i == 0:
                print("*", end="")
            else:
                print(" ", end="")
        print()

    for i in range(line):
        for j in reversed(range(line - i - 1)):
            print(" ", end="")
        for j in range(i + 1):
            if j == 0 or i == line - 1:
                print("*", end="")
            else:
                print(" ", end="")
        for j in range(1, i + 1):
            if j == i or i == line - 1:
                print("*", end="")
            else:
                print(" ", end="")
        print()


def arrowPatternLeft(line):
    for i in range(line):
        print()
        for _ in reversed(range(line - i)):
            print(" ", end="")
        for _ in reversed(range(line - i)):
            print("*", end="")

    for i in range(line):
        for _ in range(i):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        print()


def arrowPatternRight(line):
    for i in range(line):
        for _ in range(i):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        print()

    for i in range(line):
        for _ in reversed(range(line - i)):
            print(" ", end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        print()


def doubleSidedArrow(line):
    for i in range(line):
        for _ in range(line * 2, i * 2, -1):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        for _ in range((i * 2) - 1):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        print()

    for i in range(line):
        for _ in range((i * 2)):
            print(" ", end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        for _ in range(line * 2, (i * 2) + 1, -1):
            print(" ", end="")
        for _ in range(line - i):
            print("*", end="")
        print()


def butterfly(line):
    for i in range(line):
        for _ in range(i):
            print("*", end="")
        for _ in range(line * 2, i * 2, -1):
            print(" ", end="")
        for _ in reversed(range(i)):
            print("*", end="")
        print()

    for i in range(2, line):
        for _ in range(line, i, -1):
            print("*", end="")
        for _ in range(0, i * 2):
            print(" ", end="")
        for _ in reversed(range(line - i)):
            print("*", end="")
        print()


def sinWave(row, col):
    period = 2 * (row - 1)
    for i in range(row):
        for j in range(col):
            k = j % period
            if k == i or k == period - i:
                print("*", end="")
            else:
                print(" ", end="")
        print()
	

def heart(line):
    for i in range(line // 2, line, 2):
        for _ in range(1, line - i, 2):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        for _ in range((line - 1) - i):
            print(" ", end="")
        for _ in range(i):
            print("*", end="")
        print("")

    for i in reversed(range(line)):
        for _ in range(line - i - 1):
            print(" ", end="")
        for _ in range(i * 2):
            print("*", end="")
        print("")

if __name__ == "__main__":
    butterfly(10)
