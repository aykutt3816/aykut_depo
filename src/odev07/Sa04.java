package odev07;

import java.util.Scanner;

public class Sa04 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  değerlerini alın 
		//ve başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın
	Scanner scan=new Scanner(System.in);
		System.out.println("lütfen başlangıç ve bitiş sayılarını giriniz");
		
		        int strt=scan.nextInt();
				int end=scan.nextInt();
				
				int sum=0;
	if(strt>end) {
		System.out.println("lütfen başlangiç bitişten küçükolsun");
	}else {
		for(int i=strt;i<end+1;i++) {
		sum=sum+i;
			
		}System.out.println(sum);
	}


	
	
	
	
		
	}

}
