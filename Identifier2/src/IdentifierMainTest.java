import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IdentifierMainTest {
	
	static private ByteArrayOutputStream baOut;
	static private PrintStream psOut;

	
	@BeforeClass
	static void beforeClassInit() {
		baOut= new ByteArrayOutputStream();
		psOut= new PrintStream(baOut);
		System.out.println(psOut);
	}
	
	@AfterClass
	static void afterClassFinalize() {
		psOut.close();
	}
	
	@Before
	public void setup() {
		baOut.reset();
	}
	
	@Test
	public void testeValido01() {
		IdentifierMain.main(new String [] {"a1"});
		String output = baOut.toString();
		
		assertEquals("Valido", output);
		
	}
	
	@Test
	public void testeValido02() {
		IdentifierMain.main(new String [] {""});
		String output = baOut.toString();
		
		assertEquals("Valido", output);
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
