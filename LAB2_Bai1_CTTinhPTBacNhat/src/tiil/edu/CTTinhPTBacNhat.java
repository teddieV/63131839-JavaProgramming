/**
 * 
 */
package tiil.edu;
import java.util.Scanner;
/**
 * 
 */
public class CTTinhPTBacNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nhập hệ số A và B
		Scanner scanner = new Scanner(System.in);
        
        // Nhập hệ số a và b
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        
        // Giải phương trình bậc nhất
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
        
        scanner.close();
    }
}
