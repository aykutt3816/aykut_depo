package odev02;

import java.util.Scanner;

public class New03 {

	public static void main(String[] args) {
		// Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn.
		//Eðer urun miktarý 1000 den fazla ise  Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn.
		//Diðer durumlarda  ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn

	

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen urun miktarini  ve birim fiyatini giriniz");
	int urun=scan.nextInt();
		
	int fiat=scan.nextInt();
	if(urun>1000) {
		int top=(urun*fiat)-(urun*fiat)*10/100;
		System.out.println(top);
	}else {
		int indrmsz=(urun*fiat);
		System.out.println(indrmsz);
	}
	
	
	scan.close();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
