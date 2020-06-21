package odev10;

import java.util.Scanner;

public class Asde02 {

	public static void main(String[] args) {
		//Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”,
		//birinci sayý büyük ise ekrana “Birinci sayý büyük”,
		//ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen 1. sayýyý giriniz");
int num1=scan.nextInt();
System.out.println("lütfen 2. sayýyý giriniz");
int num2=scan.nextInt();
sayý(num1,num2);
scan.close();
}
	public static void sayý(int num1,int num2) {
		if(num1==num2) {
			System.out.println("eþit");
		}else if (num1>num2){
			System.out.println("1. sayý büyük");
		}else {
			System.out.println("2. sayý büyük");
		}
	}






}