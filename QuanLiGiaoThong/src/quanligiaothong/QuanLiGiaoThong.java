
package quanligiaothong;

import java.util.Scanner;

public class QuanLiGiaoThong {
    Scanner sc= new Scanner(System.in);
    QuanLy ql = new QuanLy();
    void menu() {
    int i;
    do {
            System.out.println("*** Moi chon chuc nang chuong trinh ***");
            System.out.println("1. Nhap danh sach cac phuong tien giao thong: ");
            System.out.println("2. Xuat bang ke khai tien thue truoc ba cua xe: ");
            System.out.println("3. In danh sach phuong tien giao thong theo loai xe: ");
            System.out.println("Ban chon chuc nang so: ");
            i=Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    ql.themMoi();
                    break;
                case 2:
                    ql.inDSPT();
                    break;
                case 3:
                    System.out.println("Nhap ten loai xe ma ban muon in: ");
                    ql.timkiemSV(sc.nextLine());
            } 
} while (i!=0);
}
    



    public static void main(String[] args) {
//         QuanLy ql = new QuanLy();
//   
//          
//        ql.themMoi();
//        ql.inDSPT();
        QuanLiGiaoThong qlgt = new QuanLiGiaoThong();
        qlgt.menu();
    }
    
}
