/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test0702;

/**
 *
 * @author FORMAI
 */
public class Khoi_B extends HocSinh {
    private double monSinh;

    public Khoi_B() {
    }

    public Khoi_B(double monSinh, String maHS, String hoTen, String ngaySinh, String gioiTinh, String lop, double monToan, double monHoa) {
        super(maHS, hoTen, ngaySinh, gioiTinh, lop, monToan, monHoa);
        this.monSinh = monSinh;
    }

    public double getMonSinh() {
        return monSinh;
    }

    public void setMonSinh(double monSinh) {
        this.monSinh = monSinh;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+monSinh; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public double getDiemTrungBinh() {
        return ((monSinh*2)+monHoa+monToan)/3;
    }
    
}
