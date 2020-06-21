package odev14;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise33 { 
 public static void main(String[] args) {
	/* Anagram, bir kelimenin harflerinden baþka bir kelime oluþturmaya denir.

	 Kullanýcýdan alýnacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazýnýz.

	 Test Data: 
	 isAnagram("listen", "silent") ==> true

	 isAnagram("earth", "heart") ==> true

	 isAnagram("star", "rats") ==> true

	 isAnagram("hi", "bye") ==> false

	 isAnagram("java", "cava") ==> false */
       Scanner scan=new Scanner(System.in);
 String str1=scan.next();
 String str2=scan.next();
String arr1[]= str1.split("");
Arrays.sort(arr1);
System.out.println(Arrays.toString(arr1));
String arr2[]= str2.split("");
Arrays.sort(arr2);
System.out.println(Arrays.toString(arr2));
if(arr1==arr2) {
	System.out.println("true");
}else {
	System.out.println("false");
}
 }
}

	    
    
 
