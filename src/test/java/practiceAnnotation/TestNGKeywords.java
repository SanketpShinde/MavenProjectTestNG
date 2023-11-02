package practiceAnnotation;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGKeywords {
  @Test (priority = 1)
  public void abc() {
  System.out.println("ABC");
  }
  
  @Test(priority = 1)
  public void xyz() {
	  System.out.println("XYZ");
  }
  
  @Test(priority = 2)
  public void mno() {
	  System.out.println("MNO");
  }
  
  @Test
  public void pqr() {
  System.out.println("PQR");
  }
  
  @Test
  public void def() {
  System.out.println("DEF");
  }
}
