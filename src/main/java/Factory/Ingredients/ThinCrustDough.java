package Factory.Ingredients;

public class ThinCrustDough implements Dough {
    @Override
    public void getDough() {
        System.out.println("ThinCrustDough");
    }
}
