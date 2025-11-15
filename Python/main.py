def solidSquare(line):
    for _ in range(line):
        print("*" * line)


def hollowSquare(line):
    for i in range(line):
        for j in range(line):
            if ((i == 0 or i == line - 1) or (j == 0 or j == line - 1)):
                print("*", end="")
            else:
                print(" ", end="")
        print()


if __name__ == "__main__":
    hollowSquare(5)
