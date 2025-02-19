/**
 * 
 */
package ntu.tvva;
import java.util.Scanner;


/**
 * 
 */
public class CTTinhDTB {

	//CT Tính Điểm Trung Bình
	 
	public static void main(String[] args) {
		// Nhập từ bàn phím
		Scanner scanner = new Scanner(System.in);
		//Nhập Họ tên
		System.out.print(" Nhập Họ và Tên:");
		String hoTen = scanner.nextLine();
		//Nhập điểm Tb
	
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		//Xuất ra màn hình 
		System.out.printf("%s: %.1f điểm", hoTen, diemTB);
	}

}
