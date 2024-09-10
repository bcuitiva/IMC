import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List lista = new ArrayList();
        IMC p1 = new IMC();

        System.out.println("Bienvenido, calcularas tu IMC.");
        System.out.println("Ingresa tu nombre:");
        String nombre = sc.next();
        p1.setNombre(nombre);
        System.out.println("Ingresa tu peso:");
        double peso = sc.nextDouble();
        p1.setPeso(peso);
        System.out.println("Ingresa tu estatura:");
        double estatura = sc.nextDouble();
        p1.setEstatura(estatura);
        p1.calcularIMC();
    }
}