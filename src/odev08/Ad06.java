package odev08;

public class Ad06 {

	public static void main(String[] args) {
		// 8 den 180 e kadar 5 in kati olan tum tamsay�lar� ekrana yazd�r�n�z
		//hem for loop hem de while loop kullanarak ��z�n�z
	
	System.out.println("forloop ��z�m�");
	
	for(int num=8;num<180;num++) {
		if(num%5==0) {
			System.out.print(num);
		}
		
	}
	System.out.println();
	System.out.println("while ile ��z�m");
	
	int num=8;
	
	while(num<181) {
		if(num%5==0) {
			System.out.print(num);
		}
			
			num++;
		
	}
	
	
	
	
	
	}

}
