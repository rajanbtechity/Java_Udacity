import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	StringBuilder sb= new StringBuilder();
	String str="Hello World!";
	String str1="Udacity Course";
	String vowels="aeiou";
	
	for(char c:str.toCharArray())
	{
		if(vowels.contains(String.valueOf(c).toLowerCase()))
		{
			sb.append(c);
		}
	}
	
	System.out.println("vowel substring:"+sb.toString());
}
}
