package odev03;

import java.util.Scanner;

public class Cb8 {

	public static void main(String[] args) {
		
		  //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen bir say� giriniz");
	int num=scan.nextInt();
	String result=num>=0?num<10?"rakam":"say�":"negatifsay�";
	System.out.println(result);
	
	
	
	
	
	
	
	
	scan.close();
	
	
	
	
	}

}
