package odev04;

import java.util.Scanner;

public class Ad3 {

	public static void main(String[] args) {
		// Kullanýcýdan ay ismi alýnnýz
		 //eðer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
		//Eðer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn. 
		//Eðer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
		//Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn
		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen bir ay giriniz");
		String ay= scan.next();
	ay=ay.toLowerCase();
		
		
		
		switch(ay) {
	case "ocak":
		System.out.println("bu ay 31 gündür");
	case "þubat":
		System.out.println("bu ay þubat ayýdýr ");
	case "mart":
		System.out.println("bu ay 31 gündür");
	case "nisan":
		System.out.println("bu ay 30 gündür");
	case "mayýs":
		System.out.println("bu ay 31 gündür");
	case "haziran":
		System.out.println("bu ay 30 gündür");
	case "temmuz":
		System.out.println("bu ay 31 gündür");
	case "agustos":
		System.out.println("bu ay 31 gündür");
	case "eylül":
		System.out.println("bu ay 310gündür");
	case "ekim":
		System.out.println("bu ay 31 gündür");
	case "kasým":
		System.out.println("bu ay 30 gündür");
	case "aralýk":
		System.out.println("bu ay 31 gündür");
	default:
	System.out.println("böyle bir ay ismi yoktur");
	
	
	
	
	}
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
