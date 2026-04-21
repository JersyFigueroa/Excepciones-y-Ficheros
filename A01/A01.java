package Excepciones_Ficheros.A01;

import java.util.Scanner;

public class A01 {

    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer num = null;

        while (num == null) {
            try {
                System.out.print("Introduce un entero: ");
                num = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: no es un número entero válido.");
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int numero = leerEntero();
        System.out.println("Número leído: " + numero);
    }
}