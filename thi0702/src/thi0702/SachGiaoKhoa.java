/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi0702;

/**
 *
 * @author FORMAI
 */
public class SachGiaoKhoa extends DanhMuc{
    private int khoiLop;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(int khoiLop, String maS, String ten, String nxb, String yxb, int soTr, int SL, double giaBan) {
        super(maS, ten, nxb, yxb, soTr, SL, giaBan);
        this.khoiLop = khoiLop;
    }

    public int getKhoiLop() {
        return khoiLop;
    }

    public void setKhoiLop(int khoiLop) {
        this.khoiLop = khoiLop;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+khoiLop; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double tinhThanhTien() {
        return giaBan*3;
    }
    
}
