package odev08;

import java.util.Scanner;

public class Ad04 {

	public static void main(String[] args) {
		// Kullanýcýdan uzunluðu çift sayý olan bir String alýn
		//ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		//Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen caraker uzunluðu çift sayý olan bir string giriniz");
	
	String str=scan.next();
	int lenght=str.length();
	System.out.println("2.yarý"+": "+str.substring(str.length()/2));
	System.out.println("1.yarý"+": "+str.substring(0,str.length()/2));
	
	
	
	scan.close();
	
	
	
	
	
	}

}
