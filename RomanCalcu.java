
public class RomanCalcu 
{
	String a, b;
	int x, y;
	
	String ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	String thousands[] = {"", "M", "MM", "MMM"};
	
	public RomanCalcu()
	{
		a = "";
		b = "";
	}
	
	public void enter(String str)
	{
		if(a.isEmpty())
		{
			a = str;
			x = parse(a);
		}
		else
		{
			b = str;
			y = parse(b);
		}
	}
	
	public boolean isLeftOne(char c)
	{
		if(c == 'I')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLeftTen(char c)
	{
		if(c == 'X')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isLeftOneHundred(char c)
	{
		if(c == 'C')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int parse(String str)
	{
		int ans = 0;
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			if(str.charAt(i) == 'M')
			{
				ans += 1000;
				
				try
				{
					if(isLeftOneHundred(str.charAt(i - 1)))
					{
							ans -= 100;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'D')
			{
				ans += 500;
				
				try
				{
					if(isLeftOneHundred(str.charAt(i - 1)))
					{
							ans -= 100;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'C')
			{
				ans += 100;
				
				try
				{
					if(isLeftTen(str.charAt(i - 1)))
					{
							ans -= 10;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'L')
			{
				ans += 50;
				
				try
				{
					if(isLeftTen(str.charAt(i - 1)))
					{
							ans -= 10;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'X')
			{
				ans += 10;
				
				try
				{
					if(isLeftOne(str.charAt(i - 1)))
					{
							ans -= 1;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'V')
			{
				ans += 5;
				
				try
				{
					if(isLeftOne(str.charAt(i - 1)))
					{
							ans -= 1;
							i--;
					}
				}
				catch(Exception e)
				{
					break;
				}
			}
			else if(str.charAt(i) == 'I')
			{
				ans += 1;
			}
		}
		
		return ans;
	}
	
	public String add()
	{	
		String ans = "";
		
		int sum = x + y;
		int rem = 0;
		int ten = 0;
		int hundred = 0;
		int thousand = 0;
		
		if(sum >= 1000)
		{
			thousand = sum / 1000;
			
			ans += thousands[thousand];
			
			rem = sum % 1000;
			sum = rem;
		}
		if(sum >= 100)
		{
			hundred = sum / 100;
			
			ans += hundreds[hundred];
			
			rem = sum % 100;
			sum = rem;
		}
		if(sum >= 10)
		{
			ten = sum / 10;
			
			ans += tens[ten];
			
			rem = sum % 10;
			sum = rem;
		}
		
		ans += ones[sum];
		
		return ans;
	}
}
