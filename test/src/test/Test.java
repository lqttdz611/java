package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    Scanner sc= new Scanner(System.in);
        
        
Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
   
void nhap() {
    System.out.println("Nhap ngay: ");
    Date ngay=chuyenChuoiThanhNgay(sc.nextLine());
    System.out.println("Hien thi ngay: "+ ngay);
    long nam=(ngay.getTime())/(365*24*60*60*1000);
    
    System.out.println("Hien thi nam: "+ nam);
}
    public static void main(String[] args) {
        Test t= new Test();
        t.nhap();
        
    
    
}
}
