package perulangan;

public class For_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method for =  for(inisialisasi ; kondisi ; pengubah)
		System.out.println("Looping For");
		for(int angka=4; angka<=10; angka++) {
			
			System.out.println("Angka ke-"+angka);
		}
		
		System.out.println("\n\n==========\n\n");
		System.out.println("Looping While");
		// method while
		// inisilisasi
		// while(kondisi){pengubah}
		int angka=1;
		while(angka<=10) {
			
			System.out.println("Angka ke-"+angka);
			angka++;
		}
		
		System.out.println("\n\n==========\n\n");
		System.out.println("Looping Do while");
		// method do while
		// inisialisasi
		// do{pengubah
		// }while(kondisi)
		int angka1=0;
		do {
			System.out.println("Angka ke-"+angka1);
			angka1++;
		}while(angka1<=3);
	}

}
