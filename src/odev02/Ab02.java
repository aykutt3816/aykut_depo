package odev02;

import java.util.Scanner;

public class Ab02 {

	public static void main(String[] args) {
		// Kullan�c�dan notunu al�n
		//ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
		//1. 50 den az - D     
		//2. 50(dahil) ile 60 aras� - C      
		//3. 60(dahil) ile 80 aras� - B.    
		//4. 80(dahil) ustu- A 

		Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen aldiginz notu giriniz");
	int not=scan.nextInt();
	if (not<50) {
		System.out.println("d");
	}else if(not<60) {
		System.out.println("c");
	}else if(not<80) {
		System.out.println("b");
	}else {
		System.out.println("a");
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
