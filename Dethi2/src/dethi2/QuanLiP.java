
package dethi2;

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

public class QuanLiP {
    Scanner sc= new Scanner(System.in);
    DSPhong dsp= new DSPhong();
    private Date chuyenChuoiThanhNgay(String nextLine) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang");
        }
        return null;
    }
    public PhongHop nhapPhongHop() {
        System.out.println("Nhap SoGhe, MaPhong, HangPhong, NgayThue, NgayTra, DonGia ");
        PhongHop ph = new PhongHop(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), chuyenChuoiThanhNgay(sc.nextLine()),Double.parseDouble(sc.nextLine()));
//        PhongHop pH = new PhongHop();
//        pH.setMaPhong(sc.nextLine());
//        pH.setHangPhong(sc.nextLine());
//        pH.setNgayThue(chuyenChuoiThanhNgay(sc.nextLine()));
//        pH.setNgayTra(chuyenChuoiThanhNgay(sc.nextLine()));
//        pH.setDonGia(Integer.parseInt(sc.nextLine()));
//        pH.setSoGhe(Integer.parseInt(sc.nextLine()));
         return ph;
        } 
    public PhongNgu nhapPhongNgu() {
        System.out.println("Nhap SoGiuong, MaPhong, HangPhong, NgayTHue, NgayTra, DonGia ");
        PhongNgu pn = new PhongNgu(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), chuyenChuoiThanhNgay(sc.nextLine()), chuyenChuoiThanhNgay(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        return pn;
    }
    public void themMoi() {
        int i;
        while(true) {
            System.out.println("1. Nhap Phong Hop \t 2.Nhap Phong Ngu");
            i=Integer.parseInt(sc.nextLine());
            switch(i){
                case 1:
                    PhongHop ph= nhapPhongHop();
                    dsp.themVaoDS(ph);
                    break;
                case 2:
                    PhongNgu pn= nhapPhongNgu();
                    dsp.themVaoDS(pn);
                    break;
            }
            System.out.println("Ban muon tiep tuc hay khong Y/N? ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
        }
    }
        
    }
    public void inDS() {
        for (Phong p : dsp.arr) {
            System.out.println(p.toString());
        }
    }
        
        public void inTongTienP() {
            System.out.println("TOng tien thue cua tat ca cac phong: ");
            System.out.println(dsp.tinhTongTienPhong());
        }
        public void xoa() {
            System.out.println("Nhap ma~ phong`");
            String maP=sc.nextLine();
            if(dsp.xoaTheoMaPhong(maP)) {
                System.out.println(dsp.toString());
            } else { 
                System.out.println("K0 tim thay");
            }       
            inDS();
        }
                        
        public void inDSTheoHang() {
            System.out.println("Nhap Hang. Phong`: ");
            String hangP=sc.nextLine();
            for (Phong p : dsp.layDSTheoHang(hangP)) {
                System.out.println(p.toString());
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
                 String maPhong=st[0];
                 String hangPhong=st[1];
                 Date ngayThue=chuyenChuoiThanhNgay(st[2]);
                 Date ngayTra=chuyenChuoiThanhNgay(st[3]);
                 int donGia=Integer.parseInt(st[4]);
                 int soGiuong=Integer.parseInt(st[5]);
                 int soGhe=Integer.parseInt(st[6]);
                 if(soGhe==0) {
                     PhongNgu pn= new PhongNgu(soGiuong, maPhong, hangPhong, ngayThue, ngayTra, donGia);
                     dsp.themVaoDS(pn);
                 } else {
                     PhongHop ph= new PhongHop(soGhe, maPhong, hangPhong, ngayThue, ngayTra, donGia);
                     dsp.themVaoDS(ph);
                 }
             }
             fr.close();
             br.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiP.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        }
        public void menu() {
            int i;
            do {         
                System.out.println("1. Nhap danh sach Phong \n2. In Danh Sach Phong\n3. Xoa theo ma phong chi dinh\n4. Hien thi thong tin va tien thue cua cac phong theo hang chi dinh"
                        + "\n5. Tinh tong tien thue cua tat ca cac phong \n*** Press 0 to exit!! ***");
                i=Integer.parseInt(sc.nextLine());
                switch(i) {
                    case 1:
                        docFile();
                        inDS();
                        //themMoi();
                        break;
                    case 2:
                        inDS();
                        break;
                    case 3:
                        xoa();
                        break;
                    case 4:
                        inDSTheoHang();
                        break;
                    case 5:
                        inTongTienP();
                        break;
                }
            } while (i!=0);
        }
    }

    

