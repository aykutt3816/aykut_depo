package odev05;

import java.util.Scanner;

public class Db03 {

	public static void main(String[] args) {
		// Kullan�c�dan ilk ve soy ismini al�n 
		//ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ilkad�n�z�  giriniz");
		String ad =scan.next();
		ad=ad.toUpperCase();
		System.out.println("l�tfen soyad�n�z�  giriniz");
		String soyad =scan.next();
		soyad=soyad.toUpperCase();
		System.out.print(ad.charAt(0));
	System.out.println(soyad.charAt(0));
	
	

	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
