package odev04;

import java.util.Scanner;

public class Ad3 {

	public static void main(String[] args) {
		// Kullan�c�dan ay ismi al�nn�z
		 //e�er ay ismi  31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
		//E�er ay ismi  30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n. 
		//E�er ay ismi  28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
		//Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n
		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen bir ay giriniz");
		String ay= scan.next();
	ay=ay.toLowerCase();
		
		
		
		switch(ay) {
	case "ocak":
		System.out.println("bu ay 31 g�nd�r");
	case "�ubat":
		System.out.println("bu ay �ubat ay�d�r ");
	case "mart":
		System.out.println("bu ay 31 g�nd�r");
	case "nisan":
		System.out.println("bu ay 30 g�nd�r");
	case "may�s":
		System.out.println("bu ay 31 g�nd�r");
	case "haziran":
		System.out.println("bu ay 30 g�nd�r");
	case "temmuz":
		System.out.println("bu ay 31 g�nd�r");
	case "agustos":
		System.out.println("bu ay 31 g�nd�r");
	case "eyl�l":
		System.out.println("bu ay 310g�nd�r");
	case "ekim":
		System.out.println("bu ay 31 g�nd�r");
	case "kas�m":
		System.out.println("bu ay 30 g�nd�r");
	case "aral�k":
		System.out.println("bu ay 31 g�nd�r");
	default:
	System.out.println("b�yle bir ay ismi yoktur");
	
	
	
	
	}
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
