package odev02;

import java.util.Scanner;

public class Calism04 {

	public static void main(String[] args) {
		// kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn
		//eðer üç kenar uzunluðu birbirine eþit ise ekrana  “Eþkenar üçgen” yazdýrýn.
		//Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen ucgenin kenarlarýný giriniz");
	int knr1=scan.nextInt();
		
	int knr2=scan.nextInt();

	int knr3=scan.nextInt();
	
	if(knr1 == knr2&&knr2 == knr3) {
		System.out.println("eskenar ucgen");
	}else {
		System.out.println("eskenar deðil");
	}
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
