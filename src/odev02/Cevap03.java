package odev02;

import java.util.Scanner;

public class Cevap03 {

	public static void main(String[] args) {
		// Kullanýcýdan iki sayý alýn
		//eðer sayýlarýn iþaretleri  ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		//Sayýlarýn iþaretleri  farklý ise ekrana “Farklý iþaretli” yazdýrýn
	
	Scanner scan=new Scanner(System.in);
		System.out.println("lütfen iki sayý giriniz");
	int num1=scan.nextInt();
		
	int num2=scan.nextInt();

			
	if (num1 < 0  && num2<0 ||num1>0 && num2>0) {
		System.out.println("Ayný isaretli");
		
	}if (num1>0 && num2<0 || num1<0 && num2>0) {
		System.out.println("Farklý isaretli");
	}

	
	scan.close();
	
	
	
	
	
	
	}

}
