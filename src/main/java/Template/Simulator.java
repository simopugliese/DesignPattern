package Template;

public class Simulator {
    public static void main(String[] args) {
        AbstractWithHook first = new MethodOne();
        AbstractWithHook second = new MethodSecondWithHook();

        first.templateMethod();
        System.out.println("-------------------");
        second.templateMethod();
    }
}
