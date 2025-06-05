package Basics;

public class Butterfly {
	
	public static void pattern(String s)
	{
		if(s.length()%2!=0)
		{
			for(int i=0;i<s.length();i++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(i==j || i==s.length()/2)
					{
						System.out.print(s.charAt(j)+" ");
					}
					else if(i+j==s.length()-1 || j==s.length()/2)
					{
						System.out.print(s.charAt(i)+" ");
					}
					else
					{
						System.out.print(" ");
					}
						
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args)
	{
		String s="water";
		pattern(s);
	}

}
