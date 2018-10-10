package com.springboot.itestdemo;

import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ITestDemo {

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
    @Test
    public void testNotFound() {
        String url="http://localhost:8081/notfound";
        String body = HttpUtil.doGet(url);
        System.out.println("Body:"+body);
        assertNull(body);
    }


}
