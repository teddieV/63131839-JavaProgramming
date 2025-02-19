/**
 * 
 */
package ntu.tvva;
//Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi,diện tích và cạnh nhỏ của hình chữ nhật.
import java.util.Scanner;
/**
 * 
 */
public class ChuviDT {
	public static void main(String[] args) {
		// Nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        //Nhập chiều dài
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        //Nhập chiều rộng
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả
        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNhoNhat);


	}

}
