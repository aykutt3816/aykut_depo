package odev08;

import java.util.Scanner;

public class Ad02 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen ba�lang�� de�erinigiriniz");
	int strt=scan.nextInt();
	System.out.println("l�tfen biti� de�erini giriniz");
	int end=scan.nextInt();
	
	for(int i=strt;i<=end;i++) {
		if(i%3==0&&i%5==0) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	}

}
