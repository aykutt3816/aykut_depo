package odev08;

import java.util.Scanner;

public class Ad03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n
		//ve bu String�in icinde �a� harfi varsa �a� harfinin ilk g�r�n�m�n�n  indexini ekrana yazd�r�n.
		//�a� harfi yoksa ekrana �a harfi yok� yazd�r�n
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir string giriniz");
		String str=scan.next();
	if(str.indexOf('a')==-1) {
		System.out.println("a harfi yok");
	}else {
		System.out.println(str.indexOf('a'));
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
