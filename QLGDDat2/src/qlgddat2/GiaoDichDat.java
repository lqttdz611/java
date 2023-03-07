package qlgddat2;

import java.util.Date;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat() {
    }

    public GiaoDichDat(String loaiDat, String maGD, Date ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    public double tinhThanhTien() {
        if(loaiDat.equalsIgnoreCase("A")) {
            return dienTich*donGia*1.5;
        } else return dienTich*donGia;
    }
     

    @Override
    public String toString() {
        return super.toString()+"\t"+loaiDat+"\t"+tinhThanhTien(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
