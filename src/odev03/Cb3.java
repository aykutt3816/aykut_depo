package odev03;

import java.util.Scanner;

public class Cb3 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin,
		//ekrana tamsay�n�n mutlak degerini yazd�r�n

	

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsayi giriniz");
		int num1=scan.nextInt();
	
	int result=(num1>=0)?num1:num1*-1;
	System.out.println(result);
	
	
	scan.close();
	
	
	
	
	}

}