package qlsach;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sach {
    protected String maSach, nhaXB;
    protected Date ngayNhap;
    protected double donGia;
    protected int soLuong;

    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, String nhaXB, double donGia, int soLuong) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.nhaXB = nhaXB;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }
    @Override
    public String toString() {
        return maSach+ "\t"+chuyenNgayThanhChuoi(ngayNhap)+"\t"+donGia+"\t" +"\t"+soLuong+"\t" +nhaXB;
    }
    
}
