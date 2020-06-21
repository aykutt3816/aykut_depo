package odev01;

import java.util.Scanner;

public class Persembe3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	System.out.println("yer degistirme icin iki sayý giriniz");
		
		int sayi1 =scan.nextInt();
		int sayi2 =scan.nextInt()	;
				
		
		
		
		
		System.out.println("yer degistirmeden once");
		System.out.println(sayi1);
		System.out.println(sayi2);
	int gecici=0;
		
		gecici=sayi1;
		sayi1=sayi2;
		sayi2=gecici;
		System.out.println("yer degistikten sonra");
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println(gecici);
		
		// 2.yol
		System.out.println("tkrr iki sayigiriniz");
		int sayi3=scan.nextInt();
		int sayi4=scan.nextInt();
	System.out.println(sayi3);
	System.out.println(sayi4);
		sayi3=sayi3 + sayi4;
		sayi4=sayi3-sayi4;
		sayi3=sayi3-sayi4;
		System.out.println("yerdegistiktensonra");
		System.out.println(sayi3);
		System.out.println(sayi4);
		
		
		
		
		
		
		scan.close();
		
		
		

	}

}
