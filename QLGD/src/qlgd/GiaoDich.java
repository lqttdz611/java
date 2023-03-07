package qlgd;

import java.util.Date;

public class GiaoDich {
    protected String maGD;
    protected Date ngayGD;
    protected Double donGia;
    protected int SL;

    public GiaoDich() {
    }

    public GiaoDich(String maGD, Date ngayGD, Double donGia, int SL) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.SL = SL;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    @Override
    public String toString() {
        return maGD + "\t" + ngayGD + "\t"+ SL + "\t" + donGia; //To change body of generated methods, choose Tools | Templates.
    }
    
}
