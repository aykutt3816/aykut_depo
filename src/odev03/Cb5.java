package odev03;

import java.util.Scanner;

public class Cb5 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� girmesini isteyin,
		//o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        //3 basamakl� degilse �ift olup olmadigini kontrol edin. 
		//�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		//�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�

		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir tamsayi giriniz");
	int num=scan.nextInt();
	
	String result=num>99&&num<1000?"�� basamakl� say�":num%2==0?
			"�� basamakl�olmayan �ift say�":"�� basamakl�olmayan tek say�";
	System.out.println(result);
	
	scan.close();
	
	
	}

}
