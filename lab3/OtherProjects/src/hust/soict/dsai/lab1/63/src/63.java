import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua tam giac: ");
        int n = sc.nextInt();
        for (int i=1; i <=n; i++) {
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}