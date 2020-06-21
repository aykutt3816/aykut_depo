package odev02;

import java.util.Scanner;

public class Cb2 {

	public static void main(String[] args) {
		// Kullanýcýdan bir harf girmesini isteyin. 
		//Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin.
		//Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
		//“a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn. 
		//Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin.
		//Harf “Z” ise ekrana “Son büyük harf” yazdýrýn. 
		//“Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir harf giriniz");
	char harf=scan.next().charAt(0);

	if(harf>=97&&harf<=122) {
		if(harf==97) {
			System.out.println("ilk küçük harf");
		}else if(harf!=97) {
			System.out.println("ilk küçük harf deðil");
		}
	}else if(harf>=65&&harf<=90) {
		if(harf==90) {
			System.out.println("son büyük harf");
		}else if(harf!=90) {
			System.out.println("son büyük harf deðil");
		}
	}
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	}

}
