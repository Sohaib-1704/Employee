package com.cg.per;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class EmployeeTest {
	Employee  e1 = new Employee("sohaib1",5000,4);
	Employee  e2 = new Employee("sohaib2",6000,6);
	Employee  e3 = new Employee("sohaib3",10000,6);
	
	@Test
	public void test1() {
		assertEquals(e1.calNetPay(),5000);
	}
	@Test
	public void test2() {
		assertEquals(e2.calNetPay(),5640);
	}
	@Test
	public void test3() {
		assertEquals(e3.calNetPay(),9400);
	}
}
