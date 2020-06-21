package odev02;

import java.util.Scanner;

public class Ab02 {

	public static void main(String[] args) {
		// Kullanýcýdan notunu alýn
		//ve aþaðýdaki kurallara göre ekrana A, B, C veya D yazdýrýn.
		//1. 50 den az - D     
		//2. 50(dahil) ile 60 arasý - C      
		//3. 60(dahil) ile 80 arasý - B.    
		//4. 80(dahil) ustu- A 

		Scanner scan=new Scanner(System.in);
	System.out.println("lütfen aldiginz notu giriniz");
	int not=scan.nextInt();
	if (not<50) {
		System.out.println("d");
	}else if(not<60) {
		System.out.println("c");
	}else if(not<80) {
		System.out.println("b");
	}else {
		System.out.println("a");
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
