package odev05;

import java.util.Scanner;

public class Db05 {

	public static void main(String[] args) {
		//Kullanýcýdan yaþadýðý ülkenin ismini alýn
		//bu ülkenin ismi Amerika ise ekrana USA, 
		//Ingiltere ise ekrana UK,
		//Almanya ise ekrana DE yazdýrýn.
		//Diðer ülkeler için ise NA yazdýrýn.
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ülkenizin adýný  giriniz");
		String ad =scan.next();
	
	if (ad.equalsIgnoreCase("amerika")) {
		System.out.println("USA");
	}else if (ad.equalsIgnoreCase("ingiltere"))  {
		System.out.println("UK");
	}else if (ad.equalsIgnoreCase("almanya"))  {
		System.out.println("DE");
	}else {
		System.out.println("NA");
	}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	}

}
