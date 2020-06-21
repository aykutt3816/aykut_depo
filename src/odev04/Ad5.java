package odev04;

import java.util.Scanner;

public class Ad5 {

	public static void main(String[] args) {
		// Kullanýcýdan bir gun alýn
		//eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn.
		//“Pazar” ise ekrana  “Hýristiyanlar için kutsal gün” yazdýrýn.
		//Diler günler icin “Kutsal gün deðil” yazdýrýn.
	Scanner scan =new Scanner(System.in);
	System.out.println("lütfen bir gün giriniz");
	String day= scan.next();
	
	switch (day) {
	case "cuma":
	System.out.println("müslümanlar için kutsal gün");
	break;
	case "cumartesi":
		System.out.println("yahudiler için kutsal gün");
		break;
	case "pazar":
		System.out.println("hristiyanlar için kutsal gün");
		break;
		default:
	System.out.println("kutsal gün deðildir");
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
