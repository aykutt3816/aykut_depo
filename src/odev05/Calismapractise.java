package odev05;

import java.util.Scanner;

public class Calismapractise {

	public static void main(String[] args) {
		

		/* 
        scanner kullanarak a�a��daki sorulara cevaplar isteyiniz
        1.Ad�m: 3 adet String tan�mlay�n�z. ad, soyad, rapor
        2.Ad�m: 2 adet integer tan�mlay�n�z  do�um y�l�, �imdiki y�l
        3.Ad�m: Kullan�c�dan; "L�tfen ad�n�z� ve soy ad�n�z� giriniz:" isteyin
                 Harun
                 Ekinci
        4.Ad�m: Kullan�c�dan;"L�tfen do�um y�l�n�z� ve �imdiki y�l� giriniz:" isteyin
                 1983
                 2020        
        5.Ad�m Raporu a�a��daki gibi yazd�r�n�z      
                "Ad�n�z: Harun, Soy ad�n�z: Ekinci, Ya��n�z: 37"
        6. Ad�m: Ya��n�z,Ad�n�z�n ilk harfi, soyad�n�z�n ilk ve son harfi,
         isim ve soyisim karakter uzunluklar�n� 
        i�eren bir �ifre olu�turunuz
           //�ifre= 37HEi56        
        */
		//benim yapt���m
		Scanner scan=new Scanner(System.in);
      System.out.println("l�tfen ad�n�z� ve soy ad�n�z� giriniz");
           String ad=scan.next();
           String soyad=scan.next();
	System.out.println("l�tfen do�um tarihinizi ve �imdiki y�l� giriniz");
	int dy=scan.nextInt();
	int sy=scan.nextInt();
	int yas=sy-dy;
	
	System.out.print("ad�n�z:"+ ad);
	System.out.print(" , soyad�n�z:"+ soyad);
	System.out.println(" , ya��n�z:"+ (yas));
	
	
	
	
	String sifre=yas+ad.substring(0,1)+soyad.charAt(0)
    +soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
System.out.println(sifre);
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
