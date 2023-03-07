package qlnhanvien;

import java.util.Date;

public class NVBienChe extends NhanVien {
    private double hesoLuong;

    public NVBienChe() {
    }

    public NVBienChe(double hesoLuong, String cmnd, String hoTen, String phongBan, Date ngayVaolam) {
        super(cmnd, hoTen, phongBan, ngayVaolam);
        this.hesoLuong = hesoLuong;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t\t"+ hesoLuong+"\t\t"+tinhPhuCap()+"\t"+tinhLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public double tinhPhuCap() {
        return 1000000;
    }
    public double tinhLuong() {
        return tinhPhuCap()+hesoLuong*115000;
    }
}
