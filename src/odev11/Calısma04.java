package odev11;

import java.util.Arrays;
import java.util.Scanner;

public class Cal�sma04 {

	public static void main(String[] args) {
		// Kullan�c�ya ka� elemanl� bir array girece�ini sorun. 
		//Kullan�c�dan array�in elemanlar�n� girmesini isteyin.
		//a)Bu array�in tum elemanlar�n� ekrana yazd�r�n.
		//b)Bu aray�n son eleman�n� ilk eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n. 
		//Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazd�r�n.

		Scanner scan =new Scanner(System.in);
		System.out.println("l�tfen ka� elemanl� bir Array girece�imizi s�yleyiniz");
		int lenght=scan.nextInt();
		int arr[]=new int[lenght];
		System.out.println("l�tfen array elemanlar�n� giriniz");
		
		for(int i=0;i<lenght;i++) {
			arr[i]=scan.nextInt();
			System.out.println(arr[i]+",");
		}
		System.out.println(Arrays.toString(arr));
        int arrs[]=new int[lenght];
		for(int i=1;i<lenght;i++) {
			arrs[i-1]=arr[i];
		}
		arrs[lenght-1]=arr[0];
		System.out.println(Arrays.toString(arrs));
		
		
		
		
		
		
	}

}
