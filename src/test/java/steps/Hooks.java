package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void preScenario(Scenario sc)
	{
		System.out.println("Testcasename"+sc.getName());
		System.out.println("Testcase line number"+sc.getId());
	}
	
	@After
	public void postScenario(Scenario sc)
	{
		System.out.println("Testcase status"+sc.getStatus());
	}

}
