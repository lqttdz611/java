
import java.util.ArrayList;


public class DanhSachThanhVien {
    ArrayList<ThanhVien> a=new ArrayList<>();
    public void themVaoDS(ThanhVien tv){
    a.add(tv);
    }
    public  boolean xoaTheoMaTV(String maTV){
        for (ThanhVien tv : a) {
            if (tv.getMa().equalsIgnoreCase(maTV)) {
                a.remove(tv);
                return true;
            }
        }
        return false;
    }
    public ThanhVien timTheoMaTV(String maTV){
        for (ThanhVien tv : a) {
            if (tv.getMa().equalsIgnoreCase(maTV)) {
                return tv;
            }
        }
        return null;
    }
    public ArrayList<ThanhVien> layDSTheoTen(String ten){
    ArrayList<ThanhVien> dsMoi=new ArrayList<>();
        for (ThanhVien tv : a) {
            if (tv.getTen().contains(ten)) {
                dsMoi.add(tv);
            }
        }
        return  dsMoi;
    }
    public void sapXep(){
        for (int i = 0; i < a.size()-1; i++) {
            for (int j = i+1; j < a.size(); j++) {
                if (a.get(i).tinhThuong()>a.get(j).tinhThuong()) {//chua dung
                    ThanhVien temp=a.set(i, a.get(i));
                    a.set(i, a.get(j));
                    a.set(j, temp);
                }
                
            }
            
        }
    }
}
