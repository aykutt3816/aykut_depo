package odev01;

import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yar�cap giriniz");
		double yar�cap = scan.nextDouble();

		System.out.println(3.14159 * 2 * yar�cap );
		System.out.println(3.14159 * yar�cap * yar�cap);
		
		
		
		scan.close();
	}

}
