
import java.util.Date;


public abstract class ThanhVien implements IThanhVien{
    String ma, ten, namHoc;
    Date ngaySinh;

    public ThanhVien() {
    }

    public ThanhVien(String ma, String ten, String namHoc, Date ngaySinh) {
        this.ma = ma;
        this.ten = ten;
        this.namHoc = namHoc;
        this.ngaySinh = ngaySinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
