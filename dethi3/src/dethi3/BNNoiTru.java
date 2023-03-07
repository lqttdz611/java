package dethi3;

import java.util.Date;

public class BNNoiTru extends BenhNhan {

    private double phiNgay;
    private Date ngayRaVien;

    public BNNoiTru() {
    }

    public BNNoiTru(double phiNgay, Date ngayRaVien, String ma, String hoTen, Date ngayVao, double tienThuoc) {
        super(ma, hoTen, ngayVao, tienThuoc);
        this.phiNgay = phiNgay;
        this.ngayRaVien = ngayRaVien;
    }

   

    public double getPhiNgay() {
        return phiNgay;
    }

    public void setPhiNgay(double phiNgay) {
        this.phiNgay = phiNgay;
    }

    public Date getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(Date ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public double phiThuoc() {
        return tienThuoc * tinhSoNgay();
    }

    public double tinhSoNgay() {
        return 2;
//        return (ngayRaVien.getTime() - ngayVao.getTime()) / (24*60*60*10000);
    }

    @Override
    public double vienPhi() {
        return (tinhSoNgay() * phiNgay) + phiThuoc();
    }

}
