package com;

import java.util.Scanner;

public class TaxCalculator {
	public String empName;
	public boolean isIndian;
	public double empSal;
	
	public double calculateTax(double taxAmount) throws TaxNotEligibleException, 
	CountryNotValidException, EmployeeNameInvalidException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you Indian");
		isIndian = sc.nextBoolean();
		System.out.println("Your Name :");
		empName = sc.next();
		System.out.println("Your Salary Amount :");
		empSal = sc.nextDouble();
		if(isIndian != true) { 
			throw new CountryNotValidException("the employee should be an Indian citizen for calculating tax");
			
		}
		else if(empName==null) {
			throw new EmployeeNameInvalidException ("The employee name cannot be empty");
		}
		else if(empSal>100000 && isIndian==true) {
			taxAmount = empSal * 8/100;
			
		}
		else if(empSal>=50000 && empSal<=100000 && isIndian==true) {
			taxAmount = empSal*6/100;
		}
		else if(empSal>=30000 && empSal<=50000 && isIndian==true) {
			taxAmount = empSal*5/100;
		}
		else if(empSal>=10000 && empSal<=30000 && isIndian==true) {
			taxAmount = empSal*4/100;
		}
		else {
			throw new TaxNotEligibleException("The employee does not nees to pay tax");
		}
		return taxAmount;
	}

}
