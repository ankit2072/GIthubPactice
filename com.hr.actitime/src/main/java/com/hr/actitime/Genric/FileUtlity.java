package com.hr.actitime.Genric;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtlity {
	
	public String getdatafromPropertyFile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant1.propertyfilepath);

		Properties p1 = new Properties();

		p1.load(fis);

		String value = p1.getProperty(key);
		

		return value;

	}


}
