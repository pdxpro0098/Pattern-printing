public class pattern {

    static void printSolidSquare(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void printSolidRectangle(int rows, int columns) {
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void rightHalfTriangle(int lines) {
        for (int i = 0; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void reverseRightHalfTriangle(int lines) {
        for (int i = lines; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void leftHalfTriangle(int lines) {
        for (int i = lines; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = lines; k > i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void reverseLeftHalfTriangle(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = lines; k > i; k--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void printPyramid(int lines) {
        for (int i = lines; i >= 0; i--) {
            for (int l = i; l > 0; l--) {
                System.out.print(" ");
            }
            for (int k = lines; k > i; k--) {
                System.out.print("*");
            }
            for (int j = lines - 1; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void printReversedPyramid(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = lines; j > i; j--) {
                System.out.print("*");
            }
            for (int l = lines - 1; l > i; l--) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

    static void printDiamond(int lines) {
        int _lines = (lines / 2) + 1;
        for (int i = 0; i < _lines; i++) {
            for (int j = _lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int _i = 0; _i < _lines; _i++) {
            for (int _k = 0; _k < _i; _k++) {
                System.out.print(" ");
            }
            for (int _j = _lines; _j > _i; _j--) {
                System.out.print("*");
            }
            for (int l = _lines - 1; l > _i; l--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void printEmptySquare(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines; j++) {
                if (i == 0 || i == lines - 1) {
                    System.out.print("*");
                }
                if (i > 0 && i < lines - 1) {
                    if (j == 0 || j == lines - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }

    static void printEmptyDiamond(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print("*");
            }
            for (int k = -1; k < i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = lines; j > i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i < lines; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = lines - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = lines; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printEmptyDiamond(7);
    }
}