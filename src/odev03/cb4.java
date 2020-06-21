package odev03;

import java.util.Scanner;

public class cb4 {

	public static void main(String[] args) {
		// Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		//En ve boy eþit ise ekrana “Kare” farklý ise ekrana “Dikdörtgen” yazdýrýn.
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen dikdörtgenin enini giriniz");
	int en=scan.nextInt();
	System.out.println("lütfen dikdörtgenin boyunu giriniz");
	int boy=scan.nextInt();
	
	String result=en==boy?"kare":"dikdörtgen";
	System.out.println(result);
	
	
	
	
	scan.close();
	
	}

	

}
