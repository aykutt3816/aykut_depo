package odev14;

public class Asd03 {

	public static void main(String[] args) {
		//�ki String array olu�turunuz ve bu array�lerdeki ortak elemanlar� For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		//Ortak eleman yoksa ekrana �Ortak eleman yok� yazd�r�n�z

		String arr1[] = {"kayseri", "ni�de", "adana","bursa"};
        String arr2[] = {"karaman", "yozgat","kayseri","bursa"
        		 };
	
	int count=0;
	for(String w:arr1) {
		for(String k:arr2) {
			if(w==k) {
				System.out.println(w);
				count++;
			}
		}
		
	
	}if(count==0) {
		System.out.println("ortak eleman yoktur");
	}
	
	}

	}
