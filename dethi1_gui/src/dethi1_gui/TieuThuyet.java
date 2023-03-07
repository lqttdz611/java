package dethi1_gui;

/**
 *
 * @author FORMAI
 */
public class TieuThuyet extends DanhMuc {
    private String theLoai;

    public TieuThuyet() {
    }

    public TieuThuyet(String theLoai, String ten, String nxb, String namXB, String soTrang, double giaBan, double sL) {
        super(ten, nxb, namXB, soTrang, giaBan, sL);
        this.theLoai = theLoai;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
    @Override
    public double tinhThanhTien() {
        return sL*giaBan*(60/100);
    }
    
}
