package odev02;

import java.util.Scanner;

public class Calisma04 {

	public static void main(String[] args) {
		// kullanýcýdan bir tamsayý alýn
		//eðer tamsayý 10 dan kucuk ve 0’dan büyük eþit ise ekrana  “Rakam” yazdýrýn. 
		//Diðer durumlarda ekrana “Sayý” yazdýrýn
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayi  giriniz");
	int num=scan.nextInt();
	if((num<10)&&(num>=0)){
		System.out.println("Rakam");
	}else {
		System.out.println("sayi");
	}
	
			
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
