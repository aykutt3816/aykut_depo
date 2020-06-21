package odev05;

import java.util.Scanner;

public class Db01 {

	public static void main(String[] args) {
		// Kullanýcýdan kredi kartý numarasýný alýn
		//ve bu numaranýn üçüncü, dördüncü ve sonuncu  rakamlarýný ekrana yazdýrýn.1
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen kredikartý numaranýzý giriniz");
	String knum=scan.next();
	int lenght= knum.length();
	System.out.print(knum.charAt(2));
	System.out.print(knum.charAt(3));
	System.out.print(knum.charAt(lenght-1));
	
	
	
	
	scan.close();
	
	
	}

}
