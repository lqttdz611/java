package midterm;

import java.text.DecimalFormat;
import java.util.Date;

public class ThueTheoNgay extends DichVuThue{
    private double soNgayThue;

    public ThueTheoNgay() {
    }

    public ThueTheoNgay(double soNgayThue, String maXe, String loaiXe, Date ngayThue, double donGia, String dieuKienBangLai) {
        super(maXe, loaiXe, ngayThue, donGia, dieuKienBangLai);
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
        return super.toString()+"\t"+soNgayThue+"\t"+df.format(tinhTienThue()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double tinhTienThue() {
        return donGia*soNgayThue*12*80/100;
    }
    
    
}
