package pl.camp.it.zbiory;

import java.util.*;

public class App {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();

        zbior.add("Mateusz");
        zbior.add("Janusz");
        zbior.add("Ania");
        zbior.add("Karol");
        zbior.add("Zbigniew");

        System.out.println(zbior);

        zbior.add("Mateusz");

        System.out.println(zbior);

        zbior.remove("Mateusz");

        System.out.println(zbior);

        System.out.println(zbior.contains("Dominika"));

        for(String element : zbior) {
            System.out.println(element);
        }

        System.out.println("----------------------------------");

        Iterator<String> iterator = zbior.iterator();
        while(iterator.hasNext()) {
            String kolejnyElement = iterator.next();
            iterator.remove();
            System.out.println(kolejnyElement);
        }

        System.out.println(zbior.size());
    }
}
