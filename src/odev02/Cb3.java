package odev02;

import java.util.Scanner;

public class Cb3 {

	public static void main(String[] args) {
		// Kullan�c�dan password girmesini isteyin. 
		//Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin.
		//Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n. 
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen Password unuz� giriniz");
	
	int ps=scan.nextInt();
	if(ps%5==0) {
		if(ps%10==0) {
			System.out.println("5'e b�l�nen �ift say�");
		}else {
			System.out.println("5'e b�l�nen tek say�");
		}
	} 
		
		
	
	
	
	
	scan.close();
	
	}
	
}
	
	
	
	
	
	
	
	

