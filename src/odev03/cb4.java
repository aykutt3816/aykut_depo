package odev03;

import java.util.Scanner;

public class cb4 {

	public static void main(String[] args) {
		// Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin.
		//En ve boy e�it ise ekrana �Kare� farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen dikd�rtgenin enini giriniz");
	int en=scan.nextInt();
	System.out.println("l�tfen dikd�rtgenin boyunu giriniz");
	int boy=scan.nextInt();
	
	String result=en==boy?"kare":"dikd�rtgen";
	System.out.println(result);
	
	
	
	
	scan.close();
	
	}

	

}
