package odev09;

import java.util.Scanner;

public class Ads04 {

	public static void main(String[] args) {
		// Kullanýcýya iki sayý girmesini söyleyin.
		//Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
		//Eþit deðilse tekrar iki sayý girmesini söyleyin.

		Scanner scan=new Scanner(System.in);
	int num1=0;
	int num2=0;
	do {System.out.println("lütfen birsayý deðerini giriniz");
	 num1=scan.nextInt();
	 System.out.println("lütfen bir sayý daha deðerini giriniz");
		 num2=scan.nextInt();

		if(num1==num2) {
			System.out.println("kare oluþturdunuz");
		}
	}while(num1!=num2);
	
	
	scan.close();
	
	
	
	
	
	}

}
