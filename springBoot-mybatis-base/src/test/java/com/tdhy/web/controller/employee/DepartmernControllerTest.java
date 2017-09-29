package com.tdhy.web.controller.employee;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.tdhy.BaseTest;

import net.sf.json.JSONObject;

public class DepartmernControllerTest extends BaseTest{

	Logger logger = LoggerFactory.getLogger(DepartmernControllerTest.class);
	
	@Test
	public void testFindListHttpSession() throws Exception {
		 MvcResult result =mock.perform(MockMvcRequestBuilders.get("/dep/list").session(getLoginSession()))
				 .andExpect(MockMvcResultMatchers.status().isOk()) 
				 .andDo(MockMvcResultHandlers.print()) 
				 .andReturn();
		 MockHttpServletResponse res = result.getResponse();
		 Assert.assertTrue(res.getStatus() == 200);
		 String content = res.getContentAsString();
		 JSONObject object = JSONObject.fromObject(content);
		 logger.info(res.getContentAsString());
		 Assert.assertTrue(200 == object.getInt("code"));
		 
	}
	
	
    /** 
     * 获取登入信息session 
     * @return 
     * @throws Exception 
     */  
    private MockHttpSession getLoginSession() throws Exception{  
        MvcResult result = this.mock  
                                .perform((MockMvcRequestBuilders.get("/dep/login")))  
                                .andExpect(status().isOk())  
                                .andReturn();  
        return (MockHttpSession) result.getRequest().getSession();  
    }  

}
