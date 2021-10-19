package com.crm.contacttest;

import org.testng.annotations.Test;

public class contactTest {
	@Test
public void createContacttest() {
	System.out.println("create contact");
	String url=System.getProperty("url");
	System.out.println(url);
}
@Test
public void openContacttest() {
	System.out.println("open contact");
}
}
