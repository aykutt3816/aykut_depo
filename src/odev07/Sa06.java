package odev07;

import java.util.Scanner;

public class Sa06 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  harflerini al�nn
		//ve ba�lang�� harfinden ba�lay�p biti� harfinde  biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n.
	//	Kullan�c�n�n hata yapmad���n� farz edin.

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ba�lang�� ve biti� harflerini giriniz");
		
	       char a=scan.next().toUpperCase().charAt(0);
			char z=scan.next().toUpperCase().charAt(0);
	for(char i=a;i<z;i++) {
		System.out.println(i);
	}
	
	
			
	

	
	
	
	
	
	
	
	
	
	}

}
