package odev06;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  harflerini al�n
		//ve ba�lang�� harfinden ba�lay�p biti� harfinde  biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n
	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ba�lang� ve biti� harflerini giriniz");
		
		char strt=scan.next().toUpperCase().charAt(0);
		char end=scan.next().toUpperCase().charAt(0);

	
		
	
		
		
		
		
		
		
		
		for(char i=strt;i<end+1;i++) {
		System.out.println(i);
		
	}
	
scan.close();
	
	}

}
