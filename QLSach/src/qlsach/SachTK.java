package qlsach;

import java.util.Date;

public class SachTK extends Sach {
        protected double thue;

    public SachTK() {
    }

    public SachTK(double thue, String maSach, Date ngayNhap, String nhaXB, double donGia, int soLuong) {
        super(maSach, ngayNhap, nhaXB, donGia, soLuong);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
        public double thanhTien() {
            return soLuong*donGia;
        }
        

    @Override
    public String toString() {
        return super.toString()+"\t"+thue; //To change body of generated methods, choose Tools | Templates.
    }

    
        
}
