package dethi2_gui;

import java.util.Calendar;
import java.util.Date;

public abstract class Phong implements IPhong {
    protected String maP,hangP;
    protected Date ngayThue,ngayTra;
    protected double donGia;

    public Phong() {
    }

    public Phong(String maP, String hangP, Date ngayThue, Date ngayTra, double donGia) {
        this.maP = maP;
        this.hangP = hangP;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.donGia = donGia;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public String getHangP() {
        return hangP;
    }

    public void setHangP(String hangP) {
        this.hangP = hangP;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getDonGia() {
        
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public double soNgayThue() {
        Calendar c=Calendar.getInstance();
        if(ngayThue.getTime()==ngayTra.getTime()) return 1; else 
        return (double) ((ngayTra.getTime()-ngayThue.getTime())/(24*60*60*1000));
    }
    @Override
    public String toString() {
        return maP+"\t"+hangP+"\t"+ngayThue+"\t"+ngayTra+"\t"+donGia;
    }
    

 
    
}
