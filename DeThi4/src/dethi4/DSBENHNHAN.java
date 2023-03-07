package dethi4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DSBENHNHAN {
    Scanner sc= new Scanner(System.in);
    ArrayList<BenhNhan> arr= new ArrayList<>();
    public void themVaoDS(BenhNhan bn) {
        arr.add(bn);
    }
    public Date chuyenNgayThanhChuoi(String nl) {
        try {
            return new SimpleDateFormat("dd/MM/yy").parse(nl);
        } catch (ParseException ex) {
            Logger.getLogger(DSBENHNHAN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
//    public BAOHIEMYTE nhapBNYT() {
//        System.out.println("Nhap MaBH, maBN, HoTen, ngayNV, ngayRV, YeuCauPhong");
//        BAOHIEMYTE bhyt= new BAOHIEMYTE(sc.nextLine(), sc.nextLine(), sc.nextLine(), chuyenNgayThanhChuoi(sc.nextLine()), chuyenNgayThanhChuoi(sc.nextLine()), sc.nextBoolean());
//        return bhyt;
//    }
//    public BAOHIEMXAHOI nhapBHXH() {
//        BAOHIEMXAHOI bhxh= new BAOHIEMXAHOI(sc.nextLine(), sc.nextLine(), sc.nextLine(), chuyenNgayThanhChuoi(sc.nextLine()), chuyenNgayThanhChuoi(sc.nextLine()), sc.nextBoolean());
//        return bhxh;
//    }
    public BenhNhan timBN(String maBN) {
        for (BenhNhan bn : arr) {
            if(bn.getMaBN().equalsIgnoreCase(maBN)) {
                return bn;
            }
        } return null;
    }
    public void xoaBN(String maBN) {
        BenhNhan bn=timBN(maBN);
        if(bn!=null) {
                arr.remove(bn);
            } else {
            JOptionPane.showMessageDialog(null, "Xoa that bai!!");
        }
        
    }
    
}
