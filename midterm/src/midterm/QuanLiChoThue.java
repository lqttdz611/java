package midterm;

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

public class QuanLiChoThue {
    Scanner sc= new Scanner(System.in);
    DanhSachChoThue dst= new DanhSachChoThue();
    private Date chuyenChuoiThanhNgay(String nextLine)  {
        try {
             return new SimpleDateFormat("dd/MM/yyyy").parse(nextLine);
        } catch (ParseException e) {
            System.out.println("Loi nhap ngay thang!!");

    } return null;
}
    public void docFile() {
        
        try {
          FileReader fr= new FileReader("input.txt");
          BufferedReader br= new BufferedReader(fr);
          String line="";
          while(true) {
              line=br.readLine();
              if(line==null) break;
          String st[] = line.split(",");
          String maXe=st[0];
          String loaiXe=st[1];
          Date ngayThue=chuyenChuoiThanhNgay(st[2]);
          double donGia=Double.parseDouble(st[3]);
          String bangLai=st[4];
          double soGioThue=Double.parseDouble(st[5]);
          double soNgayThue=Double.parseDouble(st[6]);
          if(soNgayThue==0) {
              ThueTheoGio ttg= new ThueTheoGio(soGioThue, maXe, loaiXe, ngayThue, donGia, bangLai);
              dst.themVaoDS(ttg);
          } else {
              ThueTheoNgay ttn= new ThueTheoNgay(soNgayThue, maXe, loaiXe, ngayThue, donGia, bangLai);
              dst.themVaoDS(ttn);
          }
          }
          fr.close();
          br.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLiChoThue.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void inDS() {
        for (DichVuThue dvt : dst.arr) {
            System.out.println(dvt.toString());
        }
    }
    public void inDSXoa() {
        System.out.println("Nhap MaXe can xoa: ");
        String maXe=sc.nextLine();
        if(dst.xoaMaXe(maXe)) {
            inDS();
        } else {
            System.out.println("Xoa that bai!!");
        }
    }
    public void dsTimKiem() {
        System.out.println("Nhap LoaiXe can tim kiem: ");
        String loaiXe=sc.nextLine();
        for (DichVuThue dvt : dst.timKiemXe(loaiXe)) {
            System.out.println(dvt.toString());
        }
    }
    public void inTongTien() {
        System.out.println("Tong tien cho thue: ");
        System.out.println(dst.tinhTongTien());
    }
    public void dsChiDinh() {
        int i;
        do {
            System.out.println("1. Dich Vu Cho Thue Theo Gio \t 2. Dich Vu Cho Thue Theo Ngay");
            i=Integer.parseInt(sc.nextLine());
           switch(i) {
               case 1:
                   for (DichVuThue dvt : dst.dsTheoGio()) {
                       System.out.println(dvt.toString());
                   }
                   break;
               case 2:
                   for (DichVuThue dichVuThue : dst.dsTheoNgay()) {
                       System.out.println(dichVuThue.toString()); 
                   }
                   break;
           } 
        } while(i!=0);
    }
    public void menu() {
        int i;
        do {
            System.out.println("1. Them DS Cho Thue \n2. Xoa Theo MaXe \n3. Tim kiem Loai Xe \n4. In Tong Tien Cho THue \n5. In Danh Sach Theo Tung Loai Thue");
            i=Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    docFile();
                    inDS();
                    break;
                case 2:
                    inDSXoa();
                    break;
                case 3:
                    dsTimKiem();
                    break;
                case 4:
                    inTongTien();
                    break;
                case 5:
                    dsChiDinh();
                    break;
            }
    } while(i!=0);
}
}

