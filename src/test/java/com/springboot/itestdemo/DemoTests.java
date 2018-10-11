package com.springboot.itestdemo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DemoTests {

	@Test
	public void testIndex() {
        String url="http://localhost:8081";
        String body = HttpUtil.doGet(url);
        System.out.println("Body:"+body);
        assertTrue(body.contains("Hello Spring Boot"));
	}
    @Test
    public void testHello() {
        String url="http://localhost:8081/hello";
        String body = HttpUtil.doGet(url);
        System.out.println("Body:"+body);
        assertTrue(body.contains("Hello World"));
    }
}
