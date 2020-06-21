package odev08;

public class Ad06 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz
		//hem for loop hem de while loop kullanarak çözünüz
	
	System.out.println("forloop çözümü");
	
	for(int num=8;num<180;num++) {
		if(num%5==0) {
			System.out.print(num);
		}
		
	}
	System.out.println();
	System.out.println("while ile çözüm");
	
	int num=8;
	
	while(num<181) {
		if(num%5==0) {
			System.out.print(num);
		}
			
			num++;
		
	}
	
	
	
	
	
	}

}
