package odev02;

import java.util.Scanner;

public class Cevap01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
		//�b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir harf giriniz");
	String harf=scan.next();
	if(harf.equals("a")||harf.equals("e")||harf.equals("i")|harf.equals("o")||harf.equals("u")) {
		System.out.println("sesli harf");
	}if(harf.equals("b")||harf.equals("c")||harf.equals("d")||harf.equals("f")) {
		System.out.println("sessiz harf");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	
	
	}

}
