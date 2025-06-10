def printSquare(lines):
    for i in range(lines):
        for j in range(lines):
            print("*", end="")
        print("")


def rightHalfTriangle(lines):
    for i in range(1, lines + 1):
        print("*" * i)


