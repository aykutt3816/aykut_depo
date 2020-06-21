package odev01;

import java.util.Scanner;

public class daire {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yarýcap giriniz");
		double yarýcap = scan.nextDouble();

		System.out.println(3.14159 * 2 * yarýcap );
		System.out.println(3.14159 * yarýcap * yarýcap);
		
		
		
		scan.close();
	}

}
