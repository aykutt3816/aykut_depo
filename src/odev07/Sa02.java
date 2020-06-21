package odev07;

import java.util.Scanner;

public class Sa02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz
        Scanner scan=new Scanner(System.in);
	System.out.println("lütfen baþlangýç ve bitiþ sayýlarýný giriniz");
	int strt=scan.nextInt();
	int end=scan.nextInt();
	int i=strt;
	while(i<end+1) {
		System.out.print(i+",");
		i++;
	}
	
	
	
	scan.close();
	
	
	
	
	}

}
