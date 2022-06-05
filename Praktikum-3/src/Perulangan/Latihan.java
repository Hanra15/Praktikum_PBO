package Perulangan;
import java.util.Scanner;
public class Latihan {
	static int jumlahms,nama,npm,matkul,nilai;
	public static void main(String[]args) {
		String nama,matkul,keterangan = null;
		float nilai = 0;
		int  npm;
		System.out.println("---------------------------------"
				+"\n"+ "Latihan ke-3"
				+"\n"+ "---------------------------------"
				+"\n"+"\n"+ "Masukan Jumlah Mahasiswa : "
				+"\n"+ ">> ");
		jumlahms = inputdata();
		for(int i=1;i<=jumlahms;i++) {
			System.out.print("Masukan Nama : ");
			nama = inputdata()
			System.out.println("Masukan NPM : ");
			npm = input.nextInt();
			System.out.println("Masukan Mata kuliah : ");
			matkul = input.next();
			System.out.println("Masukan Nilai : ");
			nilai = input.nextFloat();
			
			if(nilai>=80) {
				keterangan = "Lulus";
			}
			else if(nilai>=60 && nilai<=79) {
				keterangan = "Remedial";
			}
			else if(nilai<=59) {
				keterangan = "Tidak Lulus";
			}
			System.out.println("\n\nNama :" +nama +"\n"
					+ "NPM : " +npm +"\n"
					+ "Mata Kuliah : " +matkul +"\n"
					+ "Nilai : " +nilai +"\n"
					+ "Keterangan : " +keterangan +"\n"
					+ "----------------------");
		}
		
	}
	private static int inputdata() {
		Scanner inputnew = new Scanner(System.in);
		int data = inputnew.nextInt();
		return data;
	}
}
public class Tugas3 {

	public static void main(String[] args) {
		Scanner Data = new Scanner(System.in);
		
//		variabel
		String [] nama = new String[20]; 
		String [] matkul = new String[20];
		String [] keterangan = new String[20];
		int [] npm = new int[20];
		double[] nilai = new double[20];
		
		System.out.print("masukkan jumlah mahasiswa : ");
		int ulang = Data.nextInt();
		
//		Perulangan
	for(int i=0; i<=(ulang-1); i++) {
			
		System.out.println(""
				"\n"+ "mahasiswa ke- "+(i+1));
		System.out.print("nama : ");
		nama[i] = Data.next();
		
		
		System.out.print("npm : ");
		npm[i] = Data.nextInt();
		
		
		System.out.print("matkul : ");
		matkul[i] = Data.next();
		
		
		System.out.print("Masukkan nilai : ");
		nilai[i] = Data.nextDouble();
		
		
	


////		
//		System.out.println("nama = " +nama[i]);
//		System.out.println("npm = " +npm[i]);
//		System.out.println("matkul = " +matkul[i]);
//		System.out.println("nilai = " +nilai[i]);
//		System.out.print("keterangan :");
		
		
//		pengkondisian
		if (nilai[i] >= 80) {
			keterangan[i] = "Lulus";
		}
		else if((nilai[i] >= 60) && (nilai[i] <79)) {
			keterangan[i] = "Remedial";
		}
		else if (nilai[i]< 59) {
			keterangan[i] = "Tidak Lulus";
		}
		System.out.println("-------------------------");
		
}
	System.out.println(" No  |  Nama  |  NPM  |  Matkul  | Nilai |   Keterangan  | ");
	for (int a=0; a<=(ulang-1); a++) {
		System.out.println(a+"   |   "+nama[a]+"   |   "+npm[a]+"   |   "+matkul[a]+"   |   "+nilai[a]+"   |   "+keterangan[a] + "   |   ");
	}
}
}
