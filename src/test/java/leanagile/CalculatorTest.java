package leanagile;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

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
	//@Parameters({"1", "2", "3"})
	public void oneReturnsNumber() 
	{
		Calculator calc = new Calculator();
		
		int result = calc.add("1,3");
		
		assertThat(result, equalTo( 4 ));
	}

}
