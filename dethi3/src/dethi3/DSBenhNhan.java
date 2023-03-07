    package dethi3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DSBenhNhan {
    ArrayList<BenhNhan> arr= new ArrayList<>();
    public void themVaoDS(BenhNhan bn) {
        arr.add(bn);
    }
    public double tongVienPhi() {
        double s=0;
        for (BenhNhan bn : arr) {
            s+=bn.vienPhi();
        } return s;
    }
    public BenhNhan timBN(String maBN) {
        for (BenhNhan bn : arr) {
            if(bn.getMa().equalsIgnoreCase(maBN)) {
                return bn;
            }
        }
        return null;
    }
    public ArrayList<BenhNhan> dsBNNT() {
        ArrayList<BenhNhan> dsNgoai= new ArrayList<>();
        for (BenhNhan bn : arr) {
            if(bn instanceof BNNgoaiTru) {
                dsNgoai.add(bn);
            }
        }
        return dsNgoai;
    }
    public double TongVienPhi() {
        double sum=0;
        for (BenhNhan bn : arr) {
            sum+=bn.vienPhi();
        }
        return sum;
    }
    public boolean xoaTruocNgayChiDinh(String ngay){
        SimpleDateFormat sdf=new SimpleDateFormat("dd");
        for (BenhNhan benhNhan : arr) {
            if(benhNhan instanceof BNNoiTru)
            if (sdf.format(((BNNoiTru) benhNhan).getNgayRaVien()).compareToIgnoreCase(ngay)<0) {
             arr.remove(benhNhan);
             return true;
            }
            
            }return false;
        } 
    
   
}
