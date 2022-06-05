//Tugas 1
//Muhamad Farhan Rajab
//191106041495


package Tugas_PBO;

public class Tabungan {
//	-saldo : int
	int saldo;
//	+tabungan(initsaldo : int)
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
//  +getsaldo() : int
    public int getSaldo(){
        return saldo;
    }
//  simpanUang(jumlah : int)
    public void simpanUang(int jumlah){
    	saldo = saldo+jumlah;
    }
//  ambilUang(jumlah : int) : boolean
    public boolean ambilUang(int jumlah){
        if (saldo>jumlah){
            saldo =saldo -jumlah;
            return true;
        }
        else{
            return false;
        }
    }
}
