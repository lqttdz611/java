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
public class TieuThuyet extends DanhMuc {

    private String theLoai;

    @Override
    public String toString() {
         //System.out.println("Ten \t\t NXB \t\t NamXB \t Gia Ban \t So Trang \t SL");
        //System.out.print("The Loai \t Thanh Tien");
        return ten+"\t "+nhaXB+"\t"+namXB+"\t\t"+giaBan+" "+"\t\t"+soTrang+"\t\t"+SL+ "\t\t"+theLoai+ "\t"+tinhThanhTien(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public TieuThuyet(String theLoai, String ten, String nhaXB, String namXB, int soTrang, int giaBan, int SL) {
        super(ten, nhaXB, namXB, soTrang, giaBan, SL);
        this.theLoai = theLoai;
    }

    public TieuThuyet() {
    }

    @Override
    public double tinhThanhTien() {
        return (giaBan*SL)*60/100;
    }

}
