package odev02;

import java.util.Scanner;

public class Ab03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n
	//	e�er �� kenar uzunlu�u birbirine e�it ise ekrana  �E�kenar ��gen� yazd�r�n.
		//Sadece iki kenar uzunlu�u birbirine e�it ise ekrana �Ikizkenar ��gen�  yazd�r�n.
		//T�m kenar uzunluklar� birbirinden farkl� ise ��e�itkenar ��gen yazd�r�n

		Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen ��tane kenar girin");
	
	int knr1=scan.nextInt();
	int knr2=scan.nextInt();
	int knr3=scan.nextInt();
	if(knr1==knr2&&knr2==knr3&&knr1==knr3) {
		System.out.println("eskenar ��gen");
	}else if(knr1==knr2||knr2==knr3||knr1==knr3) {
		System.out.println("ikizkenar �cgen");
	}else {
		System.out.println("�e�it kenar ��gen");
	}
	
	
	scan.close();
	
	
	
	
	}

}
