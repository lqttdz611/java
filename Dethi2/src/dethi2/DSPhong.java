package dethi2;

import java.util.ArrayList;

public class DSPhong {
    ArrayList<Phong> arr = new ArrayList<>();
    public void themVaoDS(Phong p) {
        arr.add(p);
    }
    double tinhTongTienPhong() {
        int sum=0;
        for (Phong phong : arr) {
            sum+=phong.tinhTienThue();
        }
        return sum;
    }
    ArrayList<Phong> layDSTheoHang(String hangPhong) {
        ArrayList<Phong> dsTheoHang= new ArrayList<>();
        for (Phong p : arr) {
            if(p.getHangPhong().equalsIgnoreCase(hangPhong))
                dsTheoHang.add(p);
        }
        return dsTheoHang;
    }
    public boolean xoaTheoMaPhong(String maPhong) {
        for (Phong p : arr) {
            if(p.getMaPhong().equalsIgnoreCase(maPhong)) {
                arr.remove(p);
               return true;
            }
        } return false;
    }
    
}
