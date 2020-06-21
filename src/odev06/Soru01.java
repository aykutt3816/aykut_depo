package odev06;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarý ekrana yazdýrýn
//1 den baslayýp 150 ye kadar olan tüm sayma sayýlarýný ekrana  yan yana aralarýna virgülkoyarak yazdýrýýnýz
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen  baþlangýç ve bitiþ sayýlarýný veriniz");
	
	
	
	int strt=scan.nextInt();
	int end=scan.nextInt();
	for (int i=strt;i<end+1;i++) {
		System.out.print(i+",");
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
