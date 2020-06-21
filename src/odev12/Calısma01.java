package odev12;

import java.util.Arrays;
import java.util.Scanner;

public class Calýsma01 {

	public static void main(String[] args) {
		// Kullanýcýya kaç elemanlý bir array gireceðini sorun.
		//Kullanýcýdan array’in elemanlarýný girmesini isteyin. 
		//a)Bu array’in icinde herhangi bir elemanýn var olup olmadigini kontrol edin.
		//b)Bu arayýn tum elemanlarýný tersten yazdýrýn.       Mesela; array {1, 2, 3, 4} ise ekrana {4, 3, 2, 1} seklinde yazdýrýn.

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
	Arrays.sort(arr);
System.out.println(Arrays.binarySearch(arr, 3));
	int arrters[]=new int[lenght];

for(int j=lenght-1;j>=0;j--) {
	
	
}
	

System.out.println(Arrays.toString(arrters));
	
	
	
	
	
	
	}

}
