package service;

import api.ServiceDemo;

public class ServiceDemoImpl implements ServiceDemo{
    public String sayHello(String name) {
        String result="Hello "+name;
        return result;
    }

}
