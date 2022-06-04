package com.mavenproject.manager;

import java.util.Properties;

import javax.jdo.JDOHelper;

public class DBConnection {

	public static void main(String[]args) {
		Properties props = new Properties();
		
	//	props.put("javax.jdo.PersistenceManagerFactoryClass", "org.datanucleus.api.jdo.JDOPersistenceManagerFactory");
		props.put("javax.jdo.option.ConnectionDriverName", "com.mysql.jdbc.Driver");
		props.put("javax.jdo.option.ConnectionURL", "jdbc:mysql://localhost:3306/training?allowPublicKeyRetrieval=true&useSSL=false");
		props.put("javax.jdo.option.ConnectionUserName", "root");
		props.put("javax.jdo.option.ConnectionPassword", "mysql");
		
		JDOHelper.getPersistenceManagerFactory(props);
		
		System.out.println("Connected");
	}
}
