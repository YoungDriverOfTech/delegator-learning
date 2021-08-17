package aop.com.decoratordemo;

public class DataServiceDecorator implements DataService{

    private DataService decorator;

    public DataServiceDecorator(DataService decorator) {
        this.decorator = decorator;
    }

    @Override
    public String a(int i) {
        System.out.println("method a is start");
        decorator.a(i);
        System.out.println("method a is end");
        return "";
    }

    @Override
    public String b(int i) {
        System.out.println("method b is start");
        decorator.b(i);
        System.out.println("method b is end");
        return "";
    }
}
