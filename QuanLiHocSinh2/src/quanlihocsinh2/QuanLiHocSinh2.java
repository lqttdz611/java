
package quanlihocsinh2;


public class QuanLiHocSinh2 {

    public static void main(String[] args) {
        // TODO code application logic here
        QuanLy ql = new QuanLy();
            //ql.themMoi();
            ql.docFile("input.txt");
            ql.inDSHS(); //toString
            System.out.println("DSHS co DTB >5: ");
            //ql.inDTBMon5();
            ql.ghiFile("output.txt");
    }
    
}
