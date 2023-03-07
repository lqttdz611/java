/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dethi4;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author FORMAI
 */
public class BAOHIEMXAHOI extends BenhNhan {
    private String maBHXH;

    public BAOHIEMXAHOI() {
    }

    public BAOHIEMXAHOI(String maBHXH, String maBN, String hoTen, Date ngayNV, Date ngayRV, boolean phongYC) {
        super(maBN, hoTen, ngayNV, ngayRV, phongYC);
        this.maBHXH = maBHXH;
    }

    public String getMaBHXH() {
        return maBHXH;
    }

    public void setMaBHXH(String maBHXH) {
        this.maBHXH = maBHXH;
    }
    

    @Override
    public double tinhVienPhi() {
        if(phongYC) {
            return tinhSoNgay()*DON_GIA*200000;
        } else {
            return tinhSoNgay()*DON_GIA;
        }
    }
    DecimalFormat df = new DecimalFormat("#,###,###.0");
    @Override
    public String toString() {
        return super.toString()+"\t"+maBHXH+"\t"+df.format(tinhVienPhi()); //To change body of generated methods, choose Tools | Templates.
    }

  

   

}
