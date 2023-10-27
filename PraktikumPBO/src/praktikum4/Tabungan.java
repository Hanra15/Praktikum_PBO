package praktikum4;

public class Tabungan {
	public int saldo;
	public Tabungan(int initsaldo) {
		saldo = initsaldo;
	}
	public void ambilUang(int jumlah) {
		saldo = saldo - jumlah;
	}
}
