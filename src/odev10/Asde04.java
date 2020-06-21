package odev10;

import java.util.Scanner;

public class Asde04 {

	public static void main(String[] args) {
		// Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayý seçmesini söyleyin.
		//Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen geometrik birþekil seçiniz");
	String sekil=scan.next().toUpperCase();
	System.out.println("lütfen kenar uzunluðu giriniz");
	int kenar=scan.nextInt();
	System.out.println("lütfen yukseklik giriniz");
	int yukseklik=scan.nextInt();
	alanVeCevrehesaplama(sekil, kenar,yukseklik);
	scan.close();
	}
public static void alanVeCevrehesaplama(String sekil,int kenar ,int yukseklik) {
	
	switch(sekil) {
		case "PARELELKENAR":
		    System.out.println("PARELELKENAR çevre="+(kenar+yukseklik)*2);
		    System.out.println("PARELELKENAR alan="+(kenar*yukseklik));
		break;
		case "DÝKDÖRTGEN":
			System.out.println(" DÝKDÖRTGEN çevre="+(kenar+yukseklik)*2);
			System.out.println("DÝKDÖRTGEN alan="+(kenar*yukseklik));
			break;
		case "ÜÇGEN":
			System.out.println("ÜÇGEN çevre="+(kenar+kenar+kenar));
			System.out.println("ÜÇGEN alan="+(kenar*yukseklik)/2);
			break;
		default:
			System.out.println("PARELELKENAR DÝLDÖRTGEN ÜÇGEN HARÝCÝ  secmeyiniz");
}}
	
	
	
	
	
	
	
	
	
	
}
