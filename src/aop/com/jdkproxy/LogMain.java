package aop.com.jdkproxy;

import aop.com.decoratordemo.DataService;
import aop.com.decoratordemo.DataServiceImpl;

import java.lang.reflect.Proxy;

public class LogMain {

    static DataService delegate = new DataServiceImpl();

    public static void main(String[] args) {
        DataService dataService = (DataService) Proxy.newProxyInstance(delegate.getClass().getClassLoader(),
                new Class[]{DataService.class},
                new LogProxy(delegate));

        dataService.a(11);
        dataService.b(22);
    }
}
