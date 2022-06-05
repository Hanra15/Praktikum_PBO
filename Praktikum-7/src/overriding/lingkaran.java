package overriding;

public class lingkaran {
	float r;
	public lingkaran(float r) {
		this.r=r;
	}
	public float luas() {
		return (float)(3.14*this.r*this.r);
	}
	public float keliling() {
		return (float)(2*3.14*this.r);
	}
}
