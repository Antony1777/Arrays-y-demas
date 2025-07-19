import java.util.Queue;
import java.util.LinkedList;

public class EjemploQueue {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();

        clientes.add("Carlos");
        clientes.add("Lucía");
        String primero = clientes.peek();
        clientes.poll();

        System.out.println("Cliente atendido: " + primero);
    }
}