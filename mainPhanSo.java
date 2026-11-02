package lab2;

import java.util.Scanner;

public class mainPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong phan so:");
		int n = sc.nextInt();
		PhanSo[] L = new PhanSo[n];
		for(int i = 0; i < n; i++) {
			System.out.println("nhap phan so thu " + (i+1));
			int a = sc.nextInt();
			int b = sc.nextInt();
			L[i] = new PhanSo(a, b);
		}
		for(PhanSo i : L) {
			System.out.println(i);
		}
		PhanSo total = new PhanSo();
		for(int i = 0; i < n; i++) {
			total = total.cong(L[i]);
		}
		System.out.println(total);
		int minV = Integer.MIN_VALUE;
		PhanSo check = new PhanSo(minV, 1);
		for(int i = 0; i < n; i++) {
			if(L[i].soSanh(check) == 1)
				check = L[i];
		}
		System.out.println(check);
		sc.close();
	}
}
