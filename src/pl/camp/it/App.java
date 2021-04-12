package pl.camp.it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        Boolean bool = true;
        Double aDouble = 5.5;
        Character character = 'A';

        System.out.println(lista.size());
        lista.add("ABC");
        System.out.println(lista.size());
        lista.add("BBB");
        System.out.println(lista);
        System.out.println(lista.size());
        lista.remove(0);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.add("BBB");
        System.out.println(lista);
        lista.remove("BBB");
        System.out.println(lista);
        lista.add("AAA");
        lista.add("CCC");
        System.out.println(lista);

        ArrayList lista2 = new ArrayList();
        lista2.add("DDD");
        lista2.add("EEE");
        System.out.println(lista2);

        lista.addAll(lista2);

        System.out.println("---------------");
        System.out.println(lista);
        System.out.println(lista2);

        System.out.println(lista);

        System.out.println(lista.get(4));

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("------------------------");
        for(String s : lista) {
            System.out.println(s);
        }

        /*ArrayList<ArrayList<String>> listaList = new ArrayList<>();

        ArrayList<String> zerowaLista = listaList.get(0);
        String string = zerowaLista.get(0);*/

        ArrayList<Car> cars = new ArrayList<>();

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.model = "3";

        Car c2 = new Car();
        c2.brand = "BMW";
        c2.model = "3";

        cars.add(c1);
        cars.add(c2);

        Car c3 = new Car();
        c3.brand = "BMW";
        c3.model = "3";

        System.out.println(cars.size());

        cars.remove(c3);

        System.out.println(cars);

        System.out.println(cars.size());

        ArrayList list = new ArrayList();

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car currentCar = iterator.next();
            System.out.println(currentCar.brand);
        }
    }
}
