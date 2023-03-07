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
public class GiaoDichVang extends GiaoDich {
    private String loaiVang;
    public GiaoDichVang() {
    }

    public GiaoDichVang(String loaiVang, String maGD, Date ngayGD, Double donGia, int SL) {
        super(maGD, ngayGD, donGia, SL);
        this.loaiVang = loaiVang;
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    
    public double tinhThanhTien() {
        return SL*donGia;
    }

    @Override
    public String toString() {
        return super.toString()+"\t" + loaiVang; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
