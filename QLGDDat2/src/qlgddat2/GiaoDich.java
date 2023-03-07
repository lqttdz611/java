package qlgddat2;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class GiaoDich implements IGiaoDich {
    protected String maGD;
        protected Date ngayGD;
        protected double donGia;
        protected double dienTich;
        
        public GiaoDich() {
    }

    public GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
     public long getNam() {
       return (ngayGD.getTime())/(31536000*1000);
   }
     public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }
    @Override
    public String toString() {
        return maGD + "\t" + chuyenNgayThanhChuoi(ngayGD) + "\t" + donGia + "\t" +dienTich;
       }
        
    
        
}
