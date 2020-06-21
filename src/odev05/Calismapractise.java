package odev05;

import java.util.Scanner;

public class Calismapractise {

	public static void main(String[] args) {
		

		/* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin
                 1983
                 2020        
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi,
         isim ve soyisim karakter uzunluklarýný 
        içeren bir þifre oluþturunuz
           //Þifre= 37HEi56        
        */
		//benim yaptýðým
		Scanner scan=new Scanner(System.in);
      System.out.println("lütfen adýnýzý ve soy adýnýzý giriniz");
           String ad=scan.next();
           String soyad=scan.next();
	System.out.println("lütfen doðum tarihinizi ve þimdiki yýlý giriniz");
	int dy=scan.nextInt();
	int sy=scan.nextInt();
	int yas=sy-dy;
	
	System.out.print("adýnýz:"+ ad);
	System.out.print(" , soyadýnýz:"+ soyad);
	System.out.println(" , yaþýnýz:"+ (yas));
	
	
	
	
	String sifre=yas+ad.substring(0,1)+soyad.charAt(0)
    +soyad.charAt(soyad.length()-1)+ad.length()+soyad.length();
System.out.println(sifre);
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
