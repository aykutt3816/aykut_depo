package odev05;

import java.util.Scanner;

public class Db05 {

	public static void main(String[] args) {
		//Kullan�c�dan ya�ad��� �lkenin ismini al�n
		//bu �lkenin ismi Amerika ise ekrana USA, 
		//Ingiltere ise ekrana UK,
		//Almanya ise ekrana DE yazd�r�n.
		//Di�er �lkeler i�in ise NA yazd�r�n.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen �lkenizin ad�n�  giriniz");
		String ad =scan.next();
	
	if (ad.equalsIgnoreCase("amerika")) {
		System.out.println("USA");
	}else if (ad.equalsIgnoreCase("ingiltere"))  {
		System.out.println("UK");
	}else if (ad.equalsIgnoreCase("almanya"))  {
		System.out.println("DE");
	}else {
		System.out.println("NA");
	}
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	
		
	
	
	
	
	
	
	
	
	
	
	}

}
