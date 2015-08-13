package scrum;

import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import scrum.Calculator;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

@RunWith(JUnitParamsRunner.class)
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
		
		int result = calc.add("2");
		
		assertThat(result, equalTo( 2 ));
	}
	

}
