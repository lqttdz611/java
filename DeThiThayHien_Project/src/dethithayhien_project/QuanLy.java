
package dethithayhien_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QuanLy {
    DanhMucSach dms=new DanhMucSach();
    Scanner sc=new Scanner(System.in);
    public  void docFile(){
        try {
            FileReader fr=new FileReader("input.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while (true) {                
                line=br.readLine();//doc tung dong trong file input.txt
                if (line==null) {
                    break;//nhay ra khi while                  
                }
                String []st=line.split(",");
                String ten=st[0];
                String nhaXB=st[1];
                String namXB=st[2];
                int soTrang=Integer.parseInt(st[3]);
                int giaBan=Integer.parseInt(st[4]);
                int soLuong=Integer.parseInt(st[5]);
                String khoi=st[6];
                String theLoai=st[7];
                if (theLoai.equalsIgnoreCase("0")) {
                    SachGiaoKhoa sgk=new SachGiaoKhoa(khoi, ten, nhaXB, namXB, soTrang, giaBan, soLuong);
                    dms.themVaoDS(sgk);
                } else {
                    TieuThuyet tt=new TieuThuyet(theLoai, ten, nhaXB, namXB, soTrang, giaBan, soLuong);
                    dms.themVaoDS(tt);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ghiFile(String path) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (DanhMuc dm : dms.a) {
                fw.write(dm.toString()+"\n");
            }
 {
                
            }
        fw.close();
        bw.close();
        } catch (IOException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  void inDanhMucSach(){
        System.out.println("Ten: \t\t NXB: \t\t \bNamXB: \t\t \bGiaBan: \t SoTrang: \t SL: \t\t Khoi/TheLoai: \t  ThanhTien:");
        for (DanhMuc dm : dms.a) {
            System.out.println(dm.toString());
        }
    }
    public void inDSThongKe() {
        dms.thongKeSach();
    }
    public void inDSTTMax() {
        for (DanhMuc damu : dms.inDSMaxTT()) {
            System.out.println(damu.toString());
        }
    }
    public void inDSGBMax() {
        for (DanhMuc danhMuc : dms.dsmoitheoGiaBan()) {
            System.out.println(danhMuc.toString());
        }
    }
    public void inSapxep() {
        dms.sapXepGD();
        inDanhMucSach();
    }
    public void menu() {
        int i;
        do {
                System.out.println("1.Them danh sach sach \n2.Thong ke so luong theo loai\n3.Tim danh sach gia ban cao nhat theo moi loai \n4.Tim sach co gia ban lon nhat\n5.In danh sach giam dan theo GiaBan ");
                i=Integer.parseInt(sc.nextLine());
                switch(i) {
                    case 1: 
                        docFile();
                        inDanhMucSach();
                        break;
                    case 2:
                        inDSThongKe();
                        break;
                    case 3:
                        inDSGBMax();
                        break;
                    case 4:
                        inDSTTMax();
                        break;
                    case 5:
                        inSapxep();
                        break;
                }
            
            
        } while ( i!=0 );
    }
}
