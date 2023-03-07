package qlnhanvien;

import java.util.ArrayList;

public class DanhSachNhanVien {
    ArrayList<NhanVien> arr = new ArrayList<>();
    public void themVaoDS(NhanVien nv) {
        arr.add(nv);
    }
    public boolean xoaTheoCMND(String cmnd) {
        for (NhanVien nv : arr) {
            if(nv.getCmnd().equalsIgnoreCase(cmnd)) {
            arr.remove(nv);
                return true;
            }
            
        } return false;
    }
    public NhanVien timNVtheoCMND(String cmnd) {
        for (NhanVien nv : arr) {
            if(nv.getCmnd().equalsIgnoreCase(cmnd)) {
                return nv;
            }
        } return null;
    }
    public double tinhTongLuong() {
        int tong=0;
        for (NhanVien nv : arr) {
            if(nv instanceof NVBienChe) {
            tong+=((NVBienChe) nv).tinhLuong();
        } else {
             tong+=((NVHopDong) nv).tinhLuong();
            }
    } return tong;
    }
    public double maxLuong() {
        double max=0;
        for (NhanVien nv : arr) {
            if(nv.tinhLuong()>max) {
                max=nv.tinhLuong();
            }
        } return max;
    } 
    public ArrayList<NhanVien> dsMaxLuong() {
        ArrayList<NhanVien> dsTheoLuong= new ArrayList<>();
        for (NhanVien nv : arr) {
            if(nv.tinhLuong()==maxLuong()) {
                dsTheoLuong.add(nv);
            }
        } return dsTheoLuong;
    }
     public ArrayList<NhanVien> dsChiDinh() {
            ArrayList<NhanVien> nvChiDinh = new ArrayList<>();
            for (NhanVien nv : arr) {
                if(nv instanceof NVBienChe) {
                    nvChiDinh.add(nv);
                }
            } return nvChiDinh;
        } 
     public ArrayList<NhanVien> dsChiDinh2() {
            ArrayList<NhanVien> nvChiDinh2 = new ArrayList<>();
            for (NhanVien vn : arr) {
             if(vn instanceof NVHopDong) {
                 nvChiDinh2.add(vn);
             }
         } return nvChiDinh2;
     }
}

