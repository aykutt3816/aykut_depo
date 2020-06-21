package odev02;

import java.util.Scanner;

public class New01 {

	public static void main(String[] args) {
		// Kullanýcýdan bir character alýn
		//eðer character bir harf ise ekrana “Harf” yazdýrýn. 
		//Diðer durumlarda ekrana “Harf deðil” yazdýrýn
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir karakter giriniz");
	String harf=scan.next();
		
	
	
	if (  harf.equalsIgnoreCase("a")
		||harf.equalsIgnoreCase("b")	
		||harf.equalsIgnoreCase("c")	
		||harf.equalsIgnoreCase("ç")	
		||harf.equalsIgnoreCase("d")
		||harf.equalsIgnoreCase("e")	
		||harf.equalsIgnoreCase("f")	
		||harf.equalsIgnoreCase("g")	
		||harf.equalsIgnoreCase("ð")	
		||harf.equalsIgnoreCase("h")	
		||harf.equalsIgnoreCase("ý")	
		||harf.equalsIgnoreCase("i")	
		||harf.equalsIgnoreCase("j")	
		||harf.equalsIgnoreCase("k")	
		||harf.equalsIgnoreCase("l")	
		||harf.equalsIgnoreCase("m")	
		||harf.equalsIgnoreCase("n")	
		||harf.equalsIgnoreCase("o")	
		||harf.equalsIgnoreCase("ö")	
		||harf.equalsIgnoreCase("p")	
		||harf.equalsIgnoreCase("q")	
		||harf.equalsIgnoreCase("r")	
		||harf.equalsIgnoreCase("s")	
		||harf.equalsIgnoreCase("þ")	
		||harf.equalsIgnoreCase("t")	
		||harf.equalsIgnoreCase("u")	
		||harf.equalsIgnoreCase("ü")	
		||harf.equalsIgnoreCase("v")	
		||harf.equalsIgnoreCase("w")	
		||harf.equalsIgnoreCase("x")	
		||harf.equalsIgnoreCase("y")	
		||harf.equalsIgnoreCase("z")	
		) {
		System.out.println(harf + " = Harf");
		}
	else {
		System.out.println(harf + " Harf Deðil");
	}
	
	scan.close();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	