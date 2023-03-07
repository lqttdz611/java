package midterm;

import java.util.ArrayList;

public class DanhSachChoThue {
        ArrayList<DichVuThue> arr= new ArrayList<>();
        public void themVaoDS(DichVuThue dvt) {
            arr.add(dvt);
        }
        public boolean xoaMaXe(String maXe) {
            for (DichVuThue dvt : arr) {
                if(dvt.getMaXe().equalsIgnoreCase(maXe)) {
                    arr.remove(dvt);
                }
            } return true;
        }
        ArrayList<DichVuThue> timKiemXe(String loaiXe) {
            ArrayList<DichVuThue> dsTimKiem= new ArrayList<>();
            for (DichVuThue dvt : arr) {
                if(dvt.getLoaiXe().equalsIgnoreCase(loaiXe)) {
                    dsTimKiem.add(dvt);
                }
            } return dsTimKiem;
        }
        public double tinhTongTien() {
            double sum=0;
            for (DichVuThue dvt : arr) {
                sum+=dvt.tinhTienThue();
            } return sum;
        }
        ArrayList<DichVuThue> dsTheoGio() {
            ArrayList<DichVuThue> dsGio= new ArrayList<>();
            for (DichVuThue dvt : arr) {
                if(dvt instanceof ThueTheoGio) {
                    dsGio.add(dvt);
                }
            } return dsGio;
        }
         ArrayList<DichVuThue> dsTheoNgay() {
            ArrayList<DichVuThue> dsNgay= new ArrayList<>();
            for (DichVuThue dvt : arr) {
                if(dvt instanceof ThueTheoNgay) {
                    dsNgay.add(dvt);
                }
            } return dsNgay;
        }
}
