package jtable_file;

import java.util.ArrayList;

public class DanhSachNhanVien {
    ArrayList<NhanVien> arr= new ArrayList<>();
    public void themVaoDS(NhanVien nv) {
        arr.add(nv);
    }
    public NhanVien timTheoCMND(String cmnd) {
        for (NhanVien nv : arr) {
            if(nv.getCMND().equalsIgnoreCase(cmnd)) {
                return nv;
            }
        } return null;
    }
    public void xoaTheoCMND(String cmnd) {
//        for (NhanVien nhanVien : arr) {
//            if(nhanVien.getCMND().equalsIgnoreCase(cmnd)) {
//                arr.remove(nhanVien);
//                
//            }
//        } 
        NhanVien nv= timTheoCMND(cmnd);
        if(nv!=null) {
            arr.remove(nv);
        }
    }
    public void sapXepHSL() {
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i).getHSL()<arr.get(j).getHSL()) {
                    NhanVien temp=arr.set(i, arr.get(i));
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    
                }
            }
        } 
    }
}
