
import java.util.Date;


public class GiangVien extends ThanhVien{
int soBaiBao, soDeTai;

    public GiangVien(int soBaiBao, int soDeTai, String ma, String ten, String namHoc, Date ngaySinh) {
        super(ma, ten, namHoc, ngaySinh);
        this.soBaiBao = soBaiBao;
        this.soDeTai = soDeTai;
    }

    public int getSoBaiBao() {
        return soBaiBao;
    }

    public void setSoBaiBao(int soBaiBao) {
        this.soBaiBao = soBaiBao;
    }

    public int getSoDeTai() {
        return soDeTai;
    }

    public void setSoDeTai(int soDeTai) {
        this.soDeTai = soDeTai;
    }

    public GiangVien() {
    }

    @Override
    public double tinhThuong() {
return soBaiBao*1000000+soDeTai*2000000;
    }
    
}
