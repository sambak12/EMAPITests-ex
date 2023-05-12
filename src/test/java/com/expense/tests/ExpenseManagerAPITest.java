package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExpenseManagerAPITest {

	@Test
	public void test1() {
		RestAssured.port = 8089;
		Response res = RestAssured.get("http://localhost:8089/ExpenseApp-1/login.jsp");
		int code = res.getStatusCode();
		assertEquals(code, 200);
		System.out.println(code);	
	}
	
	@Test
	public void Test2(){
		RestAssured.port = 8089;
		Response res = RestAssured.get("http://localhost:8089/ExpenseApp-1/login.jsp");
		int time = (int) res.getTime();
		assertEquals(time, 5000);
		System.out.println(time);
	}
		

}
