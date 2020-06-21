package odev09;

import java.util.Scanner;

public class Ads02 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz

	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen baþlangiç deðerini giriniz");
	int strt=scan.nextInt();
	 System.out.println("lütfen bitiþ deðerini giriniz");
	int	 end=scan.nextInt();
    
   
	int i=strt;
	 do {
		 
		  if(i%4==0&&i%6==0) {
			 System.out.print(i+",");
			 }
		  i++;
		  }while(i<=end);  

	 
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
