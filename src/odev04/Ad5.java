package odev04;

import java.util.Scanner;

public class Ad5 {

	public static void main(String[] args) {
		// Kullan�c�dan bir gun al�n
		//e�er gun �Cuma� ise ekrana �M�sl�manlar i�in kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler i�in kutsal g�n� yazd�r�n.
		//�Pazar� ise ekrana  �H�ristiyanlar i�in kutsal g�n� yazd�r�n.
		//Diler g�nler icin �Kutsal g�n de�il� yazd�r�n.
	Scanner scan =new Scanner(System.in);
	System.out.println("l�tfen bir g�n giriniz");
	String day= scan.next();
	
	switch (day) {
	case "cuma":
	System.out.println("m�sl�manlar i�in kutsal g�n");
	break;
	case "cumartesi":
		System.out.println("yahudiler i�in kutsal g�n");
		break;
	case "pazar":
		System.out.println("hristiyanlar i�in kutsal g�n");
		break;
		default:
	System.out.println("kutsal g�n de�ildir");
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
