package pl.camp.it.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("serwer1", "123.123.123.123");
        mapa.put("serwer2", "234.234.234.234");
        mapa.put("admin.login", "123.123.123.123");
        mapa.put("admin.pass", "abc123");
        String s = mapa.putIfAbsent("admin.login", "akjsahdfgkjh");
        System.out.println(s);

        System.out.println(mapa.get("serwer1"));

        System.out.println(mapa.get("admin.login"));

        System.out.println(mapa.containsValue("123.123.123.123324534"));
    }
}
