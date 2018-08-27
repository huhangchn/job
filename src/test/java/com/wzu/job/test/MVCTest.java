package com.wzu.job.test;

import java.util.List;

import com.wzu.job.bean.Job;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class MVCTest {
	@Autowired
	WebApplicationContext context;
	
	MockMvc mockMvc;
	
	@Before
	public void init() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testPage() throws Exception {
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/showJobs")).andReturn();
				//.param("pn", "508")).andReturn();
		MockHttpServletRequest request = result.getRequest();

		PageInfo<Job> pageInfo = (PageInfo<Job>) request.getAttribute("pageInfo");
		System.out.println("当前页码："+pageInfo.getPageNum());
		System.out.println("总页码："+pageInfo.getPages());
		System.out.println("总记录数："+pageInfo.getTotal());
		System.out.print("在页面上连续显示的页码：");
		int[] nums = pageInfo.getNavigatepageNums();
		for(int num : nums) {
			System.out.print(" "+num);
		}
		System.out.println();

		List<Job> jobs = pageInfo.getList();
		for(Job job : jobs) {
			System.out.println(job);
		}
	}

//	@Test
//	public void testDepts() throws Exception {
//		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/getDepts")).andReturn();
//		MockHttpServletRequest request = result.getRequest();
//
//
//		List<Department> depts = (List<Department>) request.getAttribute("depts");
//		for(Department dept : depts) {
//			System.out.println(dept);
//		}
//
//	}
//
//	@Autowired
//	EmployeeService employeeService;
//	@Test
//	public void test() {
//		List<Employee> emps = employeeService.getAll();
//
//		for(Employee emp : emps) {
//			System.out.println(emp);
//		}
//	}
}
