package odev05;

import java.util.Scanner;

public class Db01 {

	public static void main(String[] args) {
		// Kullan�c�dan kredi kart� numaras�n� al�n
		//ve bu numaran�n ���nc�, d�rd�nc� ve sonuncu  rakamlar�n� ekrana yazd�r�n.1
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen kredikart� numaran�z� giriniz");
	String knum=scan.next();
	int lenght= knum.length();
	System.out.print(knum.charAt(2));
	System.out.print(knum.charAt(3));
	System.out.print(knum.charAt(lenght-1));
	
	
	
	
	scan.close();
	
	
	}

}
