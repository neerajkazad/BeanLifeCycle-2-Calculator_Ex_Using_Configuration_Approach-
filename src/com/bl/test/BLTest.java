package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bl.beans.Calculator;

public class BLTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bl/common/application-context.xml"));
		Calculator calculator = factory.getBean("calculator", Calculator.class);
		System.out.println(calculator);
	}

}
