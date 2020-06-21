package odev09;

import java.util.Scanner;

public class Ads05 {

	public static void main(String[] args) {
		// Kullanýcýya bir String girmesini söyleyin 
		//ve bu String’in ilk harfi ile son harfi ayný ise ekrana  “Simetrik” yazdýrýn.
		//Ayný deðilse tekrar bir String girmesini isteyin.
		Scanner scan=new Scanner(System.in);
	String str="";
	
	
	do {
		System.out.println("lütfen bir kelime yada cümle giriniz");
		str=scan.nextLine();
		
		
	}while((str.charAt(0)!=str.charAt(str.length()-1)));
	System.out.println("simetrik");
	

	
	scan.close();
	
	
	
	
	}

}
