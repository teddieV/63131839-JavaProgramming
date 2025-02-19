package ntu.tvva;
import java.util.Scanner;
//Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.
public class CTTinhdelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập dữ liệu từ bàn phím
		Scanner scanner =new Scanner(System.in);
		//Nhập a,b,c,
		System.out.print("Nhập hệ số A:");
		double a = scanner.nextDouble();
		System.out.print("Nhập hệ số B:");
		double b = scanner.nextDouble();
		System.out.print("Nhập hệ số C:");
		double c = scanner.nextDouble();
		//Tính delta
		double delta = Math.pow(b, 2) - 4 * a * c;
		//Tính căn delta
		if (delta >= 0) {
			double candelta = Math.sqrt(delta);
			System.out.printf("delta = %.2f%n",delta);
			System.out.printf("Căn delta = %.2f%n", candelta);
		}else {
			System.out.printf("delta= %.2f%n", delta);
			System.out.println("Không thể tính căn delta vì delta âm");
		}

	}

}
