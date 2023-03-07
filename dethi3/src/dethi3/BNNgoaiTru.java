package dethi3;

import java.util.Date;

public class BNNgoaiTru extends BenhNhan {
    private double phiKham,phiXetNghiem;

    public BNNgoaiTru() {
    }

    public BNNgoaiTru(double phiKham, double phiXetNghiem, String ma, String hoTen, Date ngayVao, double tienThuoc) {
        super(ma, hoTen, ngayVao, tienThuoc);
        this.phiKham = phiKham;
        this.phiXetNghiem = phiXetNghiem;
    }

    public double getPhiKham() {
        return phiKham;
    }

    public void setPhiKham(double phiKham) {
        this.phiKham = phiKham;
    }

    public double getPhiXetNghiem() {
        return phiXetNghiem;
    }

    public void setPhiXetNghiem(double phiXetNghiem) {
        this.phiXetNghiem = phiXetNghiem;
    }
    public double phiThuoc() {
        return tienThuoc;
    }
    @Override
    public double vienPhi() {
        return phiKham+phiXetNghiem+phiThuoc();
    }
    
}
