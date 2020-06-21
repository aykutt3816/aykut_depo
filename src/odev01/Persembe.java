package odev01;

import java.util.Scanner;

public class Persembe {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamaklý bir sayi girin");
		int s = scan.nextInt();
		int sonRakam = s%10;
		int v = s/10;
		int onlar =v%10;
		int z = s/100;
		int yuzler = z%10;
		int ilkRakam = s/1000;
		
		System.out.println(ilkRakam+sonRakam+onlar+yuzler);
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
