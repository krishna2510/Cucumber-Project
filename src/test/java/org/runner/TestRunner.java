package org.runner;


import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Eclipse\\Cucumbr1Pro\\src\\test\\resources\\Adacitin.feature",
glue= {"org.stepdef"}, plugin= {"json:D:\\Eclipse\\Cucumbr1Pro\\src\\test\\resources\\Reports\\Adacitin1.json"})

public class TestRunner{

	public static void afterclass() {
		JVMReport.generateJVMReport("D:\\Eclipse\\Cucumbr1Pro\\src\\test\\resources\\Reports\\Adacitin1.json");

	}

}