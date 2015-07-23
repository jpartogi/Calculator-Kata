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
	
	@Test
	public void acceptsThree(){
		Calculator calc = new Calculator();
		
		int result = calc.add("2,3,4");
		
		assertThat(result, equalTo( 9 ));
	}

	@Test(expected=IllegalArgumentException.class)
	public void fourThrowsException(){
		Calculator calc = new Calculator();
		
		int result = calc.add("1,2,3,4");
	}
	
	@Test
	public void ignoresNewLines(){
		Calculator calc = new Calculator();
		
		int result = calc.add("2,\n3,4\n");
		
		assertThat(result, equalTo( 9 ));
		
		result = calc.add("1\n,3,\n4");
		
		assertThat(result, equalTo( 8 ));
	}
	
	@Test
	public void acceptsOtherDelimiters(){
		Calculator calc = new Calculator();
		
		int result = calc.add("1;2,%3");
		
		assertThat(result, equalTo(6));
		
		result = calc.add("3:4,.5");
		
		assertThat(result, equalTo(12));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void negativesNotAllowed(){
		Calculator calc = new Calculator();
		
		int result = calc.add("-1%:-2;,-3");
	}
}
