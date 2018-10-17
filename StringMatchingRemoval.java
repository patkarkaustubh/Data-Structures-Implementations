import java.util.HashMap;
import java.util.Map;

public class StringMatchingRemoval {

	
	public static void main(String args[])
	{
		String a="abcderdssdfdsf";
		String b = "abr";
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				
				if(a.charAt(i)==b.charAt(j))
				{
					
					String s = Character.toString(a.charAt(i));
					a=a.replace(s, "");
					
				}
		}
			
		}
		System.out.print(a);
		
	}
		
	
}
