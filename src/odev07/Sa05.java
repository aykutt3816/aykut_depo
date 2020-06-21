package odev07;

import java.util.Scanner;

public class Sa05 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen baþlangýç ve bitiþ sayýlarýný giriniz");
		
		        int strt=scan.nextInt();
				int end=scan.nextInt();
				
				int product=1;
	
		for(int i=strt;i<end+1;i++) {
		product=product*i;
			
		}System.out.println(product);
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
