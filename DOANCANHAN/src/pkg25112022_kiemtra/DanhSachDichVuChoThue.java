package pkg25112022_kiemtra;

import java.util.ArrayList;

public class DanhSachDichVuChoThue {
        ArrayList<DichVuThue> arr = new ArrayList<>();
        public void themVaoDs(DichVuThue dvt) {
            arr.add(dvt);
        }
        public boolean xoaTheoMaXe(String maXe) {
            for (DichVuThue dvt : arr) {
                if(dvt.getMaXe().equalsIgnoreCase(maXe)) {
                    arr.remove(dvt);
                     return true;
                }
            } return false;
        }
        public DichVuThue timXe(String loaiXe) {
            for (DichVuThue dvt : arr) {
                if(dvt.getLoaiXe().equalsIgnoreCase(loaiXe)) {
                    return dvt;
                } 
            }
            return null;
        }
        public double tinhTongTien() {
            double sum=0;
            for (DichVuThue dvt : arr) {
                sum+=dvt.tinhThanhTien();
            }
            return sum;
        }
        public ArrayList<DichVuThue> inDSThueChiDinhGio() {
            ArrayList<DichVuThue> arrTheoGio= new ArrayList<>();
            for (DichVuThue dvt : arr) {
                if(dvt instanceof ThueTheoGio) {
                    arrTheoGio.add(dvt);
                }
            } return arrTheoGio;
        }
        public ArrayList<DichVuThue> inDSThueChiDinhNgay() {
            ArrayList<DichVuThue> arrTheoNgay= new ArrayList<>();
            for (DichVuThue dvt : arr) {
                if(dvt instanceof ThueTheoNgay) {
                    arrTheoNgay.add(dvt);
                }
            } return arrTheoNgay;
        }
        public void SapXep() {
            for (int i = 0; i < arr.size()-1; i++) {
                for (int j = i+1; j < arr.size(); j++) {
                    if(arr.get(i).getDonGia()>arr.get(j).getDonGia()) {
                        DichVuThue temp=arr.set(i, arr.get(i));
                        arr.set(i, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        }
}
