import java.util.Stack;

public class EjemploStack {
    public static void main(String[] args) {
        Stack<String> paginas = new Stack<>();

        paginas.push("Inicio");
        paginas.push("Contacto");
        String ultima = paginas.peek();
        paginas.pop();

        System.out.println("Página actual: " + ultima);
    }
}