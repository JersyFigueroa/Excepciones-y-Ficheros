package Excepciones_Ficheros.A04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a04 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("NumerosReales.txt"));
            String linea = br.readLine();

            if (linea != null) {
                String[] numeros = linea.split(" ");
                double suma = 0;

                for (String num : numeros) {
                    suma += Double.valueOf(num);
                }

                double media = suma / numeros.length;

                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo.");
            }
        }
    }
}
