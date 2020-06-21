package odev08;

import java.util.Scanner;

public class Ad02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 3 ve 5 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen baþlangýç deðerinigiriniz");
	int strt=scan.nextInt();
	System.out.println("lütfen bitiþ deðerini giriniz");
	int end=scan.nextInt();
	
	for(int i=strt;i<=end;i++) {
		if(i%3==0&&i%5==0) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	}

}
