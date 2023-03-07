/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test0702;

import java.util.ArrayList;

/**
 *
 * @author FORMAI
 */
public class DanhSachHocSinh {
    ArrayList<HocSinh> arr= new ArrayList<>();
    public void themVaoDS(HocSinh hs) {
        arr.add(hs);
       
    }
    public boolean xoaHSTheoMa(String maHS) {
        for (HocSinh hs : arr) {
            if(hs.getMaHS().equalsIgnoreCase(maHS)) {
                arr.remove(hs);
                return true;
            }
        }
        return false;
    }
}
