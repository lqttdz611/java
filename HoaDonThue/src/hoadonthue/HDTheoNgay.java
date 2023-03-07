package hoadonthue;

import java.util.Date;

public class HDTheoNgay extends HoaDon {
    private int soNgayThue;

    public HDTheoNgay() {
    }

    public HDTheoNgay(int soNgayThue, String maHD, String tenKhach, Date ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    
    @Override
    public double tinhThanhTien() {
        if(soNgayThue>7) {
            return soNgayThue*donGia*80/100;
        } else 
        return soNgayThue*donGia;
    }

    @Override
    public String toString() {
        return super.toString()+'\t'+soNgayThue+'\t'+tinhThanhTien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
