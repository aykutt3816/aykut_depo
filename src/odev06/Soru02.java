package odev06;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		// ve ba�lang�� de�erinden veya sonras�ndan   ba�lay�p biti� de�erinde veya �ncesinde  biten t�m �ift tamsay�lar� ekrana yazd�r�n
//1 den baslay�p 150 ye kadar olan t�m �ift say�lar�n� ekrana  yan yana aralar�na virg�lkoyarak yazd�r��n�z
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen  ba�lang�� ve biti� say�lar�n� veriniz");
		int strt=scan.nextInt();
		int end=scan.nextInt();
		for (int i=strt;i<end+1;i+=2) {
			System.out.print(i+",");
		}
		
	
	
		scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
