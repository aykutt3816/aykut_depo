package aykut;

import java.util.Scanner;

public class cal�sma2 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
	System.out.println("lutfen ad�n�z�  soyad�n�z� giriniz");
		String tamisim =scan.nextLine();
		
		System.out.println("yas�n�z� giriniz");
		int yas =scan.nextInt();
		System.out.println("t�rkiyede yasiyorum. tru/false");
		boolean blTr =scan.nextBoolean();
		
		
		
	
	
		System.out.println(tamisim);
		System.out.println(yas);
		System.out.println(blTr);
		
		
	}

}
