package odev11;

public class Test03 {

	public static void main(String[] args) {
		// Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol  eden bir program yaz�n�z.
		//Ayn� eleman varsa �Ayn� eleman var� 
		//yoksa  �Ayn� eleman yok� yazd�r�n�z
int arr[]= {1,2,3,4,3};
int caunt=0;
for(int i=0;i<5;i++) {
for	(int j=i+1;j<5;j++) {
	if(arr[i]==arr[j]) {
		caunt++;
		break;
	}
	}
    }
	
if( caunt>0) {
	System.out.println("ayn� eleman var");
}else {
	System.out.println("ayn� eleman yok");
}
}
}
