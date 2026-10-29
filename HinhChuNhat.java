package lab2;

public class HinhChuNhat {
	private Diem d1;
	private Diem d2;
	HinhChuNhat(Diem d1, Diem d2){
		this.d1 = d1;
		this.d2 = d2;
	}
	public double getP() {
		Diem newD1 = new Diem(this.d1.getX(), this.d2.getY());
		double rong = d1.Distance(newD1);
		double dai = d2.Distance(newD1);
		return (dai + rong) * 2.0;
	}
	public double getS() {
		Diem newD1 = new Diem(this.d1.getX(), this.d2.getY());
		double rong = d1.Distance(newD1);
		double dai = d2.Distance(newD1);
		return dai*rong;
	}
	public String toString() {
		return "toa do 2 diem "+d1.toString()+","+d2.toString()+"- chu vi:"+getP()+"-dien tich:"+getS();
	}
}
