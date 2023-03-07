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
public class SachGiaoKhoa extends DanhMuc{
private String khoi;

    @Override
    public String toString() {
//         System.out.println("Ten \t\t NXB \t\t NamXB \t Gia Ban \t So Trang \t SL");
        //System.out.print("Khoi \t Thanh tien");
        return super.toString()+"\t"+"\t"+khoi+"\t\t"+tinhThanhTien(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKhoi() {
        return khoi;
    }

    public void setKhoi(String khoi) {
        this.khoi = khoi;
    }

    public SachGiaoKhoa(String khoi, String ten, String nhaXB, String namXB, int soTrang, int giaBan, int SL) {
        super(ten, nhaXB, namXB, soTrang, giaBan, SL);
        this.khoi = khoi;
    }

    public SachGiaoKhoa() {
    }

    @Override
    public double tinhThanhTien() {
return (SL*giaBan) * 80/100;
    }
    
}
