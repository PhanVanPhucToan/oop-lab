package lab2;

public class Diem {
	private double xValue;
	private double yValue;
	//constructor
	Diem(double xValue, double yValue){
		this.xValue = xValue;
		this.yValue = yValue;
	}
	// getter hoanh do, tung do
	public double getX(){
		return xValue;
	}
	public double getY() {
		return yValue;
	}
	// set hoanh do tung do
	public void setX(double xValue) {
		this.xValue = xValue;
	}
	public void setY(double yValue) {
		this.yValue = yValue;
	}
	public String toString() {
		return "("+xValue+","+yValue+")";
	}
	public double Distance(Diem Other) {
		return Math.sqrt(Math.pow(this.xValue - Other.xValue, 2) + Math.pow(this.yValue-Other.yValue, 2));
	}

}
