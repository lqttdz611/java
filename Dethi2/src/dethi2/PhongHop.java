package dethi2;

import java.util.Date;

public class PhongHop extends Phong {
    private int soGhe;

    public PhongHop() {
    }

    public PhongHop(int soGhe, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, donGia);
        this.soGhe = soGhe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
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
        return super.toString()+"\t"+soGhe+"\t"+tinhTienThue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    @Override
    public double tinhTienThue() {
        return donGia*soNgayThue();
    }
    
}
