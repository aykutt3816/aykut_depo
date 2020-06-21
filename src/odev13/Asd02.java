package odev13;

public class Asd02 {

	public static void main(String[] args) {
		// Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný ekrana yazdýran bir program yazýnýz. 
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
