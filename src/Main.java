import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ØVING 6 OPPGAVE 3");

        int[][] inputMatrix = null;
        printMenu(1);
        int choice = new Scanner(System.in).nextInt();
        boolean exit = true;
        if (choice < 2) {
            exit = false;
            inputMatrix = newMatrix();
        }
        Matrix A = new Matrix(inputMatrix);

        while (!exit) {
            printMenu(2);
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    printMatrix(A.add(newMatrix()));
                    break;
                case 2:
                    printMatrix(A.mul(newMatrix()));
                    break;
                case 3:
                    printMatrix(A.trans());
                    break;
                default:
                    exit = true;
                    break;
            }

        }

        System.out.println("Program exit");
    }
    public static void printMenu(int menuType) {
        switch (menuType) {
            case 1:
                System.out.println("1. New Matrix");
                System.out.println("2. Exit");
                break;
            case 2:
                System.out.println("1. Add matrix to matrix");
                System.out.println("2. Multiply matrix with matrix");
                System.out.println("3. Transpose matrix");
                System.out.println("4. Exit");
                break;

        }
    }

    public static int[][] newMatrix(){
        System.out.println("Skriv inn matrise:");
        System.out.println("Hvor mange kolonner?");
        int columns = new Scanner(System.in).nextInt();
        System.out.println("Hvor mange rader?");
        int rows = new Scanner(System.in).nextInt();

        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                String s = (char)(i + 'a') + "";
                System.out.println(s + "_" + (j + 1) + " =");
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        printMatrix(matrix);

        return matrix;

    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            String line = "[ ";
            for (int j = 0; j < matrix.length; j++) {
                line += matrix[j][i] + " ";
            }
            line += "]";
            System.out.println(line);
        }
        System.out.println();
    }

}