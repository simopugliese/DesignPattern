package Singleton;

public class Simulator {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.nonFaccioNiente();
        //in questo caso la classe Singleton non ha metodi oltre a nonFaccioNiente, ma potrebbe averne
    }
}
