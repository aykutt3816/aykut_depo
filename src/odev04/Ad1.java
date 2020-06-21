package odev04;

import java.util.Scanner;

public class Ad1 {

	public static void main(String[] args) {
		// Kullanýcýdan bir harf alýn 
		//eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		//“b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
		//Bu harflerin dýþýnda bir character için “Geçersiz character” yazdýrýn.

		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen bir harf giriniz");
	
	char harf=scan.next().charAt(0);
	
	switch (harf) {
	
	case 'a':
		System.out.println("sesli harf");
	break;
	case 'b':
		System.out.println("sessiz harf");
	break;
	
	case 'e':
		System.out.println("sesli harf");
	break;
	case 'i':
		System.out.println("sesli harf");
	break;
	case 'o':
		System.out.println("sesli harf");
	break;
	case 'u':
		System.out.println("sesli harf");
	break;
	case 'c':
		System.out.println("sessiz harf");
	break;
	
	case 'd':
		System.out.println("sessiz harf");
	break;
	default:
		System.out.println("gecersiz karakter");
	
	
	
	
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
