package testing;

public class JunitTesting {
	
	public int Cube(int num)
	{
		return num*num*num;
		
		
	}
	public int Count(String word)
	{
		int count=0;
		for(int i=0; i<word.length();i++)
		{
			count++;
			if(word.charAt(i)==' ')
			{
			break;
			}
		}
		return count;	
			
	}
	public int CountA(String word)
	{
		int count=0;
		for(int i=0; i<word.length();i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='A')
			{
			 count++;	
			}
		}
		return count;
		}
	}
