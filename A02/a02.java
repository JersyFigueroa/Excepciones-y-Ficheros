package Excepciones_Ficheros.A01.A02;

import java.io.FileReader;
import java.io.IOException;

public class a02 {

    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("Main.java");
            int c;

            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo.");
            }
        }
    }
}
