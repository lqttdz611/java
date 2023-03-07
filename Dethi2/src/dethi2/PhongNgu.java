package dethi2;

import java.util.Date;


public class PhongNgu extends Phong {
    private int soGiuong;

    public PhongNgu() {
    }

    public PhongNgu(int soGiuong, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, donGia);
        this.soGiuong = soGiuong;
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        this.soGiuong = soGiuong;
    }
    public long soNgayThue() {
        if(chuyenNgayThanhChuoi(ngayThue).equals(chuyenNgayThanhChuoi(ngayTra))) {
            return 1;
        } else {
            return (ngayTra.getTime()-ngayThue.getTime())/(24*60*60*1000);
        }
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+ soGiuong+ "\t"+tinhTienThue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    @Override
    public double tinhTienThue() {
        return donGia*soNgayThue();
    }
}
