package odev10;

import java.util.Scanner;

public class Asde01 {

	public static void main(String[] args) {
		//A�a��daki sorular� ��zerken metodlar� main methodun d���nda olu�turup main methodun icinden �a��r�n�z
        //Kullan�c�dan isim ve soyismini al�n.
		//Kullan�c�n�n isim ve soyisminin ilk harflerini b�y�k di�er harflerini k���k harf olarak ekrana yazd�ran
		//program� yaz�n�z
     Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen isim giriniz");
	String isim=scan.nextLine().toLowerCase();
	System.out.println("l�tfen soyisim giriniz");
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
