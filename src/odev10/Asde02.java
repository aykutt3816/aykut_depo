package odev10;

import java.util.Scanner;

public class Asde02 {

	public static void main(String[] args) {
		//Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�,
		//birinci say� b�y�k ise ekrana �Birinci say� b�y�k�,
		//ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen 1. say�y� giriniz");
int num1=scan.nextInt();
System.out.println("l�tfen 2. say�y� giriniz");
int num2=scan.nextInt();
say�(num1,num2);
scan.close();
}
	public static void say�(int num1,int num2) {
		if(num1==num2) {
			System.out.println("e�it");
		}else if (num1>num2){
			System.out.println("1. say� b�y�k");
		}else {
			System.out.println("2. say� b�y�k");
		}
	}






}