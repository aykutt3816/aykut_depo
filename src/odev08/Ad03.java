package odev08;

import java.util.Scanner;

public class Ad03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn
		//ve bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün  indexini ekrana yazdýrýn.
		//“a” harfi yoksa ekrana “a harfi yok” yazdýrýn
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir string giriniz");
		String str=scan.next();
	if(str.indexOf('a')==-1) {
		System.out.println("a harfi yok");
	}else {
		System.out.println(str.indexOf('a'));
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
