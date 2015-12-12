import static org.junit.Assert.*;

import org.junit.Test;

public class RomanCalcuTest 
{

	@Test
	public void testRomanCalcuConstructor()
	{
		RomanCalcu calcu = new RomanCalcu();
	}
	
	@Test
	public void testOnePlusOneEqualsTwo()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("I");
		calcu.enter("I");
		assertEquals("II", calcu.add());
	}

	@Test
	public void testOnePlusTwoEqualsThree()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("I");
		calcu.enter("II");
		assertEquals("III", calcu.add());
	}
	
	@Test
	public void testTwoPlusTwoEqualsFour()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("II");
		calcu.enter("II");
		assertEquals("IV", calcu.add());
	}
	
	@Test
	public void testParseOne()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(1, calcu.parse("I"));
	}
	
	@Test
	public void testParseFive()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(5, calcu.parse("V"));
	}
	
	@Test
	public void testParseFour()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(4, calcu.parse("IV"));
	}
	
	@Test
	public void testFourPlusFourEqualsEight()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("IV");
		calcu.enter("IV");
		assertEquals("VIII", calcu.add());
	}
	
	@Test
	public void testFourPlusFiveEqualsNine()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("IV");
		calcu.enter("V");
		assertEquals("IX", calcu.add());
	}
	
	@Test
	public void testFivePlusFiveEqualsTen()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("V");
		calcu.enter("V");
		assertEquals("X", calcu.add());
	}
	
	@Test
	public void testTwentyPlusTwentyEqualsForty()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("XX");
		calcu.enter("XX");
		assertEquals("XL", calcu.add());
	}
	
	@Test
	public void testParseTen()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(10, calcu.parse("X"));
	}
	
	@Test
	public void testParseNine()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(9, calcu.parse("IX"));
	}
	
	@Test
	public void testFortyPlusFiftyEqualsNinety()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("XL");
		calcu.enter("L");
		assertEquals("XC", calcu.add());
	}
	
	@Test
	public void testParseFifty()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(50, calcu.parse("L"));
	}
	
	@Test
	public void testParseForty()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(40, calcu.parse("XL"));
	}
	
	@Test
	public void testFiftyPlusFiftyEqualsOneHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("L");
		calcu.enter("L");
		assertEquals("C", calcu.add());
	}
	
	@Test
	public void testOneHundredPlusOneHundredEqualsTwoHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("C");
		calcu.enter("C");
		assertEquals("CC", calcu.add());
	}
	
	@Test
	public void testParseOneHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(100, calcu.parse("C"));
	}
	
	@Test
	public void testParseNinety()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(90, calcu.parse("XC"));
	}
	
	@Test
	public void testFourHundredPlusFiveHundredEqualsNineHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("CD");
		calcu.enter("D");
		assertEquals("CM", calcu.add());
	}
	
	@Test
	public void parseFiveHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(500, calcu.parse("D"));
	}
	
	@Test
	public void parseFourHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(400, calcu.parse("CD"));
	}
	
	@Test
	public void parseOneThousand()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(1000, calcu.parse("M"));
	}
	
	@Test
	public void parseNineHundred()
	{
		RomanCalcu calcu = new RomanCalcu();
		assertEquals(900, calcu.parse("CM"));
	}
	
	@Test
	public void testFiveHundredPlusFiveHundredEqualsOneThousand()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("D");
		calcu.enter("D");
		assertEquals("M", calcu.add());
	}
	
	@Test
	public void testOneThousandPlusTwoThousandEqualsThreeThousand()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("M");
		calcu.enter("MM");
		assertEquals("MMM", calcu.add());
	}
	
	@Test
	public void testOneThousandFourHundredFiftyPlusFiveHundredSeventySix()
	{
		RomanCalcu calcu = new RomanCalcu();
		calcu.enter("MCDL");
		calcu.enter("DLXXVI");
		assertEquals("MMXXVI", calcu.add());
	}
}
