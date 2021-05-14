package abhishek;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Question6a {
	
	@Value("${dburl}")
	public String url;
	
	public String toString() {
		return url;
		
	}
	

}
