package odev06;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden veya sonras�ndan   ba�lay�p biti� de�erinde veya �ncesinde  biten
		//t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n.

	
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen  ba�lang�� ve biti� say�lar�n� veriniz");
		int strt=scan.nextInt();
		int end=scan.nextInt();
		for (int i=strt;i<end+1;i+=3) {
			System.out.print(i+",");
		}
		
	
	
		scan.close();
	
	
	
	
	
	
	
	
	}

}
