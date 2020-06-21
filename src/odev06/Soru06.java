package odev06;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  harflerini alýn
		//ve baþlangýç harfinden baþlayýp bitiþ harfinde  biten tüm harfleri büyük harf olarak ekrana yazdýrýn
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen baþlangç ve bitiþ harflerini giriniz");
		
		char strt=scan.next().toUpperCase().charAt(0);
		char end=scan.next().toUpperCase().charAt(0);

	
		
	
		
		
		
		
		
		
		
		for(char i=strt;i<end+1;i++) {
		System.out.println(i);
		
	}
	
scan.close();
	
	}

}
