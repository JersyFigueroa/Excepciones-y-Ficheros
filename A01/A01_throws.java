package Excepciones_Ficheros.A01;

import java.util.Scanner;

public class A01_throws {

    public static Integer leerEntero() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        try {
            int numero = leerEntero();
            System.out.println("Número leído: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: formato incorrecto.");
        }
    }
}
