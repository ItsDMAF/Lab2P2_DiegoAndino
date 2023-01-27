package lab2p2_diegoandino;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_DiegoAndino {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        int opcion;

        do {
            System.out.println("1 <- Registro de Inmueble/Solar \n"
                    + "2 <- Manejo de Estados\n"
                    + "3 <- Log In/Sign Up\n"
                    + "4 <- Salir");
            opcion = leer.nextInt();

            if (opcion == 1) {
//------------------------------------------------------------------------------
                int op;

                do {
                    System.out.println("-------------------------------------");
                    System.out.println("1 <- Crear Casas/Edificios/Solares \n"
                            + "2 <- Listar Casas/Edificios/Solares\n"
                            + "3 <- Modificar Casas/Edificios/Solares\n"
                            + "4 <- Borrar Casas/Edificios/Solares\n"
                            + "5 <- Vender Casas/Edificios/Solares\n"
                            + "6 <- Salir");
                    System.out.println("-------------------------------------");

                    op = leer.nextInt();

                    if (op == 1) {
                        System.out.println("Ingrese una casas: ");

                    }
                    if (op == 2) {

                    }
                    if (op == 3) {

                    }
                    if (op == 4) {

                    }
                    if (op == 5) {

                    }

                } while (op != 6);
//------------------------------------------------------------------------------
            }

            if (opcion == 2) {

            }
            if (opcion == 3) {

            }

        } while (opcion != 4);

    }

    static Casas casa() {
        String casa;
        int bloque;
        Color color;
        int ancho;
        int largo;
        int baños;
        int cuartos;

        Casas retorno;
        System.out.println("Ingrese casa:");
        casa = leer.next();
        System.out.println("Ingrese bloque");
        bloque = leer.nextInt();
        color = JColorChooser.showDialog(null, "Seleccione color", Color.BLACK);
        System.out.println("Ingrese ancho");
        ancho = leer.nextInt();
        System.out.println("Ingrese largo");
        largo = leer.nextInt();
        System.out.println("Ingrese baños");
        baños = leer.nextInt();
        System.out.println("Ingrese cuartos");
        cuartos = leer.nextInt();

        retorno = new Casas(casa, bloque, color, ancho, largo, baños, cuartos);
        return retorno;

    }

    static Edificios edificios() {
        int piso;
        int locales;
        String direccion;

        Edificios retorno;
        System.out.println("Ingrese piso");
        piso = leer.nextInt();
        System.out.println("Ingrese locales");
        locales = leer.nextInt();
        System.out.println("Ingrese ancho");
        direccion = leer.next();


        retorno = new Edificios(piso, locales, direccion);
        return retorno;

    }
    
     static Solares solares() {
        int largo;
     int ancho;
     int area;
     String dueño;

        Solares retorno;
        System.out.println("Ingrese largo");
        largo = leer.nextInt();
        System.out.println("Ingrese ancho");
        ancho = leer.nextInt();
        System.out.println("Ingrese area");
        area = leer.nextInt();
         System.out.println("Ingrese dueño");
         dueño = leer.next();


        retorno = new Solares(largo, ancho, area, dueño);
        return retorno;

    }
    
    
}
