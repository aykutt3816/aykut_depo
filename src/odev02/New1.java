package odev02;

import java.util.Scanner;

public class New1 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý alýn 
		//eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		//0 ise ekrana “Nötr” yazdýrýn.
		//0 dan büyük ise ekrana “Pozitif” yazdýrýn.

	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayi giriniz");
	int sayi=scan.nextInt();
		if(sayi<0) {
			System.out.println("negatif");
		}if (sayi>0) {
			System.out.println("pozitif");
		}if(sayi==0) {
			System.out.println("nötr");
		}
	
	
	
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
