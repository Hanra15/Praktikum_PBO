package praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan nama kucingmu : ");
		nama = input.next();
		
		System.out.print("Masukkan warna : ");
		warna = input.next();
		
		System.out.print("Masukkan berat : ");
		berat = input.nextInt();
		
		Cat kucingsaya = new Cat();
		kucingsaya.identitas(nama, warna, berat);
		System.out.println(kucingsaya.ambilNama()+" si kucing, "
				+ "warnanya "+kucingsaya.ambilWarna() 
				+ ", beratnya "+kucingsaya.ambilBerat() + "kg.");
		kucingsaya.eat();
	}
}
