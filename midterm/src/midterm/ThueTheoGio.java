package midterm;

import java.text.DecimalFormat;
import java.util.Date;

public class ThueTheoGio extends DichVuThue {
    private double soGioThue;

    public ThueTheoGio() {
    }

    public ThueTheoGio(double soGioThue, String maXe, String loaiXe, Date ngayThue, double donGia, String dieuKienBangLai) {
        super(maXe, loaiXe, ngayThue, donGia, dieuKienBangLai);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public String toString() { double tt=donGia*soGioThue;
        DecimalFormat df= new DecimalFormat("###,###,###.0");
        
        return super.toString()+"\t"+soGioThue+"\t"+df.format(tinhTienThue()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public double tinhTienThue() {
       return donGia*soGioThue;
    }
    
}
