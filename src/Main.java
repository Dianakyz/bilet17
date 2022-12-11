import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        System.out.println("Задача №1");
        String s1, s2;
        char a0, a1, a2, a3, a4;
        s1 = "таран";
        s2 = s1;
        a0 = s1.charAt(0);
        a1 = s1.charAt(1);
        a2 = s1.charAt(2);
        a3 = s1.charAt(3);
        a4 = s1.charAt(4);
        s2 = a4 + "" + a3 + "" + a2 + "" + a1 + "" + a0;
        System.out.println(s2);
        if(s1.equals(s2)) {
            System.out.println("Слово: " + s1 + " - палиндром");
        } else {
            System.out.println("Слово: " + s1 + " - не палиндром");
        }

        System.out.println("Задача №2");
        HashMap<Integer, String> keyValye = new HashMap<>();

        keyValye.put(1, "Первый");
        keyValye.put(2, "Второй");
        keyValye.put(3, "Третий");

        System.out.println(keyValye.size());

        System.out.println("Цикл while: ");
        Iterator iter = keyValye.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry current = (Map.Entry) iter.next();
            System.out.println("Ключ это: " + current.getKey() + ". Значение: " + current.getValue());
        }

        System.out.println("Цикл for: ");
        for(Map.Entry current2: keyValye.entrySet()) {
            System.out.println("Ключ это: " + current2.getKey() + ". Значение: " + current2.getValue());
        }
    }
}