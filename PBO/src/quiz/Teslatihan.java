//Nama : Muhamad Farhan Rajab
//NPM : 191106041495
//Kelas : Reguler A

package quiz;

public class Teslatihan {
	public static void main(String args[]) {
//		Tampilan Awal
		System.out.println("---Quiz PBO---\n");
		
		System.out.println("Masukkan identitas dosen 1 : Muhamad Farhan Rajab,NIP. 1911");
		Dosen dosen1=new Dosen("Muhamad Farhan Rajab",1911);
		
		System.out.println("Masukkan identitas dosen 2 : Ningrum,NIP. 2411,Umur 20");
		Dosen dosen2=new Dosen("Ningrum", 2411, 20);
		
		System.out.println("Masukkan identitas dosen 3 : Hanra,NIP. 1510,Umur 21,Mata kuliah PBO");
		Dosen dosen3=new Dosen("Hanra", 1510, 21, "PBO");
		
//		Tampilan info dosen
		System.out.println();
		dosen1.info();
		System.out.println();
		dosen2.info();
		System.out.println();
		dosen3.info();
	}
}
