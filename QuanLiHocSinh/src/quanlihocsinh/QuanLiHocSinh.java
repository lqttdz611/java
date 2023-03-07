
package quanlihocsinh;

import java.util.Scanner;


public class QuanLiHocSinh {
           



    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap so luong sinh vien: ");
        int n=Integer.parseInt(sc.nextLine());
        HocSinh students[] = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu "+(i+1)+":");
            students[i] = new HocSinh();
            students[i].nhap();
        }
        System.out.println("Danh sach sinh vien: ");
        for (int i = 0; i < n; i++) {
            
            System.out.println(students[i].toString());
            
        }
        System.out.println("Diem trung binh tung hoc sinh: ");
        for (int i = 0; i < n; i++) {
            students[i].tinhdiemTB();
            System.out.println(students[i].diemTB());
        }
        System.out.println("Danh sach sv co diem TB >=5: ");
        for (int i = 0; i < n; i++) {
            if(students[i].tinhdiemTB()>=5) {
                System.out.println(students[i].diemTB());
            }
        }
//       HocSinh hs= new HocSinh();
//        hs.setDiemToan(-5);
//        System.out.println(hs.toString());
    }
    
}
