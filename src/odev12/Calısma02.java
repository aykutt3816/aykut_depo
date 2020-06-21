package odev12;

import java.util.Arrays;

public class Calýsma02 {

	public static void main(String[] args) {
		int[] x1= {0,1,2,3};
		int[] x2= {1,2,2,3};
		int i1=0;
		int i2=0;
		int caunt=0;
		while (i1<x1.length&&i2<x2.length) {
			if(x1[i1]==x2[i2]) {
				caunt++;
				i2++;
			}else if(x1[i1]<x2[i2]) {
				i1++;
			}else {
				//x1[i1]>x2[i2]
				i2++;
			}
			
		}
		
		System.out.println(caunt);//4
		int[] x= {0,1,2,3};
		int temp=0;
		int  i=0;
		int j=x.length-1;
		while (i<j) {
			temp=x[i];
			x[i]=x[j];
			x[j]=2*temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(x));//[3, 2, 2, 0]
		
		int[] y= {2,1,4,5,7};
		int limit=3;
		int k=0;
		int sum =0;
	while((sum<limit)&&(k<y.length)) {
		k++;
		sum=sum+y[k];
	}
		
		System.out.println(k);//2
		
		
		
		
		
		
		
		
		
		
	}

}
