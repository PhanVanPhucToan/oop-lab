package lab2;

public class DoanThang {
	private Diem d1;
	private Diem d2;
	// getter
	DoanThang(Diem d1, Diem d2){
		this.d1 = d1;
		this.d2 = d2;
	}
	public String getD1() {
		return d1.toString();
	}
	public String getD2() {
		return d2.toString();
	}
	public String getD(Diem D) {
		return D.toString();
	}
	public String toString() {
		return "["+d1.toString()+","+d2.toString()+"]";
	}
	public double getDoDai() {
		return d1.Distance(d2);
	}
	public String getTrungDiem() {
		return "("+(d1.getX() + d2.getX())/ 2+","+(d1.getY()+d2.getY())/2;
	}
	public Boolean isParallel(DoanThang other) {
		double a = (this.d2.getX() - this.d1.getX()) * (other.d2.getY() - other.d1.getY());
		double b = (this.d2.getY() - this.d1.getY()) * (other.d2.getX() - other.d1.getX());
		if(a == b)
			return true;
		return false;
	}
}
