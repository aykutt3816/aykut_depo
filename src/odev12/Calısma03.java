package odev12;

public class Cal�sma03 {

	public static void main(String[] args) {
		int arr[][]=new int[4][];
      arr[0]=new int[1];
      arr[1]=new int[2];
      arr[2]=new int[3];
      arr[3]=new int[4];
      int i,j,k=0;
      for( i=0;i<4;i++) {
    	  for(j=0;j<i;j++) {
    		  arr[i][j]=k;
    		  k++;
    	  }
      }
      for( i=0;i<4;i++) {
    	  for(j=0;j<i;j++) {
    		System.out.println(  arr[i][j]=k);//9,10,11   arr[i][j]==>3,4,5,
    		 k++;
	}
    	  System.out.println();
      }
	}

}
