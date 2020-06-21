package odev02;

import java.util.Scanner;

public class Ab03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir üçgenin  üç kenar uzunluðunu alýn
	//	eðer üç kenar uzunluðu birbirine eþit ise ekrana  “Eþkenar üçgen” yazdýrýn.
		//Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”  yazdýrýn.
		//Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn

		Scanner scan=new Scanner(System.in);
	System.out.println("lütfen üçtane kenar girin");
	
	int knr1=scan.nextInt();
	int knr2=scan.nextInt();
	int knr3=scan.nextInt();
	if(knr1==knr2&&knr2==knr3&&knr1==knr3) {
		System.out.println("eskenar üçgen");
	}else if(knr1==knr2||knr2==knr3||knr1==knr3) {
		System.out.println("ikizkenar ücgen");
	}else {
		System.out.println("çeþit kenar üçgen");
	}
	
	
	scan.close();
	
	
	
	
	}

}
