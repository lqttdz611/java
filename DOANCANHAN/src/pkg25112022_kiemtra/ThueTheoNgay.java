package pkg25112022_kiemtra;

import java.text.DecimalFormat;
import java.util.Date;

public class ThueTheoNgay extends DichVuThue {
        private double soNgayThue;

    public ThueTheoNgay() {
    }

    public ThueTheoNgay(double soNgayThue, String maXe, String loaiXe, Date ngayThue, double donGia, String dieuKienBang) {
        super(maXe, loaiXe, ngayThue, donGia, dieuKienBang);
        this.soNgayThue = soNgayThue;
    }

    public double getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(double soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat("###,###,###.0");
        return super.toString()+"\t"+soNgayThue+"\t"+df.format(tinhThanhTien()); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double tinhThanhTien() {
        return donGia*soNgayThue*12*80/100;
    }
        
}
