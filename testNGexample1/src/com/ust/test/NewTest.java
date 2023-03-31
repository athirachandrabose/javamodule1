package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(priority=1, description="this is executed first due to priority")
  public void f() {
	  System.out.println("from test method");
  }
  @Test(priority=2 ,description="if priority not given this will be executed first")
	public void a() {
	  System.out.println("from test  a method");
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
