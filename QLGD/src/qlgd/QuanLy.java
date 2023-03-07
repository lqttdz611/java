/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class QuanLy {
    Scanner sc=new Scanner(System.in);
    DanhSachGiaoDich dsgd = new DanhSachGiaoDich();
    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
    public GiaoDichVang nhapGDV() {
        System.out.println("Nhap LoaiVang, MaGD, NgayGD, DonGia, SL ");
        GiaoDichVang gdv = new GiaoDichVang(sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        return gdv;
    }
    public GiaoDichTienTe nhapGDTT() {
        System.out.println("Nhap tiGia, MaGD, LoaiTienTe, NgayGD, DonGia, SL ");
        GiaoDichTienTe gdtt = new GiaoDichTienTe(Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        return gdtt;
    }
    public void inDanhSach() {
        for (GiaoDich gd : dsgd.arr) {
            System.out.println(gd.toString());
        }
    }
    public void xoa() {
        System.out.println("Nhap ma giao dich can xoa: ");
        String maGD=sc.nextLine();
        if(dsgd.xoaTheoMaGD(maGD)) {
            System.out.println(dsgd.toString());
        } else {
            System.out.println("K0 tim thay!!");
        }
    }
        public void themMoi() {
        int i;
        while (true) {
            System.out.println("1. Nhap GiaoDichVang; 2. Nhap GiaoDichTienTe ");
            i = Integer.parseInt(sc.nextLine());
            switch (i) {
                case 1:
                    GiaoDichVang gdv = nhapGDV();
                    dsgd.themMoi(gdv);
                    break;
                case 2:
                    GiaoDichTienTe  gdtt = nhapGDTT();
                    dsgd.themMoi(gdtt);
                    break;
            }
            System.out.println("Ban muon tiep tuc hay khong Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }
        public void menu() {
            int i;
            while(true) {
                System.out.println("1.Nhap danh sach cai loai giao dich \n 2. In danh sach cac loai giao dich"
                        + "\n 3.Xoa theo Ma Giao Dich ");
                i=Integer.parseInt(sc.nextLine());
                switch(i) {
                    case 1:
                        themMoi();
                        break;
                    case 2:
                        inDanhSach();
                        break;
                    case 3:
                        xoa();
                        break;
                }
            }
        }
}

