package odev07;

import java.util.Scanner;

public class Sa03 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		// ve ba�lang�� de�erinden veya sonras�ndan   ba�lay�p biti� de�erinde veya �ncesinde biten 
		//t�m �ift tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen ba�lang�� ve biti� say�lar�n� giriniz");
	
	        int strt=scan.nextInt();
			int end=scan.nextInt();
			int i=strt;
		
	while(i<end) {
		if(i%2==0) {
			System.out.print(i+",");
		}
		
		i++;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
