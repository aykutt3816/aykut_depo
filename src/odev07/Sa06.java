package odev07;

import java.util.Scanner;

public class Sa06 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  harflerini alýnn
		//ve baþlangýç harfinden baþlayýp bitiþ harfinde  biten tüm harfleri büyük harf olarak ekrana yazdýrýn.
	//	Kullanýcýnýn hata yapmadýðýný farz edin.

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen baþlangýç ve bitiþ harflerini giriniz");
		
	       char a=scan.next().toUpperCase().charAt(0);
			char z=scan.next().toUpperCase().charAt(0);
	for(char i=a;i<z;i++) {
		System.out.println(i);
	}
	
	
			
	

	
	
	
	
	
	
	
	
	
	}

}
