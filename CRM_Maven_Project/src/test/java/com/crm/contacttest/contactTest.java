package com.crm.contacttest;

import org.testng.annotations.Test;

public class contactTest {
	@Test
public void createContatest() {
	System.out.println("create contact");
	String url=System.getProperty("url");
	System.out.println(url);
}
@Test
public void opeContacttest() {
	System.out.println("open contact");
}
}
