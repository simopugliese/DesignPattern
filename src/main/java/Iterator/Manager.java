package Iterator;

import Iterator.Menus.Menu;
import Iterator.Menus.MenuItem;
import java.util.Iterator;
import java.util.List;

public class Manager {
    List<Menu> menus;

    public Manager(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}