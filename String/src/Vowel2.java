import java.util.Arrays;

public class Vowel2 {
public static void main(String[] args) {
	String input = "iouae";
	String vowel= "aeiou";
	char[] arr1=input.toCharArray();
	char[] arr2=vowel.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	System.out.println(arr1);
	System.out.println(arr2);
	 if (Arrays.equals(arr1, arr2)) {
		 System.out.println(" only vowel");
		 
	 }
	 else {
		 System.out.println(" no vowels");
	 }
	
 }
}
