package Excepciones_Ficheros.A01;

import java.util.Scanner;

public class A01_recur {

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un entero: ");
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: intenta de nuevo.");
            return leerEntero(); // llamada recursiva
        }
    }

    public static void main(String[] args) {
        int numero = leerEntero();
        System.out.println("Número leído: " + numero);
    }
}
