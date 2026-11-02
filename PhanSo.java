package lab2;

public class PhanSo {
	private int tu;
	private int mau;
	PhanSo(){
		this.tu = 0;
		this.mau = 1;
	}
	PhanSo(int tu, int mau){
		this.tu = tu;
		this.mau = mau != 0? mau : 1;
	}
	public static int getGCD(int a, int b) {
		a = Math.abs(a);
		b = Math.abs(b);
		while(b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	// set mau;
	public void setMau(int newMau) {
		this.mau = newMau != 0? newMau : this.mau;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	// get
	public int getTu() {
		return this.tu;
	}
	public int getMau() {
		return this.mau;
	}
	public void rutgonPS() {
		int gcd = getGCD(this.tu, this.mau);
		this.tu /= gcd;
		this.mau /= gcd;
	}
	public PhanSo cong(PhanSo other) {
		int newTu = this.tu * other.mau + this.mau * other.tu;
		int newMau = this.mau * other.mau;
		PhanSo kq = new PhanSo(newTu, newMau);
		kq.rutgonPS();
		return kq;
	}
	public PhanSo tru(PhanSo other) {
		int newTu = this.tu * other.mau - this.mau * other.tu;
		int newMau = this.mau * other.mau;
		PhanSo kq = new PhanSo(newTu, newMau);
		kq.rutgonPS();
		return kq;
	}
	public PhanSo nhan(PhanSo other) {
		int newTu = this.tu * other.tu;
		int newMau = this.mau * other.mau;
		PhanSo kq = new PhanSo(newTu, newMau);
		kq.rutgonPS();
		return kq;
	}
	public PhanSo chia(PhanSo other) {
		int newTu = this.tu * other.mau;
		int newMau = this.mau * other.tu;
		PhanSo kq = new PhanSo(newTu, newMau);
		kq.rutgonPS();
		return kq;
	}
	public int soSanh(PhanSo other) {
		if(this.tu/this.mau > other.tu/other.mau)
			return 1;
		else if(this.tu/this.mau < other.tu/other.mau)
			return -1;
		return 0;
	}
	public String toString() {
		return this.tu+"/"+this.mau;
	}
}
