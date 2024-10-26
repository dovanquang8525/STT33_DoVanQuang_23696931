package ProjectPhongHoc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhongHoc {
	private List<PhongHoc> ds;
	
	public QuanLyPhongHoc() {
		ds = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhongHoc(PhongHoc phong) {
		for (PhongHoc phongHoc : ds) {
			if (phongHoc.getMaPhong().equals(phong.getMaPhong()))
				return false;
		}
		ds.add(phong);
		return true;
	}
	
	public PhongHoc timPhongHoc(PhongHoc phong) {
		for (PhongHoc phongHoc : ds) {
			if (phongHoc.getMaPhong().equals(phong))
				return phong;
		}
		return null;
	}
	
	public void inDanhSach() {
		for (PhongHoc phongHoc : ds) {
			System.out.println(phongHoc);
		}
	}
	
	public void inDanhSachPhongDatChuan() {
		for (PhongHoc phongHoc : ds) {
			if (phongHoc.kiemTraDatChuan())
				System.out.println(phongHoc);
		}
	}
	
}
