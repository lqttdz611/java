package qlnhanvien;

import java.util.Date;

public class NVHopDong extends NhanVien {
    private int tongGiolam, tienCong1h;

    public NVHopDong() {
    }

    public NVHopDong(int tongGiolam, int tienCong1h, String cmnd, String hoTen, String phongBan, Date ngayVaolam) {
        super(cmnd, hoTen, phongBan, ngayVaolam);
        this.tongGiolam = tongGiolam;
        this.tienCong1h = tienCong1h;
    }

    public int getTongGiolam() {
        return tongGiolam;
    }

    public void setTongGiolam(int tongGiolam) {
        this.tongGiolam = tongGiolam;
    }

    public int getTienCong1h() {
        return tienCong1h;
    }

    public void setTienCong1h(int tienCong1h) {
        this.tienCong1h = tienCong1h;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+tongGiolam+"\t"+tienCong1h+ "\t\t" +tinhPhuCap()+"\t"+tinhLuong(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public double tinhPhuCap() {
        return 1000000;
    }
    public double tinhLuong() {
        return tinhPhuCap()+tongGiolam*tienCong1h;
    }
    
}
