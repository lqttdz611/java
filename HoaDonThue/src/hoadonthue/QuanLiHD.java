package hoadonthue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuanLiHD {
    Scanner sc= new Scanner(System.in);
        DanhSachHoaDon dshd= new DanhSachHoaDon();
    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang!!");
        }
        return null;
    }
    public void docFile() {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br= new BufferedReader(fr);
            String line="";
            while(true) {
                line=br.readLine();
                if(line==null) {
                    break;
                }
            String st[] = line.split(",");
            String maHD=st[0];
            String tenKhach=st[1];
            Date ngayHD=chuyenChuoiThanhNgay(st[2]);
            double donGia=Double.parseDouble(st[3]);
            int soGioThue=Integer.parseInt(st[4]);
            int soNgayThue=Integer.parseInt(st[5]);
            if(soNgayThue==0) {
                HDTheoGio hdg= new HDTheoGio(soGioThue, maHD, tenKhach, ngayHD, donGia);
                dshd.themVaoDs(hdg);
            } else {
                HDTheoNgay hdn= new HDTheoNgay(soNgayThue, maHD, tenKhach, ngayHD, donGia);
                dshd.themVaoDs(hdn);
            }
            
            }
            fr.close();
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(QuanLiHD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void inDS() {
        for (HoaDon hd : dshd.arr) {
            System.out.println(hd.toString());
        }
    }
    public void xoaHD() {
        System.out.println("Nhap MaHD can xoa: ");
        String maHD=sc.nextLine();
        if(dshd.xoaTheoMaHD(maHD)) {
            inDS();
        } else 
            System.out.println("K0 tim thay!!");
    }
    public void inDSTimHD() {
        System.out.println("Nhap MaHD can tim kiem: ");
        String maHD=sc.nextLine();
        for (HoaDon hd : dshd.timTheoMaHD(maHD)) {
            System.out.println(hd.toString());
        }
    
    }
    public void inTongTien() {
        System.out.println("Tong thanh tien cua Hoa Don: ");
        System.out.println(dshd.tongThanhTien());
    }
    public void menu() {
        int i;
        do {
            System.out.println("1. Them moi Hoa Don \n2. Tim kiem Hoa Don theo MaHD \n3. Xoa Hoa Don theo MaHD \n4. Tinh tong thanh tien tat ca cac hoa don"
                    + "\n *** Press 0 to exit menu ***");
            i=Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    docFile();
                    inDS();
                    break;
                case 2:
                    inDSTimHD();
                    break;
                case 3:
                    xoaHD();
                    break;
                case 4:
                    inTongTien();
                    break;
            }
        } while (i!=0);
    }
    
}
