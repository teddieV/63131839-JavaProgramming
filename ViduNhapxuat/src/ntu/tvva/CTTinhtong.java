/**dự án nhập xuất CT TINH TONG
 * 
 */
package ntu.tvva;
import java.util.Scanner;

/**
 * 
 */
public class CTTinhtong {

	public static void main(String[] args) {
		// In Ra Tiêu đề App
		System.out.print("CT TINH TONG \n");
		//Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		//In dong huong nhan Moi Nhap A Va B
		System.out.println(" Mời Nhập A");
		double a= banPhim.nextDouble();
		System.out.println(" Mời Nhập B");
		double b= banPhim.nextDouble();		
		//Tinh
		double tong = a+b;
		
		System.out.print("Tổng Là: ");
		System.out.print(tong);
	}

}
