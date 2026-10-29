
package lab2;

public class Main {
	public static void main(String[] args) {
		Diem d1 = new Diem(0, 3);
		Diem d2 = new Diem(2, 0);
		HinhChuNhat h1 = new HinhChuNhat(d1, d2);
		System.out.println(h1);
	}
}
