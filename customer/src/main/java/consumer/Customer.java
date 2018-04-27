package consumer;

import api.ServiceDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
    public static void main(String[] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/consumer.xml"});
        context.start();
        ServiceDemo serviceDemo= (ServiceDemo) context.getBean("serviceDemo");

        while (true){
            try {
                String result=serviceDemo.sayHello("customer");
                System.out.println(result);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
