import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s= "debu";
		String s1="ubed";
		 s.toLowerCase();
		 s1.toLowerCase();
		 System.out.println(s);
		 
		 char[] arr1 = s.toCharArray();
		 char[] arr2 = s1.toCharArray();
		 
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		 System.out.println(arr1);
	System.out.println(arr2);
		 if (Arrays.equals(arr1,arr2)) {
			 System.out.println("Anagram");}
			 else {
				 
				 System.out.println("array is not Anagram");
		 }
	
	}
}
