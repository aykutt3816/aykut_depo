package odev14;

public class Asd03 {

	public static void main(String[] args) {
		//Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		//Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz

		String arr1[] = {"kayseri", "niðde", "adana","bursa"};
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
