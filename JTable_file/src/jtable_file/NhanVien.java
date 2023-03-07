package jtable_file;

import java.text.DecimalFormat;
import java.util.Date;

public class NhanVien {
    private String CMND,hoTen;
    private Date ngaySinh;
    private float HSL;
    public static final double MUC_LUONG_CO_SO=1490000;

    public NhanVien() {
    }

    public NhanVien(String CMND, String hoTen, Date ngaySinh, float HSL) {
        this.CMND = CMND;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.HSL = HSL;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getHSL() {
        return HSL;
    }

    public void setHSL(float HSL) {
        this.HSL = HSL;
    }
    public double tinhLuong() {
        return HSL*MUC_LUONG_CO_SO;
    }
}
