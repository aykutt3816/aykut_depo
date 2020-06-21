package odev10;

import java.util.Scanner;

public class Asde01 {

	public static void main(String[] args) {
		//Aþaðýdaki sorularý çözerken metodlarý main methodun dýþýnda oluþturup main methodun icinden çaðýrýnýz
        //Kullanýcýdan isim ve soyismini alýn.
		//Kullanýcýnýn isim ve soyisminin ilk harflerini büyük diðer harflerini küçük harf olarak ekrana yazdýran
		//programý yazýnýz
     Scanner scan=new Scanner(System.in);
	System.out.println("lütfen isim giriniz");
	String isim=scan.nextLine().toLowerCase();
	System.out.println("lütfen soyisim giriniz");
	String soyisim=scan.nextLine().toLowerCase();
	
    isim(isim,soyisim);
    scan.close();
	}
     public static void isim(String isim,String soyisim) {
    	  isim=isim.toUpperCase().charAt(0)+isim.substring(1, isim.length());
    	  soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1, soyisim.length());
    	System.out.println(isim+" "+soyisim);
     }
}
