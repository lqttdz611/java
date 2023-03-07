package qlsach;

import java.util.ArrayList;

public class DanhSachSach {
        ArrayList<Sach> a = new ArrayList<>();
        public void themMoi(Sach s) {
            a.add(s);
        }
        public double tinhTongTien() {
            double tong=0;
            for (Sach s : a) {
                if(s instanceof SachGK) {
                    tong+=((SachGK) s).thanhTien();
                } else {
                    SachTK stk = (SachTK) s;
                    tong+=stk.thanhTien();
                }
            }
            return tong;
        }
        public boolean xoaTheoMaSach(String maSach) {
            for (Sach s : a) {
                if(s.getMaSach().equalsIgnoreCase(maSach)) {
                    a.remove(s);
                    return true;
                }
            }
            return false;
        }
        public Sach timTheoMaSach(String maSach) {
            for (Sach s : a) {
                if(s.getMaSach().equalsIgnoreCase(maSach.trim())) {
                    
                    return s;
                }
                
            } return null;
        }
        public boolean timSGK(String NXB) {
            for (Sach s : a) {
                if(s instanceof SachGK) {
                if(s.getNhaXB().equalsIgnoreCase(NXB)){
                    System.out.println(s);
                    return true;
                }
            }
            }
            return false;
        }
//        public boolean TBCDonGia() {
//            for (Sach s : a) {
//                if(a.contains(s.donGia)) return true;
//            }
//            return false;
//        }
//        public double tinhTBCDonGia() {
//            int dem=0;
//            double sum=0;
//            for (Sach s : a) {
//                if(TBCDonGia()) { 
//                    dem++;
//                    sum+=s.donGia;
//                }
//            }
//            return sum/dem;
//        }
}
