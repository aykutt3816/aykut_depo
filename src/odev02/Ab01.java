package odev02;

import java.util.Scanner;

public class Ab01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir yýl alýn
		//eðer yýl 1000’e bulunuyorsa ekrana “Milenyum” yazdýrýn.
		//Eðer yýl 100’e bulunuyorsa ekrana “Yüzyýl” yazdýrýn.
		//Eðer yýl 10’a bulunuyorsa ekrana “Onyýl” yazdýrýn
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lütfen bir yýl giriniz");
	int yil=scan.nextInt();
	if (yil<100) {
		System.out.println("onyýl");
	}else if(yil<1000) {
		System.out.println("yüzyýl");
	}else{
		System.out.println("milenyum");
	}
	

	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	}

}
