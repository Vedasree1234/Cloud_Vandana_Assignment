package pack1;
import java.util.Scanner;
public class PangramOrNot {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a sentence: ");
	String s=scan.nextLine();
	boolean b[]=new boolean[26];
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z')
		{
			b[ch-'a'] = true;
		}
	}
	s=s.toLowerCase();
	boolean panagram=true;
	for(boolean letterPresent:b)
	{
		if(!letterPresent)
		{
			panagram=false;
			break;
		}
	}
	if(panagram)
	{
		System.out.println("pangram");
	}
	else
	{
		System.out.println("not pangram");
	}
	/*the quick brown fox jumps over the lazy dog*/
}
}
