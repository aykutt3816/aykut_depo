package odev05;

import java.util.Scanner;

public class Db04 {

	public static void main(String[] args) {
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n
		//bu �lkenin ilk iki harfini b�y�k harf olarak ekrana yazd�r�n.

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen �lkenizin ad�n�  giriniz");
		String ad =scan.next();
		ad=ad.toUpperCase();
	System.out.print(ad.charAt(0));
	System.out.println(ad.charAt(1));
	
	
	
	scan.close();
	
	
	
	
	}

}
