package odev01;

import java.util.Scanner;

public class Dikdortgen {

	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen en ve boy giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(en + boy + en + boy);
		System.out.println(en * boy);
		
		
		scan.close();	

	}

}
