package odev01;

import java.util.Scanner;

public class Kenar {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ucgenin kenarlarini girin");
		byte akenar =scan.nextByte();
				byte bkenar =scan.nextByte();
				byte ckenar =scan.nextByte();
		
		System.out.println(akenar + bkenar + ckenar);
		
		
		
		scan.close();
		

	}

}
