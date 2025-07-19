import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.remove("Banana");
        String primera = frutas.get(0);

        System.out.println("Primera fruta: " + primera);
    }
}