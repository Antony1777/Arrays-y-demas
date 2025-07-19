import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> tareas = new LinkedList<>();

        tareas.add("Estudiar");
        tareas.add("Hacer ejercicio");
        tareas.removeFirst();
        String siguiente = tareas.peek();

        System.out.println("Siguiente tarea: " + siguiente);
    }
}