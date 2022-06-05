package overriding;

public class main {
	public static void main (String[]args) {
		bangun_datar BD = new bangun_datar();
		persegi P = new persegi(8);
		lingkaran L = new lingkaran(7);
		segitiga S = new segitiga(4,7);
		
		System.out.println("Luas Persegi "+P.luas());
		System.out.println("keliling Persegi "+P.keliling());
		
		System.out.println("Luas Lingkaran "+L.luas());
		System.out.println("Keliling Lingkaran "+L.keliling());
		
		System.out.println("Luas Segitiga "+S.luas());
	}
}
