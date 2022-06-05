package pengelompokan;
//Import Scanner
import java.util.Scanner;
public class Tugas_4 {
	public static void main(String[]args) {
//		Deklarasi Scanner
		Scanner data = new Scanner(System.in);
//		Deklarasi Variable
		String[]nama = new String[20];
		String[]matkul = new String [20];
		String[]keterangan = new String[20];
		int[]npm = new int[20];
		float[]nilai = new float[20];
//		tampilan awal
		System.out.print("-----------------------------"
				+ "\n" + "---   Tugas pertemuan 4   ---"
				+ "\n" + "-----------------------------"
				+ "\n" + "\n" + "Masukan Jumlah Mahasiswa : "
				+ "\n" + ">> ");
		int jumlahmhs = data.nextInt();
//		looping input data
		for(int i=0;i<=(jumlahmhs-1);i++) {
			System.out.println("-----------------------------"
					+"\n" + "Mahasiswa ke- "+(i+1)
					+"\n" + "-----------------------------");
			System.out.print("Masukan Nama : ");
			nama[i] = data.next();
			
			System.out.print("Masukan NPM : ");
			npm[i] = data.nextInt();
			
			System.out.print("Masukan Mata Kuliah : ");
			matkul[i] = data.next();
			
			System.out.print("Masukan Nilai : ");
			nilai[i] = data.nextFloat();
			
//			pengkondisian nilai
			if(nilai[i]>=80) {
				keterangan[i] = "Lulus";
			}
			else if(nilai[i]>=60 && nilai[i]<=79) {
				keterangan[i] = "Remedial";
			}
			else if(nilai[i]<59){
				keterangan[i] = "Tidak Lulus";
			}			
		}
//		tampilan hasil
		System.out.println("-----------------------------"
				+ "\n" + "\n" +" No.   |   Nama   |   NPM   |    Matkul   |   Nilai   |   Keterangan   |"
				+ "\n" + "-----------------------------------------------------------------------");
		for(int a=0;a<=(jumlahmhs-1);a++) {
			System.out.println("   "+(a+1)+"   |   "+nama[a]+"   |   "+npm[a]+"   |    "+matkul[a]+"   |   "+nilai[a]+"   |   "+keterangan[a]+"   |");
		}
	}
}