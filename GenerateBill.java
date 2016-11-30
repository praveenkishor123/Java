package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Plan abstract class
abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}

// A concrete class that extends plan abstract class
class DomesticPlan extends Plan {

	public void getRate() {
		rate = 3.50;
	}
}

class CommercialPlan extends Plan {

	public void getRate() {
		rate = 7.50;
	}
}

class InstitutionalPlan extends Plan {

	public void getRate() {
		rate = 5.50;
	}
}

// A class to generate the objects of concrete classes based on the given
// information
class GetPlanFactory {

	// use getPlan method to get object of type Plan
	public Plan getPlan(String planType) {
		if (planType == null) {
			return null;
		}

		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}

		else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		}

		else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}

		return null;
	}

}

public class GenerateBill {

	public static void main(String[] args) throws IOException {

		GetPlanFactory planFactory = new GetPlanFactory();

		System.out
				.print("Enter the name of plan for which the bill will be generated: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();

		System.out
				.print("Enter the number of units for bill will be calculated: ");

		int units = Integer.parseInt(br.readLine());

		Plan p = planFactory.getPlan(planName);

		System.out.print("Bill amount for " + planName + " of  " + units
				+ " units is: ");
		p.getRate();
		p.calculateBill(units);
	}

}

//
//Output
//=====================
//
//Enter the name of plan for which the bill will be generated: commercialplan
//Enter the number of units for bill will be calculated: 500
//Bill amount for commercialplan of  500 units is: 3750.0

