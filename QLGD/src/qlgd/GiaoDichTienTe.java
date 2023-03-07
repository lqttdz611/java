/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlgd;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class GiaoDichTienTe extends GiaoDich {
    private double tiGia;
    private String loaiTT;

    public GiaoDichTienTe() {
    }

    public GiaoDichTienTe(double tiGia, String loaiTT, String maGD, Date ngayGD, Double donGia, int SL) {
        super(maGD, ngayGD, donGia, SL);
        this.tiGia = tiGia;
        this.loaiTT = loaiTT;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTT() {
        return loaiTT;
    }

    public void setLoaiTT(String loaiTT) {
        this.loaiTT = loaiTT;
    }
    public double tinhThanhTien() {
        if(loaiTT.equalsIgnoreCase("vn")) {
            return SL*donGia;
        }
        else {
            return SL*donGia*tiGia;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+ tiGia+ "\t" +loaiTT ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
