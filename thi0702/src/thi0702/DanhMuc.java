package thi0702;

public abstract class DanhMuc {
    protected String maS,ten,nxb,yxb;
    protected int soTr,SL;
    protected double giaBan;

    public DanhMuc() {
    }

    public DanhMuc(String maS, String ten, String nxb, String yxb, int soTr, int SL, double giaBan) {
        this.maS = maS;
        this.ten = ten;
        this.nxb = nxb;
        this.yxb = yxb;
        this.soTr = soTr;
        this.SL = SL;
        this.giaBan = giaBan;
    }

    public String getMaS() {
        return maS;
    }

    public void setMaS(String maS) {
        this.maS = maS;
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

    public String getYxb() {
        return yxb;
    }

    public void setYxb(String yxb) {
        this.yxb = yxb;
    }

    public int getSoTr() {
        return soTr;
    }

    public void setSoTr(int soTr) {
        this.soTr = soTr;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return maS+"\t"+ten+"\t"+nxb+"\t"+yxb+"\t"+soTr+"\t"+giaBan+"\t"+SL;
    }
    
    public abstract double tinhThanhTien();
}
