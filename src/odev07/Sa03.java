package odev07;

import java.util.Scanner;

public class Sa03 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		// ve baþlangýç deðerinden veya sonrasýndan   baþlayýp bitiþ deðerinde veya öncesinde biten 
		//tüm çift tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.

	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen baþlangýç ve bitiþ sayýlarýný giriniz");
	
	        int strt=scan.nextInt();
			int end=scan.nextInt();
			int i=strt;
		
	while(i<end) {
		if(i%2==0) {
			System.out.print(i+",");
		}
		
		i++;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
