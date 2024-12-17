package KetThucHocPhan;

public interface IGiangVien {
	public void addGiangVien(GiangVien gv);
	public void editGiangVien(GiangVien gv);
	public void searchGiangVien(String maCBNV);
	public float getTotalSalary(String hocHamHocVi);
}
