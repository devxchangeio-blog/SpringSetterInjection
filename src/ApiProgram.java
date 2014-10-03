import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ApiManagementService;

/**
 * 
 */

/**
 * @author Karthy
 * 
 */
public class ApiProgram {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		ApiManagementService service = (ApiManagementService) context
				.getBean("apiManagementService");

		service.askQuestion();

	}

}
