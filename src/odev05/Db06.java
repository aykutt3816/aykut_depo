package odev05;

import java.util.Scanner;

public class Db06 {

	public static void main(String[] args) {
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n
		//bu �lkenin bastan ikinci harfi ile sondan ikinci harfini  b�y�k harf olarak ekrana yazd�r�n

	    Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen �lkenizin ad�n�  giriniz");
		String ulke =scan.next();
		ulke=ulke.toUpperCase();
		System.out.println(ulke.toUpperCase());
		int lenght=ulke.length();
		System.out.print(ulke.charAt(1));
		System.out.print(ulke.charAt(lenght-2));
	
		
	
	scan.close();
	
	
	
	
	}

}
