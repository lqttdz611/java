package pkg25112022_kiemtra;

import java.text.DecimalFormat;
import java.util.Date;

public class ThueTheoGio extends DichVuThue {
    private double soGioThue;

    public ThueTheoGio() {
    }

    public ThueTheoGio(double soGioThue, String maXe, String loaiXe, Date ngayThue, double donGia, String dieuKienBang) {
        super(maXe, loaiXe, ngayThue, donGia, dieuKienBang);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat("###,###,###.0");
        return super.toString()+"\t"+soGioThue+"\t"+df.format(tinhThanhTien()); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double tinhThanhTien() {
        return donGia*soGioThue;
    }
    
}
