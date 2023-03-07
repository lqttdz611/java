package midterm;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DichVuThue implements IChoThueXe {
    protected String maXe;
    protected String loaiXe;
    protected Date ngayThue;
    protected double donGia;
    protected String dieuKienBangLai;

    public DichVuThue() {
    }

    public DichVuThue(String maXe, String loaiXe, Date ngayThue, double donGia, String dieuKienBangLai) {
        this.maXe = maXe;
        this.loaiXe = loaiXe;
        this.ngayThue = ngayThue;
        this.donGia = donGia;
        this.dieuKienBangLai = dieuKienBangLai;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getDieuKienBangLai() {
        return dieuKienBangLai;
    }

    public void setDieuKienBangLai(String dieuKienBangLai) {
        this.dieuKienBangLai = dieuKienBangLai;
    }
    public String chuyenNgayThanhChuoi(Date d) {
        return new SimpleDateFormat("dd/MM/yyyy").format(d);
    }

    @Override
    public String toString() {
        return maXe+"\t"+loaiXe+"\t"+chuyenNgayThanhChuoi(ngayThue)+"\t"+donGia+"\t"+dieuKienBangLai;
    }
    
    
}
