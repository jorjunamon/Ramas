import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Introduza nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduza edad");
        Integer edad = sc.nextInt();
        System.out.println("Su nombre es " + nombre + " Y tiene " + edad);
    }
}