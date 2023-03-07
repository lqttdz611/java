package dethi2;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Phong implements IPhong {
    protected String maPhong, hangPhong;
    protected Date ngayThue, ngayTra;
    protected double donGia;

    public Phong() {
    }

    public Phong(String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        this.maPhong = maPhong;
        this.hangPhong = hangPhong;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.donGia = donGia;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getHangPhong() {
        return hangPhong;
    }

    public void setHangPhong(String hangPhong) {
        this.hangPhong = hangPhong;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
//        if(hangPhong.equalsIgnoreCase("A")) {
//            this.donGia=1200000;
//        } else if(hangPhong.equalsIgnoreCase("B")) {
//            this.donGia=1000000;
//        } else {
//            this.donGia=750000;
//        }
this.donGia=donGia;
        
        
    }
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }

    @Override
    public String toString() {
            return maPhong+"\t"+hangPhong+"\t"+chuyenNgayThanhChuoi(ngayThue)+"\t"+chuyenNgayThanhChuoi(ngayTra)+"\t"+donGia; 
    }
    
}
