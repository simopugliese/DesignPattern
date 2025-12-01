package Iterator;

import Iterator.Menus.DinerMenu;
import Iterator.Menus.Menu;
import Iterator.Menus.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

public class Simulator {
    public static void main(String[] args) {
        // Creazione dei menu concreti
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // Creazione della lista di menu da passare al Manager
        List<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        // Iniezione dei menu nel Client
        Manager manager = new Manager(menus);

        // Stampa unificata
        System.out.println("--- MENU STAMPATO TRAMITE ITERATOR ---");
        manager.printMenu();
    }
}