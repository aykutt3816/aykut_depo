package odev06;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n
	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen ba�lang� ve biti� say�lar�n� giriniz");
	int strt=scan.nextInt();
	int end=scan.nextInt();
	int sum=0;
	for(int i=strt;i<end+1;i++){
		sum=sum+i;
	}
	System.out.println(sum);
	
	scan.close();
	
	
	
	}

}
