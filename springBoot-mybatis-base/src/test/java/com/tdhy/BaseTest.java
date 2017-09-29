package com.tdhy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=TdhyBaseApplication.class)
public class BaseTest {
	
	Logger logger = LoggerFactory.getLogger(BaseTest.class);
	
	public MockMvc mock;
	
	@Autowired
	private WebApplicationContext context;
	
	private MockHttpSession session;
	
	@Before
	public void setup(){
		this.mock = MockMvcBuilders.webAppContextSetup(context).build();  
		this.session = new MockHttpSession();
		logger.info("--  mockMvc  实例化成功 -- ");
	}
	
	
	@Test
	public void test01(){
		logger.info("-- test01 --");
	}
	
}
