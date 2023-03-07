package qlgddat2;

import java.util.Date;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String maGD, Date ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
     @Override
    public double tinhThanhTien() {
            if(loaiNha.equalsIgnoreCase("Pho")) {
                return dienTich*donGia;
            } else 
                
                return dienTich*donGia*90/100;
    }
     

    @Override
    public String toString() {
        return super.toString()+"\t"+loaiNha+"\t"+tinhThanhTien(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
