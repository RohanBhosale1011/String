
public class Palindrome {
public static void main(String[] args) {
	String str="sas";
	String rev="";
	for ( int i = str.length()-1;i>=0;i--)
	{
		
		rev+=str.charAt(i);}
		if (str.equals(rev)) {
			System.out.println("the string is parendrome");}
			else
			{
				System.out.println(rev);
				System.out.println("the String is not parendrome");
			}
		}
		
	}



