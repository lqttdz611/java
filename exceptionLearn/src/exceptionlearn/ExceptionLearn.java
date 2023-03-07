package exceptionlearn;

import java.util.Scanner;

public class ExceptionLearn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int a, b;
        System.out.println("Nhap vao so a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so b: ");
        b = Integer.parseInt(sc.nextLine());
            System.out.println("a / b = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Kh the chia cho 0");
            //e.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("Nhap sai kieu du lieu ");
        } catch (Exception e) {
            System.out.println("Loi chua biet");
        }
    }
}
