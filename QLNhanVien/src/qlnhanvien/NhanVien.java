package qlnhanvien;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class NhanVien {
    protected String cmnd,hoTen,phongBan;
    protected Date ngayVaolam;

    public NhanVien() {
    }

    public NhanVien(String cmnd, String hoTen, String phongBan, Date ngayVaolam) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.ngayVaolam = ngayVaolam;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Date getNgayVaolam() {
        return ngayVaolam;
    }

    public void setNgayVaolam(Date ngayVaolam) {
        this.ngayVaolam = ngayVaolam;
    }
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }

    @Override
    public String toString() {
        return cmnd + "\t" + hoTen + "\t" + phongBan + "\t" + chuyenNgayThanhChuoi(ngayVaolam);
    }
    public abstract double tinhPhuCap();
    public abstract double tinhLuong();
    
}
