package odev13;

public class Asd01 {

	public static void main(String[] args) {
		//A�a��daki multi dimensional array�in i� array�lerindeki son elemanlar�n �arp�m�n� ekrana yazd�ran 
		//bir program yaz�n�z { {1,2,3}, {4,5}, {6} } 
		int arrmulti[][]=  { {1,2,3}, {4,5}, {6} } ;
	    int	arrilk= arrmulti[0][arrmulti[0].length-1];
		int	arrorta= arrmulti[1][arrmulti[1].length-1];
		int	arrson= arrmulti[02][arrmulti[2].length-1];
		int sonelmnlrcarp�m�=arrilk*arrorta*arrson;
		System.out.println(sonelmnlrcarp�m�);//90
		
	}

}
