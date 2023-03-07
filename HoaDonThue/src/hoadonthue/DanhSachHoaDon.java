package hoadonthue;

import java.util.ArrayList;

public class DanhSachHoaDon {
    ArrayList<HoaDon> arr = new ArrayList<>();
    public void themVaoDs(HoaDon hd) {
        arr.add(hd);
    }
    public boolean xoaTheoMaHD(String maHD) {
        for (HoaDon hd : arr) {
            if(hd.getMaHD().equalsIgnoreCase(maHD)) {
            arr.remove(hd);
            return true;
        }
    } return false;
}
    public ArrayList<HoaDon> timTheoMaHD(String maHD) {
        ArrayList<HoaDon> dsnew= new ArrayList<>();
        for (HoaDon hd : arr) {
            if(hd.getMaHD().equalsIgnoreCase(maHD)) {
                dsnew.add(hd);
            } else { 
                System.out.println("K0 tim thay !!");
                    break;
            }
        } return dsnew;
    }
    public double tongThanhTien() {
        double s=0;
        for (HoaDon hd : arr) {
            s+=hd.tinhThanhTien();
        } return s;
    } 
}
