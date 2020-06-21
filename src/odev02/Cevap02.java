package odev02;

import java.util.Scanner;

public class Cevap02 {

	public static void main(String[] args) {
		// Kullanýcýdan bir gun alýn
		//eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn.
		//“Pazar” ise ekrana  “Hýristiyanlar icin kutsal gün” yazdýrýn
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir gun giriniz");
	String gun=scan.next();
	if(gun.equals("cuma")) {
		System.out.println("müslümanlar için kutsal gün");
	}if(gun.equals("cumartesi")) {
		System.out.println("yahudiler için kutsal gün");
	}if(gun.equals("pazar")) {
		System.out.println("hristiyanlar için kutsal gün");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
