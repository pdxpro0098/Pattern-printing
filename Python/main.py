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


if __name__ == "__main__":
    numberSquare(5)
