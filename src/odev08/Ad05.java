package odev08;

import java.util.Scanner;

public class Ad05 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn
		//ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek  ekrana yazdýrýn.
		//Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz.

	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir string giriniz");
	String str=scan.next();
	
	int length=str.length();
	
	
	
	System.out.println(str.charAt(length-1)+str.substring(1,length-1)+str.charAt(0));
	
	scan.close();
	}
}
