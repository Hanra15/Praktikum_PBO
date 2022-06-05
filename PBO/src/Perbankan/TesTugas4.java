//Nama : Muhamad Farhan Rajab
//NPM : 191106041495
//Kelas : Reguler A

package Perbankan;

public class TesTugas4 {
	public static void main(String[]args) {
		int tmp;
		Bank bank = new Bank();
		
		bank.tambahNasabah("Agus","Daryanto");
		bank.getnasabah(0).setTabungan(new Tabungan(5000));
		
        bank.tambahNasabah("Tuti", "Irawan");
        bank.getnasabah(1).setTabungan(new Tabungan(7000));
        
        bank.tambahNasabah("Ani", "Ratna");
        bank.getnasabah(2).setTabungan(new Tabungan(4000));
        
        bank.tambahNasabah("Bambang", "Darmawan");
        bank.getnasabah(3).setTabungan(new Tabungan(6500) );
        
        System.out.println("Jumlah Nasabah = "+ bank.getjumlahNasabah()
        			+ "\n" + "----------------------------------------------");
        
        for(int i =0; i<bank.getjumlahNasabah(); i++){
            System.out.println("Nasabah ke-" + (i+1) + " : " +
                    bank.getnasabah(i).getnamaDepan() + " " +
                    bank.getnasabah(i).getnamaBelakang() + " ; Saldo = " +
                    bank.getnasabah(i).getTabungan().getSaldo());
        }
	}
}
