package odev03;

import java.util.Scanner;

public class Cb1 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin,
		//tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek� yazd�r�n
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir tamsayi giriniz");
	int num=scan.nextInt();
	
	String result= num %2 == 0 ? "�ift say�" : "tek say�";
	System.out.println(result);
	
	
	
	
	
	scan.close();
	
	
	}

}
