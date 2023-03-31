package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTest {
  @Test
  public void f() {
	  System.out.println("from test method");
  }
  @BeforeTest
  public void beforeTest() {
  System.out.println("from before test method");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("from after test method");
  }

}
