package ntu.tvva;

public class KhaibaoDSSanPham {

	public static void main(String[] args) {
		//Khai bao DS San Pham
		ArrayList<SanPham> dsSanPham;
		//Xin Mới
		dsSanPham = new ArrayList<SanPham>();
		//Nhập 3 sản phẩm
		SanPham sp1 = new SanPham (1,"Kem","Nước Ngọt","Cà Phê");
		SanPham sp2 = new SanPham (2, "Cơm","Phở","Bún");
		SanPham sp3 = new SanPham (3, "Mì tôm", "Bánh","Kẹo");
		//Thêm vào arraylist
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		for (SanPham x: dsSanPham)
			System.out.println(x.toString());
	}

}
