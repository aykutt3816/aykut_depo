package odev02;

import java.util.Scanner;

public class New1 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� al�n 
		//e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		//0 ise ekrana �N�tr� yazd�r�n.
		//0 dan b�y�k ise ekrana �Pozitif� yazd�r�n.

	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsayi giriniz");
	int sayi=scan.nextInt();
		if(sayi<0) {
			System.out.println("negatif");
		}if (sayi>0) {
			System.out.println("pozitif");
		}if(sayi==0) {
			System.out.println("n�tr");
		}
	
	
	
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
