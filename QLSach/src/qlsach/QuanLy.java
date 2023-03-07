
package qlsach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class QuanLy {
    Scanner sc= new Scanner(System.in);
    DanhSachSach dss = new DanhSachSach();
    public SachGK nhapSGK() {
        System.out.println("Nhap TinhTrang, MaSach, NgayNhap, NXB, DonGia, SoLuong  ");
        SachGK sgk = new SachGK(sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        return sgk;
    }
    public SachTK nhapSTK() {
        System.out.println("Nhap thue, MaSach, NgayNhap, NXB, DonGia, SoLuong ");
        SachTK stk = new SachTK(Double.parseDouble(sc.nextLine()), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), sc.nextLine(),Double.parseDouble(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        return stk;
    }   
    private Date chuyenChuoiThanhNgay(String nextLine) {
         try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
    public void inTongTT() {
        System.out.println("Tong tien: "+dss.tinhTongTien());
    }
    
    public void xoa() {
        System.out.println("Nhap ma sach can xoa: ");
        String maSach=sc.nextLine();
        if(dss.xoaTheoMaSach(maSach)) {
            System.out.println("Xoa thanh cong ");
        } else {
            System.out.println("Khong tim thay ");
        }
        inDanhSachSach();
    }
    public void timKiem() {
        System.out.println("Nhap vao ma sach can tim:" );
        String maSach=sc.nextLine();
        Sach s=dss.timTheoMaSach(maSach);
        if(s!=null) {
            System.out.println(s.toString());
        } else {
            System.out.println("K0 tim thay!!");
        }
    }
    public void timSachNXB() {
        System.out.println("Nhap ten NXB can tim: ");
        String nxb=sc.nextLine();
//        Sach sgk=dss.timSGK(nxb);
//        if(sgk!=null) {
//            inDanhSachSach();
//        } else {
//            System.out.println("K0 tim thay!!");
//        }       
//            
//        }
        
        if(dss.timSGK(nxb)) {
            System.out.println("Tim thanh cong thanh cong ");
        } else {
            System.out.println("Khong tim thay ");
        }
        
    
    }
    
    
//    public void inTBC() {
//        System.out.println("Trung binh cong don gia Sach Tham Khao: ");
//        double stk=dss.tinhTBCDonGia();
//        System.out.println(stk);
//    }
    public void themMoi() {
        int i;
        while (true) {            
            System.out.println("1. Nhap SGK; 2. Nhap STK ");
            i = Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    SachGK sgk = nhapSGK();
                    dss.themMoi(sgk);
                    break;
                case 2:
                    SachTK stk = nhapSTK();
                    dss.themMoi(stk);
                    break;
            }
            System.out.println("Ban muon tiep tuc hay khong Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    public void inDanhSachSach() {
        for (Sach sach : dss.a) {
            System.out.println(sach.toString());
        }
    }
    public void menu(){
    int i;
        do {
            System.out.println("1.Them moi\n 2.In danh sach sach \n 3.In tong thanh tien \n 4. Xoa Sach ra khoi Danh Sach \n"
                    + "5. Tim kiem Sach theo ten \n 6.Test \n 7.In theo ten NXB ");
            System.out.print("Chon chuc nang chuong trinh: ");
            i=Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    themMoi();
                    break;
                case 2: 
                    inDanhSachSach();
                   break;
                case 3:
                    inTongTT();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    timKiem();
                    break;
//                case 6:
//                    inTBC();
//                    break;
                case 7:
                    timSachNXB();
                    break;
            }
        } while (i!=0);
        
    }
    
   
}
