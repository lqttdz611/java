
import java.util.Date;

public class SinhVien extends ThanhVien {

    float diemTB;

    public SinhVien(float diemTB, String ma, String ten, String namHoc, Date ngaySinh) {
        super(ma, ten, namHoc, ngaySinh);
        this.diemTB = diemTB;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }

    @Override
    public double tinhThuong() {
        if (diemTB >= 9) {
            return 5000000;
        } else if (diemTB >= 8) {
            return 3000000;
        } else {
            return 0;
        }
    }

}
