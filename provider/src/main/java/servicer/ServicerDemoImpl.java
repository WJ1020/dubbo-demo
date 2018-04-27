package servicer;

import api.ServiceDemo;

public class ServicerDemoImpl implements ServiceDemo{
    public String sayHello(String name) {
        String result="Hello"+name;
        return result;
    }

}
