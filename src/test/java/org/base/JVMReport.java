package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jasonFile) {
		
		File f = new File("D:\\Eclipse\\Cucumbr1Pro\\src\\test\\resources\\Reports");
		Configuration config = new Configuration(f, "Adacitin");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Sprint", "2");
		config.addClassifications("OS", "Windows");
		
		List<String> l = new ArrayList<String>();
		
		ReportBuilder builder = new ReportBuilder(l, config);
		builder.generateReports();
		
	}

}
