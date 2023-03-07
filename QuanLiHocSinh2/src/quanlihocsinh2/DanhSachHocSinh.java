/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlihocsinh2;

import java.util.ArrayList;





public class DanhSachHocSinh {
	ArrayList<HocSinh> stu= new ArrayList<>();
   void themVaoDS(HocSinh hs) {
	stu.add(hs); //them hoc sinh vao danh sach stu
}
	public ArrayList<HocSinh> layDSDTBHon5() {
	ArrayList<HocSinh> dsMoi=new ArrayList<>();
	for (HocSinh hs:stu) {
		if(hs.tinhDTB()>=5) {
			dsMoi.add(hs);	
		}
	}
	return dsMoi;
    }
}
