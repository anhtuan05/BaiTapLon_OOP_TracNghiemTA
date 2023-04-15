
import java.util.List;

public abstract class CauHoi {

	private static int dem=0;

	private int maCauHoi=++dem;

	private String noiDung;

	private CapDo capDo;

	private List<DanhMuc> danhMuc;

	private List<PhuongAn> phuongAn;

	private PhuongAn pADung;

	public CauHoi() {

	}

	public void hienThi() {

	}

    /**
     * @return the maCauHoi
     */
    public int getMaCauHoi() {
        return maCauHoi;
    }

    /**
     * @param maCauHoi the maCauHoi to set
     */
    public void setMaCauHoi(int maCauHoi) {
        this.maCauHoi = maCauHoi;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the capDo
     */
    public CapDo getCapDo() {
        return capDo;
    }

    /**
     * @param capDo the capDo to set
     */
    public void setCapDo(CapDo capDo) {
        this.capDo = capDo;
    }

    /**
     * @return the danhMuc
     */
    public List<DanhMuc> getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(List<DanhMuc> danhMuc) {
        this.danhMuc = danhMuc;
    }

    /**
     * @return the phuongAn
     */
    public List<PhuongAn> getPhuongAn() {
        return phuongAn;
    }

    /**
     * @param phuongAn the phuongAn to set
     */
    public void setPhuongAn(List<PhuongAn> phuongAn) {
        this.phuongAn = phuongAn;
    }

    /**
     * @return the pADung
     */
    public PhuongAn getpADung() {
        return pADung;
    }

    /**
     * @param pADung the pADung to set
     */
    public void setpADung(PhuongAn pADung) {
        this.pADung = pADung;
    }

}
