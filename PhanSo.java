package lab2;

public class PhanSo {
	private double tu;
	private double mau;
	PhanSo(){
		this.tu = 0;
		this.mau = 1;
	}
	PhanSo(double tu, double mau){
		this.tu = tu;
		this.mau = mau != 0? mau : 1;
	}
	public static double getGCD(double a, double b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(b != 0) {
			double tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	// set mau;
	public void setMau(double newMau) {
		this.mau = newMau != 0? newMau : this.mau;
	}
	public void setTu(double tu) {
		this.tu = tu;
	}
	// get
	public double getTu() {
		return this.tu;
	}
	public double getMau() {
		return this.mau;
	}
	public String rutgonPS() {
		this.tu /= getGCD(this.tu, this.mau);
		this.mau /= getGCD(this.tu, this.mau);
		return this.tu+"/"+this.mau;
	}
	public String cong(PhanSo other) {
		double newTu = this.tu * other.mau + this.mau * other.tu;
		double newMau = this.mau + other.mau;
		return rutgonPS();
	}
}
