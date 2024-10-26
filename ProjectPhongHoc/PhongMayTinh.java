package ProjectPhongHoc;

public class PhongMayTinh extends PhongHoc{
	private int soMayTinh;

	public int getSoMayTinh() {
		return soMayTinh;
	}

	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	
	public boolean kiemTraDatChuan() {
		return ((getDienTich() / getSoMayTinh()) <= 1.5 && duAnhSang()) ? true : false;
	}
	
	@Override
	public String toString() {
		String mayTinh = "May tinh: " + getSoMayTinh();
		String datchuan = kiemTraDatChuan() ? "Dat" : "Khong Dat";
		String s = "";
		s += s.format("|%10s|%10s|", mayTinh, datchuan);
		return super.toString() + s;
	}
}
