public class Main {

    static void solidSquare(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowSquare(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if ((i == 0 || i == line - 1) || (j == 0 || j == line - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    static void numberSquare(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= line; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void solidRectangle(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if ((i == 0 || i == row - 1) || (j == 0 || j == column - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void rightHalfTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void leftHalfTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedRightHalfTriangle(int line) {
        for (int i = line; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedLeftHalfTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void floydTriangle(int line) {
        int n = 1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
    }

    static int factorial(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n *= i;
        }
        return n;
    }

    static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    static void pascalTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }
            System.out.println();
        }
    }

    static void binaryTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    static void pyramid(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}