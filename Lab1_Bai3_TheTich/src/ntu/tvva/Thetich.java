package ntu.tvva;
import java.util.Scanner;
//chương trình Java nhập cạnh của khối lập phương, tính và xuất thể tích

public class Thetich {

	public static void main(String[] args) {
		// nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		//Nhập cạnh của Khối lập phương
		System.out.print("Nhập cạnh của Khối Lập Phương:");
		double canh = scanner.nextDouble();
		//Tính thể tích
		//double thetich = canh * canh * canh;
		double thetich = Math.pow(canh, 3);
		//xuất kết quả
		System.out.printf("Thể tích bằng %.2f%n", thetich);

	}

}
