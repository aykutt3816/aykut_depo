package odev02;

import java.util.Scanner;

public class Cb1 {

	public static void main(String[] args) {
		// Kullan�c�dan cinsiyetini girmesini isteyin.
		//Erkek ise ya��n� kontrol edin.
		//Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
		//Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n. 
		//Kadin ise yasini kontrol edin.
		//Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n. 
		//Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen cinsiyetinizi girniz");

	String cinsiyet=scan.next();
	System.out.println("l�tfen ya�inizi giriniz");
	int yas=scan.nextInt();
	if (cinsiyet.equalsIgnoreCase("erkek") ) {
		if(yas<18) {
			System.out.println("erkek cocuk");
		}else if(yas>=18) {
			System.out.println("adam");
		}
		
		
	}else if (cinsiyet.equalsIgnoreCase("kadin") ) {
		if(yas<18) {
			System.out.println("k�z cocuk");
		}else if(yas>=18) {
			System.out.println("kad�n");
	
	
	
	
		}
	
	
	
	
	
	
	
	
	}
	scan.close();
	}
}
