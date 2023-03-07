package dethi4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class BenhNhan implements IVIENPHI {
    protected String maBN,hoTen;
    protected Date ngayNV,ngayRV;
    protected boolean phongYC;

    public BenhNhan() {
    }

    public BenhNhan(String maBN, String hoTen, Date ngayNV, Date ngayRV, boolean phongYC) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.ngayNV = ngayNV;
        this.ngayRV = ngayRV;
        this.phongYC = phongYC;
    }
    public int tinhSoNgay() {
        Calendar c=Calendar.getInstance();
        return (int) ((ngayRV.getTime()-ngayNV.getTime())/(24*60*60*1000));
    }

    public String getMaBN() {
        return maBN;
    }

    public void setMaBN(String maBN) {
        this.maBN = maBN;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayNV() {
        return ngayNV;
    }

    public void setNgayNV(Date ngayNV) {
        this.ngayNV = ngayNV;
    }

    public Date getNgayRV() {
        return ngayRV;
    }

    public void setNgayRV(Date ngayRV) {
        this.ngayRV = ngayRV;
    }

    public boolean isPhongYC() {
        return phongYC;
    }

    public void setPhongYC(boolean phongYC) {
        this.phongYC = phongYC;
    }
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yy").format(d);
    }
    
    @Override
    public String toString() {
        return maBN+"\t"+hoTen+"\t"+chuyenNgayThanhChuoi(ngayNV)+"\t"+chuyenNgayThanhChuoi(ngayRV)+"\t"+phongYC+"\t"+tinhSoNgay();
    }
    
    
}
