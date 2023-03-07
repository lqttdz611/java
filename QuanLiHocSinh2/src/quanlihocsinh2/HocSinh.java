
package quanlihocsinh2;

public class HocSinh {
    private String hoTen,lop;
    private double diemToan,diemLi,diemHoa;
    
     HocSinh() {
        
    }
    public HocSinh(String hoTen, String lop, double diemToan, double diemLi, double diemHoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemLi = diemLi;
        this.diemHoa = diemHoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLi() {
        return diemLi;
    }

    public void setDiemLi(double diemLi) {
        this.diemLi = diemLi;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }
    double tinhDTB() {
        return (diemToan+diemLi+diemHoa)/3;
    }

    @Override
    public String toString() {
        return hoTen + "\t" + lop + "\t" + diemToan +" "+ diemLi +" "+ diemHoa+" "+tinhDTB();
    }
    
}
