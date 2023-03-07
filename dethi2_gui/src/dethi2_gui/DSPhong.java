package dethi2_gui;

import java.util.ArrayList;

public class DSPhong {
    
    ArrayList<Phong> arr= new ArrayList<>();
    public void themVaoDS(Phong p) {
        arr.add(p);
    }
    public boolean xoaTheoMaPhong(String maP) {
        for (Phong p : arr) {
            if(p.getMaP().equalsIgnoreCase(maP)) {
                arr.remove(p);
               return true;
            }
        } return false;
    }
    public Phong timP(String maP) {
        for (Phong phong : arr) {
            if(phong.getMaP().equalsIgnoreCase(maP)) return 
                    phong;
        }
        return null;
    }
}
