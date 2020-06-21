package odev05;

import java.util.Scanner;

public class Db02 {

	public static void main(String[] args) {
		// Kullanýcýdan ilk ve soy ismini alýn
		//ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ilkadýnýzý  giriniz");
		String ad =scan.next();
		System.out.println("lütfen soyadýnýzý  giriniz");
		String soyad =scan.next();
	int lenght1=ad.length();
	int lenght2=soyad.length();
	System.out.println(lenght1+lenght2);
	
	
	
	scan.close();
	
	
	}

}
