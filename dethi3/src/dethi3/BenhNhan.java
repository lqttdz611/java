package dethi3;

import java.util.Date;

public abstract class BenhNhan implements IBenhNhan{
    protected String ma,hoTen;
    protected Date ngayVao;
    protected double tienThuoc;

    public BenhNhan() {
    }

    public BenhNhan(String ma, String hoTen, Date ngayVao, double tienThuoc) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngayVao = ngayVao;
        this.tienThuoc = tienThuoc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(Date ngayVao) {
        this.ngayVao = ngayVao;
    }

    public double getTienThuoc() {
        return tienThuoc;
    }

    public void setTienThuoc(double tienThuoc) {
        this.tienThuoc = tienThuoc;
    }
      
}
