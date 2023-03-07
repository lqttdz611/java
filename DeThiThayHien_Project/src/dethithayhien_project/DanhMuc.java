/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dethithayhien_project;

/**
 *
 * @author HP
 */
public abstract class DanhMuc {
    protected  String ten,nhaXB, namXB;
    protected int soTrang, giaBan, SL;

    public DanhMuc() {
    }

    public DanhMuc(String ten, String nhaXB, String namXB, int soTrang, int giaBan, int SL) {
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
        this.soTrang = soTrang;
        this.giaBan = giaBan;
        this.SL = SL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getNamXB() {
        return namXB;
    }

    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    @Override
    public String toString() {
//        System.out.println("Ten \t\t NXB \t\t NamXB \t Gia Ban \t So Trang \t SL");
return ten+"\t \t"+" "+nhaXB+"\t"+namXB+"\t\t"+giaBan+"\t\t"+soTrang+"\t\t"+SL;
    }
    public abstract double  tinhThanhTien();
}
