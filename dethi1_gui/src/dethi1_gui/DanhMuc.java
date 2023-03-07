package dethi1_gui;

public abstract class DanhMuc {
    protected String ten,nxb,namXB,soTrang;
    protected double giaBan,sL;

    public DanhMuc() {
    }

    public DanhMuc(String ten, String nxb, String namXB, String soTrang, double giaBan, double sL) {
        this.ten = ten;
        this.nxb = nxb;
        this.namXB = namXB;
        this.soTrang = soTrang;
        this.giaBan = giaBan;
        this.sL = sL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getNamXB() {
        return namXB;
    }

    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }

    public String getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(String soTrang) {
        this.soTrang = soTrang;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getsL() {
        return sL;
    }

    public void setsL(double sL) {
        this.sL = sL;
    }
    public abstract double tinhThanhTien();
}
