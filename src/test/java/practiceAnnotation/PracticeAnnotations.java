package practiceAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAnnotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after Suite");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}

	@Test
	private void test() {
		System.out.println("Test");
	}
}
