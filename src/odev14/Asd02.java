package odev14;

import java.util.ArrayList;
import java.util.List;

public class Asd02 {

	public static void main(String[] args) {
		// Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin toplam�n� For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazd�r�n�z

List<Integer> list =new ArrayList<>();
	
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(5);
	int sum=0;
	for(int w:list) {
		sum=sum+w*w;
	}
	System.out.println(sum);
	
	
	
	
	}

}
