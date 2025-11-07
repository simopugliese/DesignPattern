package Template;

public class MethodOne extends AbstractWithHook{

    public MethodOne() {
        super();
    }

    @Override
    void primitiveOperation1() {
        System.out.println("Prima operazione personalizzata");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("Seconda operazione personalizzata");
    }
}
