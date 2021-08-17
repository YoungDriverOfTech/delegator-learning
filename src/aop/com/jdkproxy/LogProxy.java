package aop.com.jdkproxy;

import aop.com.decoratordemo.DataService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogProxy implements InvocationHandler {

    DataService dataService;

    public LogProxy(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " is invoked: " + Arrays.toString(args));
        Object value = method.invoke(dataService, args);
        System.out.println(method.getName() + " is finished: " + value);
        return value;
    }
}
