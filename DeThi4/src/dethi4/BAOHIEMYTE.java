package dethi4;

import java.text.DecimalFormat;
import java.util.Date;

public class BAOHIEMYTE extends BenhNhan {
    private String maBHYT;

    public BAOHIEMYTE() {
    }

    public BAOHIEMYTE(String maBHYT, String maBN, String hoTen, Date ngayNV, Date ngayRV, boolean phongYC) {
        super(maBN, hoTen, ngayNV, ngayRV, phongYC);
        this.maBHYT = maBHYT;
    }

    
    
    
    public String getMaBHYT() {
        return maBHYT;
    }

    public void setMaBHYT(String maBHYT) {
        this.maBHYT = maBHYT;
    }
    
    @Override
    public double tinhVienPhi() {
           if(phongYC) {
               return (tinhSoNgay()*DON_GIA*200000)-((tinhSoNgay()*DON_GIA)*70/100);
           } else {
               return (tinhSoNgay()*DON_GIA)-((tinhSoNgay()*DON_GIA)*70/100);
           }
    }
    DecimalFormat df = new DecimalFormat("#,###,###.0");
    @Override
    public String toString() {
        return super.toString()+"\t"+maBHYT+"\t"+df.format(tinhVienPhi()); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
    

