package odev02;

import java.util.Scanner;

public class Calism04 {

	public static void main(String[] args) {
		// kullan�c�dan bir ��genin  �� kenar uzunlu�unu al�n
		//e�er �� kenar uzunlu�u birbirine e�it ise ekrana  �E�kenar ��gen� yazd�r�n.
		//Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ucgenin kenarlar�n� giriniz");
	int knr1=scan.nextInt();
		
	int knr2=scan.nextInt();

	int knr3=scan.nextInt();
	
	if(knr1 == knr2&&knr2 == knr3) {
		System.out.println("eskenar ucgen");
	}else {
		System.out.println("eskenar de�il");
	}
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
