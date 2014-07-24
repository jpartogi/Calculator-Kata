package leanagile;

import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CalculatorTest {

	@Test
	public void emptyStringReturns0() 
	{
		Calculator calc = new Calculator();
		
		int result = calc.add("");
		
		assertThat(result, equalTo(0) );
	}

	@Test
	public void oneReturnsNumber() 
	{
		Calculator calc = new Calculator();
		
		int result = calc.add("1");
		
		assertThat(result, equalTo(1) );
	}

}
