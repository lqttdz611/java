/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethi1_gui;

/**
 *
 * @author FORMAI
 */
public class SachGiaoKhoa extends DanhMuc {
    private int khoiLop;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int khoiLop, String ten, String nxb, String namXB, String soTrang, double giaBan, double sL) {
        super(ten, nxb, namXB, soTrang, giaBan, sL);
        this.khoiLop = khoiLop;
    }

    public int getKhoiLop() {
        return khoiLop;
    }

    public void setKhoiLop(int khoiLop) {
        this.khoiLop = khoiLop;
    }
    
    @Override
    public double tinhThanhTien() {
//        return sL*giaBan*(80/100);
return 1000;
    }
    
}
