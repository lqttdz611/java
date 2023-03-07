package hoadonthue;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class HoaDon implements IHoaDon {
    protected String maHD;
    protected String tenKhach;
    protected Date ngayHD;
    protected double donGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKhach, Date ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }
    @Override
    public String toString() {
        return maHD + '\t' + tenKhach + '\t' + chuyenNgayThanhChuoi(ngayHD) + '\t' + donGia;
    }
    
}
