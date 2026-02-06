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

    static void invertedPyramid(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            for (int j = line - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void holloWPyramid(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1; j < i * 2 + 1; j++) {
                if (j == i * 2 || i == line - 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void invertedHollowPyramid(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (line - i) - 1; k++) {
                if (k == 0 || k == 2 * (line - i) - 2 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void diamond(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            for (int j = line - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollowDiamond(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < i; j++) {
                if ((j + 1) == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                if (j == line) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = line - 1; j > i; j--) {
                if (j == (i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void hourglass(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = line; j > i; j--) {
                System.out.print("*");

            }
            for (int j = line - 1; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i < line; i++) {
            for (int j = line; j > i + 1; j--) {
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

    static void hollowHourglass(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = line; j > i; j--) {
                if (j == line || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = line - 1; j > i; j--) {
                if (j == i + 1 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i < line; i++) {
            for (int j = line; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || i == line - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j < i + 1; j++) {
                if (j == i || i == line - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    static void arrowPatternLeft(int line) {
        for (int i = 0; i < line; i++) {
            System.out.println();
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
        }

        for (int i = 0; i <= line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void arrowPatternRight(int line) {
        for (int i = 0; i <= line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void doubleSidedArrow(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = line * 2; j > (i * 2); j--)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            for (int j = 0; j < (i * 2) - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i * 2; j++)
                System.out.print(" ");
            for (int j = line; j > i; j--)
                System.out.print("*");
            for (int j = line * 2; j > (i * 2) + 1; j--)
                System.out.print(" ");
            for (int j = line; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
    
    static void butterfly(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = line * 2; j > (i * 2) + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i < line; i++) {
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void hollowButterfly(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j + 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = line * 2; j > (i * 2) + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (i == j + 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for (int i = 1; i < line; i++) {
            for (int j = line; j > i; j--) {
                if (j == line || i == j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(" ");
            }
            for (int j = line; j > i; j--) {
                if (j == line || i == j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
    static void sinWave(int row, int col) {
        int period = 2 * (row - 1);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int k = j % period;
                if (k == i || k == period - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
   static void heart(int line) {
        for (int i = line / 2; i <= line; i += 2) {
            for (int j = 1; j < line - i; j += 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= line - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int i = line; i >= 0; i--) {
            for (int j = i; j < line; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        butterfly(5);
        
    }
}