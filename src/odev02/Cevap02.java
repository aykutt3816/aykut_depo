package odev02;

import java.util.Scanner;

public class Cevap02 {

	public static void main(String[] args) {
		// Kullan�c�dan bir gun al�n
		//e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n.
		//�Pazar� ise ekrana  �H�ristiyanlar icin kutsal g�n� yazd�r�n
	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir gun giriniz");
	String gun=scan.next();
	if(gun.equals("cuma")) {
		System.out.println("m�sl�manlar i�in kutsal g�n");
	}if(gun.equals("cumartesi")) {
		System.out.println("yahudiler i�in kutsal g�n");
	}if(gun.equals("pazar")) {
		System.out.println("hristiyanlar i�in kutsal g�n");
	}
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
