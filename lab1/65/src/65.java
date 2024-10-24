import java.util.Arrays;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu trong mang:");
        int n = sc.nextInt();
        int[] my_array1 = new int[n];

        for (int i = 0; i < n; i++) {
            my_array1[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);

        System.out.println("Mang da sap xep: " + Arrays.toString(my_array1));

        int sum = 0;
        for (int num : my_array1) {
            sum += num;
        }
        double average = (double) sum / my_array1.length;
        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Gia tri trung binh cua cac phan tu trong mang: " + average);

        sc.close(); 
    }
}
