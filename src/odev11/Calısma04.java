package odev11;

import java.util.Arrays;
import java.util.Scanner;

public class Calýsma04 {

	public static void main(String[] args) {
		// Kullanýcýya kaç elemanlý bir array gireceðini sorun. 
		//Kullanýcýdan array’in elemanlarýný girmesini isteyin.
		//a)Bu array’in tum elemanlarýný ekrana yazdýrýn.
		//b)Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn. 
		//Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.

		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen kaç elemanlý bir Array gireceðimizi söyleyiniz");
		int lenght=scan.nextInt();
		int arr[]=new int[lenght];
		System.out.println("lütfen array elemanlarýný giriniz");
		
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
