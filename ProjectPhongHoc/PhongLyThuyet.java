package ProjectPhongHoc;

public class PhongLyThuyet extends PhongHoc {
	private boolean coMayChieu;

	public boolean isCoMayChieu() {
		return coMayChieu;
	}

	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}

	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}
	
	public boolean kiemTraDatChuan() {
		return (isCoMayChieu() && duAnhSang()) ? true : false;
	}
	
	@Override
	public String toString() {
		String mayChieu = isCoMayChieu() ? "Co may chieu" : "Khong co may chieu";
		String datChuan = kiemTraDatChuan() ? "Dat" : "Khong Dat";
		String s = "";
		s += s.format("|%10s|%10s|", mayChieu, datChuan);
		return super.toString() + s;
	}
}
