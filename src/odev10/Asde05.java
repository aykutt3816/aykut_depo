package odev10;

import java.util.Scanner;

public class Asde05 {

	public static void main(String[] args) {
		//Kullan�c�ya bir String girmesini s�yleyin
		//ve bu String�i yukar�dan a�a��ya do�ru yazd�ran  Program yaz�n�z.
		//Ornegin; CAN ==> C 
		//		           A
		//		           N
		//do_while kullanarak bir oyun tasarlay�n	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str=scan.next().toUpperCase();
		int lenght=str.length();
		int i=0;
		yatay(str,lenght,i);
		scan.close();
	}
	
	public static void yatay(String str,int lenght,int i) {
		while(i<lenght) {
		System.out.println(str.charAt(i));
		i++;
	}

	}






}