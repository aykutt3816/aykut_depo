package odev04;

import java.util.Scanner;

public class Ad2 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� al�n
		//e�er tamsay� 9 ise ekrana �Bir basamakl� en b�y�k say�� yazd�r�n.
		//99 ise ekrana ��ki basamakl� en b�y�k say�� yazd�r�n.
		//999 ise ekrana ��� basamakl� en b�y�k say�� yazd�r�n.
		//Bu say�lar�n d���ndaki say�lar i�in �Yorum yok� yazd�r�n

		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen bir say� giriniz");
		int num= scan.nextInt();
	
	switch(num) {
	case 9 :
	System.out.println("bir basamakl� en b�y�k sayi");
	case 99 :
		System.out.println("iki basamakl� en b�y�k sayi");
	
	case 999 :
		System.out.println("�� basamakl� en b�y�k sayi");
	default:
	System.out.println("yorum yok");
	
	
	}
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
