package overriding;

public class persegi extends bangun_datar{
	int sisi;
	public persegi(int sisi) {
		this.sisi=sisi;
	}
	public float luas() {
		int luas;
		luas =  this.sisi*this.sisi;
		return luas;
	}
	public float keliling() {
		return this.sisi*4;
	}
}
