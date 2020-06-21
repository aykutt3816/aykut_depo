package odev03;

import java.util.Scanner;

public class Cb1 {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin,
		//tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek” yazdýrýn
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen bir tamsayi giriniz");
	int num=scan.nextInt();
	
	String result= num %2 == 0 ? "çift sayý" : "tek sayý";
	System.out.println(result);
	
	
	
	
	
	scan.close();
	
	
	}

}
