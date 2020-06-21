package odev10;

import java.util.Scanner;

public class Asde03mülakatcýkabilr {

	public static void main(String[] args) {
		/*
		 * ullanýcýya sayý girmesini söyleyin.
		 *  Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný
		 *   ekrana  yazdýran bir program yazýn*/
		Scanner sc=new Scanner (System.in);
		System.out.println("lutfen birsayi giriniz");
		
		int num=0;
		num=sc.nextInt();
		int rakam=0;
		int toplam=0;
		islem(num,rakam,toplam);
sc.close();
	}
	public static void islem(int num ,int rakam ,int toplam) {
		while(num!=0) {
			toplam=(num%10)+toplam;
			num/=10;
			rakam++;
			
		}System.out.println("Rakamlar toplami= "+toplam);
		
		
	}	
	}


