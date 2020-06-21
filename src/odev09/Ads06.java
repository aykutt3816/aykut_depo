package odev09;

import java.util.Scanner;

public class Ads06 {

	public static void main(String[] args) {
		// Kullanýcýdan bir String alýn
		//ve bu String’in icinde “a” harfi varsa ekrana “a harfi var” yazdýrýn.
		//“a” harfi yoksa tekrar bir String girmesini isteyin.
		Scanner scan=new Scanner(System.in);
		String str="";
		
		
		do {
			System.out.println("lütfen bir kelime yada cümle giriniz");
			str=scan.nextLine();
			
			
		}while(!(str.contains("a")));
		System.out.println("a harfi var");
		
	
	
	scan.close();
	
	
	
	}

}
