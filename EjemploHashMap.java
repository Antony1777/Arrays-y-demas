import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> edades = new HashMap<>();

        edades.put("Ana", 22);
        edades.put("Luis", 30);
        int edadAna = edades.get("Ana");
        edades.remove("Luis");

        System.out.println("Edad de Ana: " + edadAna);
    }
}