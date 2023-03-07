package quanligiaothong;

import java.util.Scanner;

public class QuanLy {
    DanhSachPTGT dsptgt = new DanhSachPTGT();
    Scanner sc= new Scanner(System.in);
    public void themMoi(){
        while(true) {
            System.out.println("Nhap ho ten, loai xe, dung tich, tri gia: ");
            PhuongTien ptgt= new PhuongTien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dsptgt.themVaoDS(ptgt);
            System.out.println("Tiep tuc hay kh (Y/N): ");
            if(sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    public void inDSPT() {
        for (PhuongTien pt : dsptgt.ds ) {
            System.out.println(pt.toString());
        }
    }
    public void timkiemSV(String name) {
        for (PhuongTien pt : dsptgt.ds) {
            if(name.equalsIgnoreCase(pt.getLoaixe())) {
                System.out.println(pt.toString());
            }
        }
    }
}
