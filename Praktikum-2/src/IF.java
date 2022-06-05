import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IF {
	public static void main (String[]args) {
		System.out.println("masukan bilangan anda : ");
		java.io.BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String angkaInput = null;
		try {
			angkaInput = bfr.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		int Data = Integer.valueOf(angkaInput).intValue();
		if (Data > 5)System.out.print("Angka yang anda masukan lebih besar dari 5");
	}
}