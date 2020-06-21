package odev13;

public class Asd01 {

	public static void main(String[] args) {
		//Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn çarpýmýný ekrana yazdýran 
		//bir program yazýnýz { {1,2,3}, {4,5}, {6} } 
		int arrmulti[][]=  { {1,2,3}, {4,5}, {6} } ;
	    int	arrilk= arrmulti[0][arrmulti[0].length-1];
		int	arrorta= arrmulti[1][arrmulti[1].length-1];
		int	arrson= arrmulti[02][arrmulti[2].length-1];
		int sonelmnlrcarpýmý=arrilk*arrorta*arrson;
		System.out.println(sonelmnlrcarpýmý);//90
		
	}

}
