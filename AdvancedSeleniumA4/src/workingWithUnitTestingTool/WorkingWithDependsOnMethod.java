package workingWithUnitTestingTool;

import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {

	@Test
	public void register()
	{
		System.out.println("register");
	}

	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("login");
	}

	@Test(dependsOnMethods = "login")
	public void search()
	{
		System.out.println("search");
	}

	@Test(dependsOnMethods = "search")
	public void cart()
	{
		System.out.println("cart");
	}

	@Test(dependsOnMethods = "cart")
	public void payment()
	{
		System.out.println("payment");
	}


}
