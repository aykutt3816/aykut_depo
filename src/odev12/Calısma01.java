package odev12;

import java.util.Arrays;
import java.util.Scanner;

public class Cal�sma01 {

	public static void main(String[] args) {
		// Kullan�c�ya ka� elemanl� bir array girece�ini sorun.
		//Kullan�c�dan array�in elemanlar�n� girmesini isteyin. 
		//a)Bu array�in icinde herhangi bir eleman�n var olup olmadigini kontrol edin.
		//b)Bu aray�n tum elemanlar�n� tersten yazd�r�n.       Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazd�r�n.

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
	Arrays.sort(arr);
System.out.println(Arrays.binarySearch(arr, 3));
	int arrters[]=new int[lenght];

for(int j=lenght-1;j>=0;j--) {
	
	
}
	

System.out.println(Arrays.toString(arrters));
	
	
	
	
	
	
	}

}
