package dethi4;

import java.util.Scanner;

public class DeThi4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String ma ="", ten = "";
        System.out.println("Nhap ma, ho ten");
        for (int i = 0; i < 3; i++) {
             ma = s.nextLine();
             ten = s.nextLine();
        }

        System.out.println("In thong tin vua nhap");
        for (int i = 0; i < 3; i++) {
             System.out.printf("%-10s %-20s", ma, ten);
             System.out.printf("");
             System.out.println();
        }
       
    }

}
