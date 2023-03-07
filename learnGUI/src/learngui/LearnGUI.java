
package learngui;

import javax.swing.JOptionPane;

public class LearnGUI {

    public static void main(String[] args) {
            //JOptionPane.showMessageDialog(null, "Hom nay la thu nam");
            
//            String st=JOptionPane.showInputDialog("Nhap ho va ten");
//            JOptionPane.showMessageDialog(null, st);

//        int i=JOptionPane.showConfirmDialog(null, "Ban co tiep tuc CT hay kh","Thong Bao", JOptionPane.YES_NO_OPTION);
//        JOptionPane.showConfirmDialog(null, i);
        int st;
           do {
            try {
                String i=JOptionPane.showInputDialog("Nhap so nguyen: ");
                int n=Integer.parseInt(i);

//            if(n%2==0) {
//            JOptionPane.showMessageDialog(null, "So chan");
//            } else {
//                JOptionPane.showMessageDialog(null, "So le");
//            }
            
            String mess=(n%2==0?"So chan":"So le");
            JOptionPane.showMessageDialog(null, mess);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nhap sai kieu du lieu ");
            }
            st = JOptionPane.showConfirmDialog(null, "Ban muon tt?", "Thong bao", 0);
           
           
           }
              while(st==0);
    
}
}
