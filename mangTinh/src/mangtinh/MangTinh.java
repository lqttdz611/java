
package mangtinh;

import java.util.Random;
import java.util.Scanner;

public class MangTinh {
    public static void taoMang (int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = new Random().nextInt(100);
        }
    }
    public static void inMang(int a[], int n) {
        System.out.println("Mang vua tao: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int n=s.nextInt();
        int a[] = new int[n];
        taoMang(a,n);
        inMang(a,n);
        // TODO code application logic here
    }
    
}
