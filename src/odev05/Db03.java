package odev05;

import java.util.Scanner;

public class Db03 {

	public static void main(String[] args) {
		// Kullanýcýdan ilk ve soy ismini alýn 
		//ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ilkadýnýzý  giriniz");
		String ad =scan.next();
		ad=ad.toUpperCase();
		System.out.println("lütfen soyadýnýzý  giriniz");
		String soyad =scan.next();
		soyad=soyad.toUpperCase();
		System.out.print(ad.charAt(0));
	System.out.println(soyad.charAt(0));
	
	

	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
