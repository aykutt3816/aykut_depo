package odev10;

import java.util.Scanner;

public class Asde04 {

	public static void main(String[] args) {
		// Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin.
		//Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen geometrik bir�ekil se�iniz");
	String sekil=scan.next().toUpperCase();
	System.out.println("l�tfen kenar uzunlu�u giriniz");
	int kenar=scan.nextInt();
	System.out.println("l�tfen yukseklik giriniz");
	int yukseklik=scan.nextInt();
	alanVeCevrehesaplama(sekil, kenar,yukseklik);
	scan.close();
	}
public static void alanVeCevrehesaplama(String sekil,int kenar ,int yukseklik) {
	
	switch(sekil) {
		case "PARELELKENAR":
		    System.out.println("PARELELKENAR �evre="+(kenar+yukseklik)*2);
		    System.out.println("PARELELKENAR alan="+(kenar*yukseklik));
		break;
		case "D�KD�RTGEN":
			System.out.println(" D�KD�RTGEN �evre="+(kenar+yukseklik)*2);
			System.out.println("D�KD�RTGEN alan="+(kenar*yukseklik));
			break;
		case "��GEN":
			System.out.println("��GEN �evre="+(kenar+kenar+kenar));
			System.out.println("��GEN alan="+(kenar*yukseklik)/2);
			break;
		default:
			System.out.println("PARELELKENAR D�LD�RTGEN ��GEN HAR�C�  secmeyiniz");
}}
	
	
	
	
	
	
	
	
	
	
}
