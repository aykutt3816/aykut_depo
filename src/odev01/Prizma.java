package odev01;

import java.util.Scanner;

public class Prizma {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen en boy ve yukseklik girin");
		
		int en =scan.nextInt();
		int boy = scan.nextInt();
		int yukseklik = scan.nextInt();
		System.out.println(en * boy * yukseklik);
		
		
		
		scan.close();
		

	}

}
