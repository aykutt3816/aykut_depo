package odev08;

import java.util.Scanner;

public class Ad04 {

	public static void main(String[] args) {
		// Kullan�c�dan uzunlu�u �ift say� olan bir String al�n
		//ve bu String�in ilk yar�s�n� ekrana yazd�r�n.
		//Ornegin; Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen caraker uzunlu�u �ift say� olan bir string giriniz");
	
	String str=scan.next();
	int lenght=str.length();
	System.out.println("2.yar�"+": "+str.substring(str.length()/2));
	System.out.println("1.yar�"+": "+str.substring(0,str.length()/2));
	
	
	
	scan.close();
	
	
	
	
	
	}

}
