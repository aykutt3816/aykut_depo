package odev05;

import java.util.Scanner;

public class Db06 {

	public static void main(String[] args) {
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn
		//bu ülkenin bastan ikinci harfi ile sondan ikinci harfini  büyük harf olarak ekrana yazdýrýn

	    Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ülkenizin adýný  giriniz");
		String ulke =scan.next();
		ulke=ulke.toUpperCase();
		System.out.println(ulke.toUpperCase());
		int lenght=ulke.length();
		System.out.print(ulke.charAt(1));
		System.out.print(ulke.charAt(lenght-2));
	
		
	
	scan.close();
	
	
	
	
	}

}
