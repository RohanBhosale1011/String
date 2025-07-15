import java.util.Scanner;

public class Filterfruit {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	String[] fruits= new String[5];
	System.out.println(" enter the  5 fruits :");
	for ( int i =0;i<=4;i++)
		
	{
		fruits[i]=s.nextLine();
		fruits[i]=fruits[i].toLowerCase();
		}
		System.out.println("Fruits contain n or p");
for (int i=0; i <= fruits.length;i++) {
	String fruit= fruits[i];
	
	{ if(fruit.contains("n")||fruit.contains("p")) {
		System.out.println(fruit);
	}
		
	}}}}

