package consumer;

import api.ServiceDemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

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
                int arr[]={23,5,67,12,87,2,5,78,19,0};
                int sortArr[]=serviceDemo.sort(arr);
                System.out.println(Arrays.toString(sortArr));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
