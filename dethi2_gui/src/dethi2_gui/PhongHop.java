/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethi2_gui;

import java.util.Date;

/**
 *
 * @author FORMAI
 */
public class PhongHop extends Phong{
    private int soGhe;

    public PhongHop() {
    }

    public PhongHop(int soGhe, String maP, String hangP, Date ngayThue, Date ngayTra, double donGia) {
        super(maP, hangP, ngayThue, ngayTra, donGia);
        this.soGhe = soGhe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+soGhe; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
    public double tinhTienThue() {
        return donGia*soNgayThue();
    }
    
}
