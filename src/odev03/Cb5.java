package odev03;

import java.util.Scanner;

public class Cb5 {

	public static void main(String[] args) {
		// Kullanıcıdan bir tamsayı girmesini isteyin,
		//o tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        //3 basamaklı degilse çift olup olmadigini kontrol edin. 
		//Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
		//Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir tamsayi giriniz");
	int num=scan.nextInt();
	
	String result=num>99&&num<1000?"üç basamaklı sayı":num%2==0?
			"üç basamaklıolmayan çift sayı":"üç basamaklıolmayan tek sayı";
	System.out.println(result);
	
	scan.close();
	
	
	}

}
