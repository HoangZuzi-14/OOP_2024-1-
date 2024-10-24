import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau tien: ");
        Double a = sc.nextDouble();
        System.out.println("Nhap so thu hai: ");
        Double b = sc.nextDouble();
        System.out.println("Ket qua cua ban la:");
        System.out.println("Sum = "+(a+b));
        System.out.println("Difference = " +(a-b));
        System.out.println("Product = "+(a*b));
        if (b != 0){
            System.out.println("Quotient = " +(a/b));
        } else {
            System.out.println("Khong the thuc hien phep chia vi so thu hai nhap khong hop le!");
        }
        sc.close();
    }
}
