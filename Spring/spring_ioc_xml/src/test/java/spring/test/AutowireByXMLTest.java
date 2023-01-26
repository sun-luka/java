package spring.test;

import com.sun.spring.xml.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;


/**
 * @author JAB
 * @create 2023-01-26-12:38 PM
 */
public class AutowireByXMLTest {

    @Test
    public void testAutowire(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
