package odev07;

import java.util.Scanner;

public class Sa07 {

	public static void main(String[] args) {
		// Kullanýcýdan bir rakam alýn
		//ve bu rakam icin çarpým tablosunu ekrana yazdýrýn.
		//Kullanýcýnýn hata yapmadýðýný farz edin. 
		//Ornegin kullanýcý 3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir rakam giriniz");
	
	int num=scan.nextInt();

	
		for(int i=1;i<11;i++) {
			System.out.println(num+"x"+i+"="+(num*i));
			
		}
	
	System.out.println("while ile çözüm");
	int num1=1;
	while(num1<11) {
		System.out.println(num+"x"+num1+"="+(num*num1));
		num1++;
	}
	
	
	
	
	
	
	
	
	
	}

}
