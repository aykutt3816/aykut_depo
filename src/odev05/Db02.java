package odev05;

import java.util.Scanner;

public class Db02 {

	public static void main(String[] args) {
		// Kullan�c�dan ilk ve soy ismini al�n
		//ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ilkad�n�z�  giriniz");
		String ad =scan.next();
		System.out.println("l�tfen soyad�n�z�  giriniz");
		String soyad =scan.next();
	int lenght1=ad.length();
	int lenght2=soyad.length();
	System.out.println(lenght1+lenght2);
	
	
	
	scan.close();
	
	
	}

}
