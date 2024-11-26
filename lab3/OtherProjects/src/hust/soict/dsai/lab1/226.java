import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Chon loai phuong trinh de giai:");
            System.out.println("1. Phuong trinh bc nhAt 1 an (ax + b = 0)");
            System.out.println("2. He phuong trinh bac nha3t 2 an");
            System.out.println("3. Phuong trinh bac hai (ax^2 + bx + c = 0)");
            System.out.println("4. Thoat");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    solveFirstDegreeOneVariable(sc);
                    break;
                case 2:
                    solveFirstDegreeTwoVariables(sc);
                    break;
                case 3:
                    solveSecondDegreeOneVariable(sc);
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh.");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon không hop le. Vui long chon lai.");
            }
        }
    }
    // Phương trình bậc nhất một ẩn (ax + b = 0)
    public static void solveFirstDegreeOneVariable(Scanner sc) {
        System.out.println("Nhap he so a:");
        double a = sc.nextDouble();
        System.out.println("Nhap he so b:");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
    }
    // Hệ phương trình bậc nhất hai ẩn
    public static void solveFirstDegreeTwoVariables(Scanner sc) {
        System.out.println("Nhap he so a11:");
        double a11 = sc.nextDouble();
        System.out.println("Nhap he so a12:");
        double a12 = sc.nextDouble();
        System.out.println("Nhap he so a21:");
        double a21 = sc.nextDouble();
        System.out.println("Nhap he so a22:");
        double a22 = sc.nextDouble();
        System.out.println("Nhap b1:");
        double b1 = sc.nextDouble();
        System.out.println("Nhap b2:");
        double b2 = sc.nextDouble();
        double D = a11 * a22 - a12 * a21;
        double Dx1 = b1 * a22 - a12 * b2;
        double Dx2 = a11 * b2 - b1 * a21;
        if (D != 0) {
            double x1 = Dx1 / D;
            double x2 = Dx2 / D;
            System.out.println("Nghiem của he la: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (Dx1 == 0 && Dx2 == 0) {
                System.out.println("He co vo so nghiem");
            } else {
                System.out.println("He vo nghiem");
            }
        }
    }
    // Phương trình bậc hai (ax² + bx + c = 0)
    public static void solveSecondDegreeOneVariable(Scanner sc) {
        System.out.println("Nhap he so a:");
        double a = sc.nextDouble();
        System.out.println("Nhap he so b:");
        double b = sc.nextDouble();
        System.out.println("Nhap he so c:");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Phuong trinh khog phai bac hai");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh có 2 nghiem: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                System.out.println("Phuong trinh vô nghiem");
            }
        }
    }
}
