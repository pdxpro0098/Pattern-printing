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

    public static void main(String[] args) {
        numberSquare(5);
    }
}