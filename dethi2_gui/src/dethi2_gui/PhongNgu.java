package dethi2_gui;

import java.util.Date;

/**
 *
 * @author FORMAI
 */
public class PhongNgu extends Phong{
    private int soGiuong;

    public PhongNgu() {
    }

    public PhongNgu(int soGiuong, String maP, String hangP, Date ngayThue, Date ngayTra, double donGia) {
        super(maP, hangP, ngayThue, ngayTra, donGia);
        this.soGiuong = soGiuong;
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        this.soGiuong = soGiuong;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\t"+soGiuong; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public double tinhTienThue() {
        return donGia*soNgayThue();
    }
    
}
