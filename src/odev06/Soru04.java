package odev06;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen baþlangç ve bitiþ sayýlarýný giriniz");
	int strt=scan.nextInt();
	int end=scan.nextInt();
	int sum=0;
	for(int i=strt;i<end+1;i++){
		sum=sum+i;
	}
	System.out.println(sum);
	
	scan.close();
	
	
	
	}

}
