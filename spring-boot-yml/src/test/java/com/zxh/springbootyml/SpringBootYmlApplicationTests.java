package com.zxh.springbootyml;

import com.zxh.springbootyml.pojo.Person;
import com.zxh.springbootyml.pojo.Person_1;
import com.zxh.springbootyml.pojo.Person_2;
import com.zxh.springbootyml.server.HelloServer_1;
import com.zxh.springbootyml.server.HelloServer_2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootYmlApplicationTests {

	@Autowired
	Person person;
	@Autowired
	Person_1 person_1;

	@Autowired
	Person_2 person_2;

	@Autowired
	ApplicationContext context;

	@Test
	public void contextLoads() {

		System.out.println(person.toString());

		System.out.println("========================");

		System.out.println(person_1);


		System.out.println("========================");

		System.out.println(person_2);

	}

	@Test
	public void beanTest(){
		boolean isBean = context.containsBean("helloServer_1");
		System.out.println(isBean);
		HelloServer_1 server_1 = (HelloServer_1) context.getBean("helloServer_1");
		server_1.test();

		System.out.println("=======================");
		HelloServer_2 HelloServer_2 = (HelloServer_2)context.getBean("helloServer_2");
		HelloServer_2.test();
	}


}
