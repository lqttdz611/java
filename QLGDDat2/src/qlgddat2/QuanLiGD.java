package qlgddat2;

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

public class QuanLiGD {
        Scanner sc= new Scanner(System.in);
        DanhSachGD dsgd= new DanhSachGD();
    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
    public GiaoDichDat nhapGDD() {
        System.out.println("Nhap LoaiDat, MaGD, NgayGD, DonGia, DienTich ");
        GiaoDichDat gdd= new GiaoDichDat(sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            return gdd;
    }
    public GiaoDichNha nhapGDN() {
        GiaoDichNha gdn = new GiaoDichNha(sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        return gdn;
    }
    
    public void themMoi() {
        int i;
        while(true) {
            System.out.println("1. Nhap GiaoDichDat \t 2. Nhap GiaoDichNha ");
            i=Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    GiaoDichDat gdd = nhapGDD();
                    dsgd.themVaoDs(gdd);
                    break;
                case 2:
                    GiaoDichNha gdn = nhapGDN();
                    dsgd.themVaoDs(gdn);
                    break;
            }
        }
    }
    public void inDS() {
        for (GiaoDich gd : dsgd.arr) {
            System.out.println(gd.toString());
        }
    }
    public void xoaGD() {
        System.out.println("Nhap ma GD can xoa: ");
        String maGD=sc.nextLine();
            if(dsgd.xoaTheoMa(maGD)) {
                inDS();
            } else {
                System.out.println("Xoa that bai !!");
            }
        
    }
    public void inDSTimKiem() {
        System.out.println("Nhap MaGD can tim: ");
        String maGD=sc.nextLine();
        for (GiaoDich gg : dsgd.timMaGD(maGD)) {
            
                System.out.println(gg.toString());
            
            }
        }
    public void docFile() {
            try {
                FileReader fr= new FileReader("input.txt");
                BufferedReader br= new BufferedReader(fr);
                String line="";
                while(true) {
                    line=br.readLine();
                    if(line==null) {
                        break;
                    }
                    String st[]=line.split(",");
                    String maGD=st[0];
                    Date ngayGD=chuyenChuoiThanhNgay(st[1]);
                    double donGia=Double.parseDouble(st[2]);
                    double dienTich=Double.parseDouble(st[3]);
                    String loaiDat=st[4];
                    String loaiNha=st[5];
                    if(loaiNha.equalsIgnoreCase("0")) {
                        GiaoDichDat gdd= new GiaoDichDat(loaiDat, maGD, ngayGD, donGia, dienTich);
                        dsgd.themVaoDs(gdd);
                    } else {
                        GiaoDichNha gdn= new GiaoDichNha(loaiNha, maGD, ngayGD, donGia, dienTich);
                        dsgd.themVaoDs(gdn);
                    }
                }
                fr.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(QuanLiGD.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void inDSTheoLoaiGD() {
        int i;
        do {
            System.out.println("1. In DSGD Dat \t 2. InDSGD Nha");
            i=Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    for (GiaoDich gg : dsgd.inDSTheoLoai()) {
                        System.out.println(gg.toString());
                    }
                    break;
                case 2:
                    for (GiaoDich gg : dsgd.inDSTheoLoai2()) {
                        System.out.println(gg.toString());
                    }
                    break;
            }
        } while(i!=0);
    }
//    public void inDSTheoYear() {
//        System.out.println("Nhap nam giao dich can hien thi: ");
//        long year=Long.parseLong(sc.nextLine());
//        for (GiaoDich gg : dsgd.dsGDTheoNam(year)) {
//            System.out.println(gg.toString());
//            
//        }
//    }
    
    
//    public void inDSTheoYear() {
//        System.out.println("Nhap nam giao dich ");
//        long namGD=Long.parseLong(sc.nextLine());
//        if(dsgd.xoaTheoNam(namGD)) {
//            inDS();
//        } else {
//            System.out.println("K0 co GD tuong ung!!");
//        }
//    }
    
    public void menu() {
        int i;
        do {
            System.out.println("1. Them moi giao dich \n2.Xoa theo MaGD \n3. Tim kiem theo MaGD \n4. In Danh Sach Theo Tung Loai GD"
                    + "\n5. In DSGD Truoc Nam Chi Dinh");
            i=Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    //themMoi();
                    docFile();
                    inDS();
                    break;
                case 5:
                    //inDSTheoYear();
                    break;
                case 2:
                    xoaGD();
                    break;
                case 3:
                    inDSTimKiem();
                    break;
                case 4:
                    inDSTheoLoaiGD();
                    break;
                    
            }
            
        } while (i!=0);
    }
    
}
