
package if1.pkg10118026.latihan17.tunjangan;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: Menghitung gaji total bedasarkan tunjangan
 */
public class IF110118026Latihan17Tunjangan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("============== Program Tunjangan ==================");
		System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
		Scanner scanner = new Scanner(System.in);
		double gaji = scanner.nextInt();
		double tunjangan = 0;
		System.out.print("Status anda? (y/n)\t\t: ");
		String status = scanner.next();
		if (status.equals("y")) {
			tunjangan = 0.35 * gaji;	
			System.out.println(status);
		}
		double totalGaji = gaji + tunjangan;
		System.out.println("========Hasil Perhitungan Gaji Anda=============");
		System.out.println("Gaji Pokok\t\t: Rp. "+ gaji);
		System.out.println("Tunjangan\t\t: Rp. "+ tunjangan);
		System.out.println("Total Gaji\t\t: Rp. "+ totalGaji);
                System.out.println("(Devoloped by : Riski Dwi Sabariyanto)");
	}
	
}
