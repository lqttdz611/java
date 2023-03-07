package qlgddat2;

import java.util.ArrayList;

public class DanhSachGD {
    
    ArrayList<GiaoDich> arr = new ArrayList<>();
   public void themVaoDs(GiaoDich gd) {
       arr.add(gd);
   }
//    public boolean xoaTheoNam(long namGD) {
//       for (GiaoDich gd : arr) {
//           if(gd.getNam()==namGD) {
//               arr.remove(gd);
//               return true;
//           }
//       } return false;
//   }
   public boolean xoaTheoMa(String maGD) {
       for (GiaoDich gd : arr) {
           if(gd.getMaGD().equalsIgnoreCase(maGD)) {
               arr.remove(gd);
               return true;
           }
       } return false;
   }
   public ArrayList<GiaoDich> timMaGD(String maGD) {
       ArrayList<GiaoDich> dsTimKiem = new ArrayList<>();
       for (GiaoDich gg : arr) {
           if(gg.getMaGD().equalsIgnoreCase(maGD)) {
               dsTimKiem.add(gg);
           }
       } return dsTimKiem;
   } 
   public ArrayList<GiaoDich> inDSTheoLoai() {
       ArrayList<GiaoDich> dsnew = new ArrayList<>();
       for (GiaoDich gg : arr) {
           if(gg instanceof GiaoDichDat) {
               dsnew.add(gg);
           }
       }
       return dsnew;
   }
   public ArrayList<GiaoDich> inDSTheoLoai2() {
       ArrayList<GiaoDich> dsnew2 = new ArrayList<>();
       for (GiaoDich gg : arr) {
           if(gg instanceof GiaoDichDat) {
               dsnew2.add(gg);
           }
       }
       return dsnew2;
   }
//   public ArrayList<GiaoDich> dsGDTheoNam(long namGD) {
//       ArrayList<GiaoDich> dsYear= new ArrayList<>();
//       for (GiaoDich gg : arr) {
//           if(gg.getNam()==namGD) {
//               dsYear.remove(gg);
//           } 
//            else {
//               System.out.println("K0 co GD!!");
//               break;
//           }
//       } return dsYear;
//   }
   
}
