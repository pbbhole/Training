package CGIJenkinsBatch.CalculatorAPI;

import org.testng.annotations.*;

import org.testng.Assert;

public class testCAlculatorApi {
	CalculatorAPI C;
	int Res;
	@BeforeClass
	public void StartTest() {
		C = new CalculatorAPI();
	}
	@Test
	public void TestADD() {
		Res = C.Addition(20, 30);
		Assert.assertEquals(Res, 50,"Addition code is not working with");
	}
	@Test
	public void TestSUB() {
		Res = C.Substraction(30, 20);
		Assert.assertEquals(Res, 10,"Subtraction code is not working with");
	}
}
