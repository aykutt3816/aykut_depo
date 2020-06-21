package odev05;

import java.util.Scanner;

public class Db04 {

	public static void main(String[] args) {
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn
		//bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdýrýn.

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ülkenizin adýný  giriniz");
		String ad =scan.next();
		ad=ad.toUpperCase();
	System.out.print(ad.charAt(0));
	System.out.println(ad.charAt(1));
	
	
	
	scan.close();
	
	
	
	
	}

}
