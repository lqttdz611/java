package qlsach;

import java.util.Date;

public class SachGK extends Sach {
    protected String tinhTrang;

    public SachGK() {
    }

    public SachGK(String tinhTrang, String maSach, Date ngayNhap, String nhaXB, double donGia, int soLuong) {
        super(maSach, ngayNhap, nhaXB, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong*donGia;
        } else {
            return soLuong*donGia*50/100;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+tinhTrang; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
