package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		Cat kucingSaya = new Cat();
		
		System.out.print("Masukkan nama kucing : ");
		nama = input.next();
		
		System.out.print("Masukkan warna kucing : ");
		warna = input.next();
		
		System.out.print("Masukkan berat kucing : ");
		berat = input.nextInt();
		
		kucingSaya.identitas(nama, warna, berat);
		kucingSaya.eat();
		
		System.out.println("Kucing "+kucingSaya.ambilNama()
		+" warnanya "+kucingSaya.ambilWarna()
		+" beratnya "+kucingSaya.ambilBerat()+" Kg"
		+" ada di teras");
	}
}
