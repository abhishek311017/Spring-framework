package org.abhishek.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware{
  private Point p1;
  private Point p2;
  private Point p3;
  private ApplicationContext context=null;
public Point getP1() {
	return p1;
}
public void setP1(Point p1) {
	this.p1 = p1;
}
public Point getP2() {
	return p2;
}
public void setP2(Point p2) {
	this.p2 = p2;
}
public Point getP3() {
	return p3;
}
public void setP3(Point p3) {
	this.p3 = p3;
}


 
public void setApplicationContext(ApplicationContext Context) throws BeansException {
	 this.context=context;
}
public void setBeanName(String beanName) {
	System.out.println("Bean name is:"+beanName);
	
}
  
}

