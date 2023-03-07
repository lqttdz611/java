package hoadonthue;

import java.util.Date;

public class HDTheoGio extends HoaDon {
    private int soGioThue;

    public HDTheoGio() {
    }

    public HDTheoGio(int soGioThue, String maHD, String tenKhach, Date ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public double tinhThanhTien() {
        return soGioThue*donGia;
    }

    @Override
    public String toString() {
        return super.toString()+'\t'+soGioThue+'\t'+tinhThanhTien(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
