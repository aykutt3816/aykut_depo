package odev02;

import java.util.Scanner;

public class New03 {

	public static void main(String[] args) {
		// Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n.
		//E�er urun miktar� 1000 den fazla ise  Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n.
		//Di�er durumlarda  �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n

	

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen urun miktarini  ve birim fiyatini giriniz");
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
