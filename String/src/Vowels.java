
public class Vowels {
	public static void main(String[] args) {
		 String str ="ae";
		 str = str.toLowerCase();
		 boolean onlyVowels= true;
		 for(int i= 0 ; i< str.length();i++ ) {
			 char ch =str.charAt(i);
			 if("aeiot".indexOf(ch)==-1)
			 {
				  onlyVowels = false;
				 break;
			 }
		 }
		 if(onlyVowels) {
			 System.out.println("Only vowels");}
			 else {
				 System.out.println("include onther char");
			 }
			 
		 }
		 
	}


