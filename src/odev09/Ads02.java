package odev09;

import java.util.Scanner;

public class Ads02 {

	public static void main(String[] args) {
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten 4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z

	Scanner scan=new Scanner(System.in);
	System.out.println("l�tfen ba�langi� de�erini giriniz");
	int strt=scan.nextInt();
	 System.out.println("l�tfen biti� de�erini giriniz");
	int	 end=scan.nextInt();
    
   
	int i=strt;
	 do {
		 
		  if(i%4==0&&i%6==0) {
			 System.out.print(i+",");
			 }
		  i++;
		  }while(i<=end);  

	 
	scan.close();
	
	
	
	
	
	
	
	
	
	}

}
