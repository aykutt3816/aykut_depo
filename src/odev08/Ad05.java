package odev08;

import java.util.Scanner;

public class Ad05 {

	public static void main(String[] args) {
		// Kullan�c�dan bir String al�n
		//ve bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek  ekrana yazd�r�n.
		//Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z.

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir string giriniz");
	String str=scan.next();
	
	int length=str.length();
	
	
	
	System.out.println(str.charAt(length-1)+str.substring(1,length-1)+str.charAt(0));
	
	scan.close();
	}
}
