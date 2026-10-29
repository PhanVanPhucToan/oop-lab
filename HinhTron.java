package lab2;

public class HinhTron {
	private static double SOPI = 3.14;
	private Diem tamO;
	private double bkR;
	HinhTron(){
		this.tamO = new Diem(0, 0);
		bkR = 1;
	}
	HinhTron(Diem tamO, double bkR){
		this.tamO = tamO;
		this.bkR = bkR>0? this.bkR = bkR : 1;
	}
	public double getS() {
		return SOPI * Math.pow(bkR, 2); 
	}
	public double getP() {
		return 2 * SOPI * bkR;
	}
	public String checkPosition(Diem a) {
		if(this.bkR > a.Distance(this.tamO)) {
			return "Nam Trong";
		}
		else if(this.bkR == a.Distance(this.tamO)) {
			return "Nam Tren";
		}
		else
			return "Nam Ngoai";
	}
}
