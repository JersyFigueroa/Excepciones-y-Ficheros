package Excepciones_Ficheros.A03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a03 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("Main.java"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
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
