package qlnhanvien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuanLiNV {

    Scanner sc = new Scanner(System.in);
    DanhSachNhanVien dsnv = new DanhSachNhanVien();

    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
//    public  void docFile(){
//        try {
//            FileReader fr=new FileReader("input.txt");
//            BufferedReader br=new BufferedReader(fr);
//            String line="";
//            while (true) {                
//                line=br.readLine();//doc tung dong trong file input.txt
//                if (line==null) {
//                    break;//nhay ra khi while                  
//                }
//                String []st=line.split(",");
//                String cmnd=st[0];
//                String hoTen=st[1];
//                String phongBan=st[2];
//                Date ngayVaoLam=chuyenChuoiThanhNgay(st[3]);
//                double heSoLuong=Double.parseDouble(st[4]);
//                int tongGioLam=Integer.parseInt(st[5]);
//                int tienCong1h=Integer.parseInt(st[6]);
//                if (tienCong1h==0) {
//                    NVBienChe nvbc= new NVBienChe(heSoLuong, cmnd, hoTen, phongBan, ngayVaoLam);
//                    dsnv.themVaoDS(nvbc);
//                } else {
//                    NVHopDong nvhd = new NVHopDong(tongGioLam, tienCong1h, cmnd, hoTen, phongBan, ngayVaoLam);
//                    dsnv.themVaoDS(nvhd);
//                }
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(QuanLiNV.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    public NVBienChe nhapNVBC() {
        System.out.println("Nhap HeSoLuong, CMND, HoTen, PhongBan, NgayVaoLam ");
        NVBienChe nvbc = new NVBienChe(Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()));
        return nvbc;
    }

    public NVHopDong nhapNVHD() {
        System.out.println("Nhap TongGIoLam, TienCong1h, CMND, HoTen, PhongBan, NgayVaoLam");
        NVHopDong nvhd = new NVHopDong(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()));
        return nvhd;
    }

    public void themMoi() {
        int i;
        while (true) {
            System.out.println("1.Nhap NV Bien Che \t 2.Nhap NV Hop Dong");
            i = Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    NVBienChe nvbc = nhapNVBC();
                    dsnv.themVaoDS(nvbc);
                    break;
                case 2:
                    NVHopDong nvhd = nhapNVHD();
                    dsnv.themVaoDS(nvhd);
                    break;
            }
            System.out.println("Ban muon tiep tuc hay khong Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;

            }
        }
    }
       
    public void themMoiphu() {
        int i;
        while(true) {
            System.out.println("1. In NV Bien Che \t 2. In NV Hop Dong");
            i= Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    for (NhanVien nv : dsnv.dsChiDinh()) {
                        System.out.println(nv.toString());
                    }
                    break;
                case 2:
                    for (NhanVien vn : dsnv.dsChiDinh2()) {
                        System.out.println(vn.toString());
                    }
                    break;
                    
            }
             System.out.println("Ban muon tiep tuc hay khong Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
        }
    }}

    public void inDanhSach() {
        for (NhanVien nv : dsnv.arr) {
            System.out.println(nv.toString());
        }
    }

    public void xoaCMND() {
        System.out.println("Nhap so CMND can xoa: ");
        String cmnd = sc.nextLine();
        if (dsnv.xoaTheoCMND(cmnd)) {
            System.out.println(dsnv.toString());
        } else {
            System.out.println("K0 tim thay!!");
        }
        inDanhSach();
    }

    public void timNV() {
        System.out.println("Nhap so CMND can tim: ");
        String socm = sc.nextLine();
        NhanVien vn = dsnv.timNVtheoCMND(socm);
        if (vn != null) {
            System.out.println(vn.toString());
        } else {
            System.out.println("K0 tim thay!!");
        }
    }
    public void inTongluong() {
        System.out.println("Tong tien luong "+ dsnv.tinhTongLuong());
    }
    
    public void inDSLuongMax() {
        for (NhanVien nhanVien : dsnv.dsMaxLuong()) {
            System.out.println(nhanVien.toString());
        }
    }
    public void menu() {
        int i;
        do {
            System.out.println("Cac chuc nang cua chuong trinh!! \n1. Them moi nhan vien \n2. Xuat danh sach nhan vien trong cong ty"
                    + "\n3. Xoa nhan vien theo CMND \n4. Tim kiem nhan vien theo CMND \n5. Xuat Tong Tien Luong \n6. Xuat danh sach nhan vien co luong cao nhat"
                    + "\n7. Xuat danh sach nhan vien theo loai chi dinh ");
            i = Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    themMoi();
                    //docFile();
                    //inDanhSach();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
                    xoaCMND();
                    break;
                case 4:
                    timNV();
                    break;
                case 5:
                    inTongluong();
                    break;
                case 6:
                    inDSLuongMax();
                    break;
                case 7:
                    themMoiphu();
            }

        } while (i != 0);
    }
}
