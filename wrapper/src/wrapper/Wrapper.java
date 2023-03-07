/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wrapper;

/**
 *
 * @author FORMAI
 */
public class Wrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*     Chuyển từ cơ sở sang Wrapper  
        // dung new
        Integer i=new Integer(100);
        // gan truc tiep
        Double d=50.5;
        System.out.println("i =" + i);
        System.out.println("d = "+ d);
        
        //Chuyen tu wrapper sang co so
        Integer j=200;
        int k=j.intValue();
        System.out.println("k = "+ k);
*/
 
/*
        //parseXXX(String); Chuyển chuỗi thành Giá trị
        int i=Integer.parseInt("1000");
        float f=Float.parseFloat("10.5");
        double d =Double.parseDouble("20.75");
        System.out.println("i = "+ i);
        System.out.println("f = "+ f);
        System.out.println("d = "+ d);
*/

/*
        //toString(x); chuyển Giá Trị thành Chuỗi
        String s=Integer.toString(20);
        String maSV="SV "+ s;
        System.out.println("Ma SV : "+ maSV);
*/

/*        
        //compareTo(x); So sánh 2 giá trị của 2 lớp có cùng kiểu dữ liệu
        Integer i1=10;
        Integer i2=20;
        if(i1.compareTo(i2)==0) {
            System.out.println("Hai gia tri bang nhau ");
        } else if(i1.compareTo(i2) > 0) {
            System.out.println("i1 lon hon i2 ");
        } else {
            System.out.println("i1 nho hon i2 ");
        }
*/


        //equals(x): So sánh các giá trị của các lớp
        Double d1 =25.5;
        Double d2 =30.5;
        if (d1.equals(d2)) {
            System.out.println("Hai gia tri giong nhau ");
            
        } else {
            System.out.println("Hai gia tri khac nhau ");
        }
    }
    
}
