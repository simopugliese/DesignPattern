package Template;

public abstract class AbstractWithHook {
    public AbstractWithHook() {
    }

    public final void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();
    abstract void primitiveOperation2();

    private void concreteOperation(){
        System.out.println("Operazione comune");
    }

    void hook(){
        System.out.println("Potrebbe non fare niente");
        System.out.println("Potrebbe fare qualcosa di comune");
        System.out.println("Nelle classi che estendono questa classe possiamo fare l'Override");
    }
}
