package com.hr.actitime.Genric;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtlity {
	
	public String getdatafromPropertyFile(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstant1.propertyfilepath);

		Properties p = new Properties();

		p.load(fis);

		String value = p.getProperty(key);
		

		return value;

	}


}
