package odev02;

import java.util.Scanner;

public class Ab01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l al�n
		//e�er y�l 1000�e bulunuyorsa ekrana �Milenyum� yazd�r�n.
		//E�er y�l 100�e bulunuyorsa ekrana �Y�zy�l� yazd�r�n.
		//E�er y�l 10�a bulunuyorsa ekrana �Ony�l� yazd�r�n
		 Scanner scan = new Scanner(System.in);
	        System.out.println("l�tfen bir y�l giriniz");
	int yil=scan.nextInt();
	if (yil<100) {
		System.out.println("ony�l");
	}else if(yil<1000) {
		System.out.println("y�zy�l");
	}else{
		System.out.println("milenyum");
	}
	

	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	}

}
