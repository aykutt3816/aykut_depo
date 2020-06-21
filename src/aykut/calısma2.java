package aykut;

import java.util.Scanner;

public class calýsma2 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
	System.out.println("lutfen adýnýzý  soyadýnýzý giriniz");
		String tamisim =scan.nextLine();
		
		System.out.println("yasýnýzý giriniz");
		int yas =scan.nextInt();
		System.out.println("türkiyede yasiyorum. tru/false");
		boolean blTr =scan.nextBoolean();
		
		
		
	
	
		System.out.println(tamisim);
		System.out.println(yas);
		System.out.println(blTr);
		
		
	}

}
