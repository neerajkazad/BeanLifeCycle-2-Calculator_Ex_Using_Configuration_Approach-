package com.bl.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Calculator implements BeanFactoryAware {
	private int num1;
	private int num2;
	private int sum;
	
	public Calculator(int num1) {
		System.out.println("Calculator(num1)");
		this.num1 = num1;
		
	} 
	
	public void setNum2(int num2) {
		System.out.println("setNum2(num2)");
		this.num2 = num2;
	}

	
	

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("setBeanFactory()");
	}

	
	public void init() {
		System.out.println("init()");
		this.sum = this.num1 + this.num2;
	}
	
	public void destory() {
		System.out.println("destroy()");
	}
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", sum=" + sum
				+ "]";
	}
	
	
}
