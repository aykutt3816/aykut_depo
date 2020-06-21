package odev03;

import java.util.Scanner;

public class Cb7 {

	public static void main(String[] args) {
		// kullanýcýdan bir karekter girmesini isteyiniz
		// karakter harf ise küçük harf olup olmadigini kontrol ediniz
		// küçük harf ise ekrana küçük harf yazdýrýnýz
		// büyük harf ise ekrana büyük harf yazdýrýnýz
        // harf degilse ekrana harf deðil yazdýrýnýz
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz");
	char krktr=scan.next().charAt(0);
	String result=krktr>='a'&&krktr<='z'||krktr>='A'&&krktr<='Z'?krktr>='a'&&krktr<='z'?"küçük harf":"büyük harf"
		:"harf deðil";
	
	System.out.println(result);
	
	//String result =	((ch<=122&&ch>=97)||(ch>=65&&ch<=90)) ? 
	//		((ch<=122&&ch>=97)) ? "küçük harf": "büyük harf" :"harf deðil";
	//	System.out.println(result);
		
	
	
	
	scan.close();
	
	
	
	
	
	
	
	
	}

}
