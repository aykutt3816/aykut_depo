package odev13;

public class Asd02 {

	public static void main(String[] args) {
		// A�a��daki multi dimensional array�in tum elemanlar�n�n �arp�m�n� ekrana yazd�ran bir program yaz�n�z. 
		//{ {1,2,3}, {4,5,6} } 
		int arrmulti[][]= {{1,2,3},{4,5,6}};
		int product=1;
		for(int i=0;i<arrmulti.length;i++) {
			for(int j=0;j<arrmulti[i].length;j++){
				product=product*arrmulti[i][j];
				
				
			}
		}
		System.out.println(product);
		
	}

}
