/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi0702;

/**
 *
 * @author FORMAI
 */
public class TieuThuyet extends DanhMuc {
    private String theLoai;

    public TieuThuyet() {
    }

    public TieuThuyet(String theLoai, String maS, String ten, String nxb, String yxb, int soTr, int SL, double giaBan) {
        super(maS, ten, nxb, yxb, soTr, SL, giaBan);
        this.theLoai = theLoai;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+theLoai; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double tinhThanhTien() {

       return giaBan*3;
    }
    
}
