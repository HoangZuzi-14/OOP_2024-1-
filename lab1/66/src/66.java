import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran:");
        int rows = sc.nextInt();
        System.out.println("Nhap so cot cua ma tran:");
        int cols = sc.nextInt();

        int[][] m1 = new int[rows][cols];
        int[][] m2 = new int[rows][cols];
        int[][] SumM = new int[rows][cols];

        System.out.println("Nhap cac phan tu cua ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("m1[" + i + "][" + j + "] = ");
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu cua ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("m2[" + i + "][" + j + "] = ");
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                SumM[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("\nMa tran 1:");
        printMatrix(m1);

        System.out.println("Ma tran 2:");
        printMatrix(m2);

        System.out.println("Tong cua hai ma tran:");
        printMatrix(SumM);

        sc.close(); 
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
