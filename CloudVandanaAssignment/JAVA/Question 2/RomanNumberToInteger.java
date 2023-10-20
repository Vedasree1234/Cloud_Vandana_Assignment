package pack1;
import java.util.Scanner;
public class RomanNumberToInteger {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("enter a roman numeral: ");
	String roman=scan.next();

	int preValue=0;
	int result=0;
	for(int i=roman.length()-1;i>=0;i--)
	{	
		int value=0;
	char ch=roman.charAt(i);
	switch(ch)
	{
	case 'I':
		value=1;
		break;
	case 'V':
		value=5;
		break;
	case 'X':
		value=10;
		break;
	case 'L':
		value=50;
		break;
	case 'C':
		value=100;
		break;
	case 'D':
		value=500;
		break;
	case 'M':
		value=1000;
		break;
	}
	if(value<preValue)
	{
	   result-=value;
	}
	else
	{
		result+=value;
	}
	preValue=value;
	}
	System.out.println(" the integer equivalent of "+roman+" is "+result);
}
}
