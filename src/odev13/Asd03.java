package odev13;

public class Asd03 {

	public static void main(String[] args) {
		// Aþaðýdaki multi dimensional array’lerin iç array’lerinde ayný index’e
		//sahip elemanlarýn toplamýný  ekrana yazdýran bir program yazýnýz
		//arr1[][] = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} } 
		
	
		
		
		
		   int arr1[][] = { {1,2}, {3,4,5}, {6} };
	       int arr2[][] = { {7,8,9}, {10,11}, {12} };
	       
	       int sum=0;
	       for(int i=0;i<arr1.length;i++){
	    	   for(int j=0;j<arr1[i].length;j++){
	    		   
	    		   for(int k=0;k<arr2.length;k++){
	    	    	   for(int m=0;m<arr2[k].length;m++){
	    	    		   
	    	    		   if(k==i&& j==m){
	    	    			   sum=sum+arr1[i][j]+arr2[k][m];
	    	    		   }
	    	    		   
	    	    		   
	    	    	   }
	    	    	   
	    	       }
	    	   }
	    	   
	       }System.out.println("Ic array'lerdeki ayni index'e sahip elemanlarin toplami: "+sum);

		
		
		
	}

}
