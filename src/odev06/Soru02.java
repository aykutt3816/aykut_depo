package odev06;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		// ve baþlangýç deðerinden veya sonrasýndan   baþlayýp bitiþ deðerinde veya öncesinde  biten tüm çift tamsayýlarý ekrana yazdýrýn
//1 den baslayýp 150 ye kadar olan tüm çift sayýlarýný ekrana  yan yana aralarýna virgülkoyarak yazdýrýýnýz
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen  baþlangýç ve bitiþ sayýlarýný veriniz");
		int strt=scan.nextInt();
		int end=scan.nextInt();
		for (int i=strt;i<end+1;i+=2) {
			System.out.print(i+",");
		}
		
	
	
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
