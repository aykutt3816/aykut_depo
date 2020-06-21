package odev02;

import java.util.Scanner;

public class Cb1 {

	public static void main(String[] args) {
		// Kullanýcýdan cinsiyetini girmesini isteyin.
		//Erkek ise yaþýný kontrol edin.
		//Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
		//Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn. 
		//Kadin ise yasini kontrol edin.
		//Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn. 
		//Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen cinsiyetinizi girniz");

	String cinsiyet=scan.next();
	System.out.println("lütfen yaþinizi giriniz");
	int yas=scan.nextInt();
	if (cinsiyet.equalsIgnoreCase("erkek") ) {
		if(yas<18) {
			System.out.println("erkek cocuk");
		}else if(yas>=18) {
			System.out.println("adam");
		}
		
		
	}else if (cinsiyet.equalsIgnoreCase("kadin") ) {
		if(yas<18) {
			System.out.println("kýz cocuk");
		}else if(yas>=18) {
			System.out.println("kadýn");
	
	
	
	
		}
	
	
	
	
	
	
	
	
	}
	scan.close();
	}
}
