package odev09;

import java.util.Scanner;

public class Ads04 {

	public static void main(String[] args) {
		// Kullan�c�ya iki say� girmesini s�yleyin.
		//Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n.
		//E�it de�ilse tekrar iki say� girmesini s�yleyin.

		Scanner scan=new Scanner(System.in);
	int num1=0;
	int num2=0;
	do {System.out.println("l�tfen birsay� de�erini giriniz");
	 num1=scan.nextInt();
	 System.out.println("l�tfen bir say� daha de�erini giriniz");
		 num2=scan.nextInt();

		if(num1==num2) {
			System.out.println("kare olu�turdunuz");
		}
	}while(num1!=num2);
	
	
	scan.close();
	
	
	
	
	
	}

}
