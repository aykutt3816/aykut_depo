package odev09;

import java.util.Scanner;

public class Ads05 {

	public static void main(String[] args) {
		// Kullan�c�ya bir String girmesini s�yleyin 
		//ve bu String�in ilk harfi ile son harfi ayn� ise ekrana  �Simetrik� yazd�r�n.
		//Ayn� de�ilse tekrar bir String girmesini isteyin.
		Scanner scan=new Scanner(System.in);
	String str="";
	
	
	do {
		System.out.println("l�tfen bir kelime yada c�mle giriniz");
		str=scan.nextLine();
		
		
	}while((str.charAt(0)!=str.charAt(str.length()-1)));
	System.out.println("simetrik");
	

	
	scan.close();
	
	
	
	
	}

}
