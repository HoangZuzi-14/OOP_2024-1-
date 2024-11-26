import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap nam: ");
        int year = 0;
        while (( year = sc.nextInt()) < 0){
            System.out.println("Nam nhap vao khong hop le! Hay nhap lai.");
        }
        String Jan[] = {"January", "Jan.", "Jan", "1"};
        String Feb[] = {"February", "Feb.", "Feb", "2"};
        String Mar[] = {"March", "Mar.", "Mar", "3"};
        String Apr[] = {"April", "Apr.", "Apr", "4"};
        String May[] = {"May", "5"};
        String Jun[] = {"June", "Jun", "6"};
        String Jul[] = {"July", "Jul", "7"};
        String Aug[] = {"August", "Aug.", "Aug", "8"};
        String Sep[] = {"September", "Sep.", "Sep", "9"};
        String Oct[] = {"October", "Oct.", "Oct", "10"};
        String Nov[] = {"November", "Nov.", "Nov", "11"};
        String Dec[] = {"December", "Dec.", "Dec", "12"};
        String month = "";
        boolean validMonth = false;
        System.out.println("Hay nhap thang: ");
        do {
            month = sc.next();
            if (isInArray(month, Jan) || isInArray(month, Mar) || isInArray(month, May) || isInArray(month, Jul) || 
                isInArray(month, Aug) || isInArray(month, Oct) || isInArray(month, Dec)) {
                System.out.println("So ngay cua thang do la 31 ngay");
                validMonth = true;
            } else if (isInArray(month, Apr) || isInArray(month, Jun) || isInArray(month, Sep) || isInArray(month, Nov)) {
                System.out.println("So ngay cua thang do la 30 ngay");
                validMonth = true;
            } else if (isInArray(month, Feb)) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("So ngay cua thang do la 29 ngay");
                } else {
                    System.out.println("So ngay cua thang do la 28 ngay");
                }
                validMonth = true;
            } else {
                System.out.println("Thang nhap vao khong hop le! Hay nhap lai.");
            }
        } while (!validMonth);
        sc.close();
    }
    public static boolean isInArray(String value, String[] array) {
        for (String element : array) {
            if (value.equals(element)) {
                return true;
            }
        }
        return false;
    }
}