
public class Longestword {

	public static void main(String args[])
	{
		String s=" I am Kaustubh.KKdfjisijd dfdufhsud dsifjidsjdfdsfsdfddfddfdffdfd";
		
		
		System.out.println("dsifjidsjdfdsfsdfddfddfdffdfd".length());
		int max=0;
		String[] word =s.split(" ");
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()>max)
			{
				max=word[i].length();
			}
		}
		System.out.println(max);
		
		
	}
}
