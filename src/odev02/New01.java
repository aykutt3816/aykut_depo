package odev02;

import java.util.Scanner;

public class New01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir character al�n
		//e�er character bir harf ise ekrana �Harf� yazd�r�n. 
		//Di�er durumlarda ekrana �Harf de�il� yazd�r�n
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen bir karakter giriniz");
	String harf=scan.next();
		
	
	
	if (  harf.equalsIgnoreCase("a")
		||harf.equalsIgnoreCase("b")	
		||harf.equalsIgnoreCase("c")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("d")
		||harf.equalsIgnoreCase("e")	
		||harf.equalsIgnoreCase("f")	
		||harf.equalsIgnoreCase("g")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("h")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("i")	
		||harf.equalsIgnoreCase("j")	
		||harf.equalsIgnoreCase("k")	
		||harf.equalsIgnoreCase("l")	
		||harf.equalsIgnoreCase("m")	
		||harf.equalsIgnoreCase("n")	
		||harf.equalsIgnoreCase("o")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("p")	
		||harf.equalsIgnoreCase("q")	
		||harf.equalsIgnoreCase("r")	
		||harf.equalsIgnoreCase("s")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("t")	
		||harf.equalsIgnoreCase("u")	
		||harf.equalsIgnoreCase("�")	
		||harf.equalsIgnoreCase("v")	
		||harf.equalsIgnoreCase("w")	
		||harf.equalsIgnoreCase("x")	
		||harf.equalsIgnoreCase("y")	
		||harf.equalsIgnoreCase("z")	
		) {
		System.out.println(harf + " = Harf");
		}
	else {
		System.out.println(harf + " Harf De�il");
	}
	
	scan.close();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	