package lab2p2_diegoandino;

import java.util.ArrayList;
import java.util.Scanner;

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
                        System.out.println("Ingrese Una casas: ");
                        
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

}
