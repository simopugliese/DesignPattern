package Template;

public class MethodSecondWithHook extends AbstractWithHook{

    public MethodSecondWithHook() {
        super();
    }

    @Override
    void primitiveOperation1() {
        System.out.println("Operazione personalizzata numero uno diversa dall'altra classe");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("Operazione ancora diversa");
    }

    @Override
    void hook(){
        System.out.println("qui decido di fare l'Override di hook() e di modificarne il comportamento");
    }
}
