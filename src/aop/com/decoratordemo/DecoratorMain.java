package aop.com.decoratordemo;

public class DecoratorMain {
    public static void main(String[] args) {
        DataService dataService = new DataServiceDecorator(new DataServiceImpl());

        dataService.a(11);
        dataService.b(22);
    }
}
