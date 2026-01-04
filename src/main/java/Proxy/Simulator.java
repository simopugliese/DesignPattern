package Proxy;

import java.lang.reflect.Proxy;

public class Simulator {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.drive();
    }

    public void drive() {
        // Creiamo una persona reale (RealSubject)
        PersonBean joe = getPersonFromDatabase("Joe Javabean");

        // Creiamo il proxy per il proprietario (Joe accede al proprio profilo)
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());

        try {
            ownerProxy.setInterests("bowling, Go");
            System.out.println("Interests set from owner proxy");
        } catch (Exception e) {
            System.out.println("Can't set interests from owner proxy");
        }

        try {
            ownerProxy.setHotOrNotRating(10); // Dovrebbe fallire
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        System.out.println("--------------------------------");

        // Creiamo il proxy per un non-proprietario (Qualcun altro accede al profilo di Joe)
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());

        try {
            nonOwnerProxy.setInterests("hacking, computers"); // Dovrebbe fallire
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }

        try {
            nonOwnerProxy.setHotOrNotRating(3); // Dovrebbe funzionare
            System.out.println("Rating set from non owner proxy");
        } catch (Exception e) {
            System.out.println("Can't set rating from non owner proxy");
        }
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    // Metodi helper per creare i Proxy dinamici

    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getPersonFromDatabase(String name) {
        PersonBean person = new PersonBeanImpl();
        person.setName(name);
        person.setHotOrNotRating(7);
        person.setGender("Male");
        person.setInterests("cars, computers, music");
        return person;
    }
}