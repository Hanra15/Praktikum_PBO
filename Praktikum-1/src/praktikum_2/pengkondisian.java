package praktikum_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pengkondisian {
	public static void main (String[]args) {
		System.out.println("masukan bilangan anda : ");
		try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
