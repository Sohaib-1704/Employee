package com.cg.per;

public class Employee {
	@SuppressWarnings("unused")
	private String name;
	private double salary;
	private double pfper;
	public Employee(String name, double salary, double pfper) {
		this.name=name;
		this.salary=salary;
		this.pfper=pfper;
	}
	public double calNetPay() {
		if (pfper<=5) {
			return salary;
		}
		else {
			return salary-salary*(pfper/100);
		}
	}
}
