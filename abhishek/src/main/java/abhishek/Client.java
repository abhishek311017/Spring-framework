package abhishek;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
@SuppressWarnings("resource")
public static void main(String[] args) {
	@SuppressWarnings("unused")
	ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("test.xml");
	ac.close();	
}
}
