package lab2p2_diegoandino;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2P2_DiegoAndino {

    static Scanner leer = new Scanner(System.in);
    static int llave = 0;

    public static void main(String[] args) {
        
        
        // NO VERIFIQIE SI ERA EL ADMIN, NO HICE EL MANEJO DE ESTADO, Y NO HICE EL MODIFICADOR..
        //TE SALVO EL TIEMPO
        
        
        Users usuario = new Users();
        String User = "Admin";
        ArrayList lista = new ArrayList();
        ArrayList<Users> usuarios = new ArrayList();
        Users Admin = new Users("Diego", 20, "admin", "admin1234");
        int opcion;
        usuarios.add(Admin);

        do {
            System.out.println("1 <- Registro de Inmueble/Solar \n"
                    + "2 <- Manejo de Estados\n"
                    + "3 <- Log In/Sign Up\n"
                    + "4 <- Salir");
            opcion = leer.nextInt();
//------------------------------------------------------------------------------
            if (opcion == 1) {

                int op;

                do {
                    System.out.println("-------------------------------------");
                    System.out.println("1 <- Crear Casas/Edificios/Solares \n"
                            + "2 <- Listar Casas/Edificios/Solares\n"
                            + "3 <- Modificar Casas/Edificios/Solares\n"
                            + "4 <- Borrar Casas/Edificios/Solares\n"
                            + "5 <- Comprar Casas/Edificios/Solares\n"
                            + "6 <- Salir");
                    System.out.println("-------------------------------------");

                    op = leer.nextInt();

                    if (op == 1) {
                        int ops;
                        System.out.println("1 <- casa\n"
                                + "2 <- edificio\n"
                                + "3 <- solares");
                        System.out.println("Ingres opcion:");
                        ops = leer.nextInt();

                        if (ops == 1) {
                            lista.add(casa());
                        }
                        if (ops == 2) {
                            lista.add(edificios());
                        }
                        if (ops == 3) {
                            lista.add(solares());
                        }
                    }
                    if (op == 2) {
                        System.out.println(lista);
                        int ops;
                        System.out.println("1 <- casa\n"
                                + "2 <- edificio\n"
                                + "3 <- solares");
                        System.out.println("Ingres opcion:");
                        ops = leer.nextInt();
                        if (ops == 1) {
                            for (Object t : lista) {
                                if (t instanceof Casas) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                        }
                        if (ops == 2) {
                            for (Object t : lista) {
                                if (t instanceof Edificios) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                        }
                        if (ops == 3) {
                            for (Object t : lista) {
                                if (t instanceof Solares) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                        }

                    }

                    if (op == 3) {
                        System.out.println("1 <- Casas\n"
                                + "2 <- Edificios\n"
                                + "3 <- Solares");
                        System.out.println("Ingrese que quiere modificar");
                        int opxion = leer.nextInt();
                        
                        if (opxion == 1) {
                            
                        }
                        if (opxion == 2) {
                            
                        }
                        if (opxion == 3) {
                            
                        }
                        
                        

                        

                    }
//..............................................................................
                    if (op == 4) {
                        int p = 0;
                        do {
                            System.out.println("Posicion de lo que desea borrar desde 0:");
                            p = leer.nextInt();
                        } while (p < 0 || p > lista.size());

                        lista.remove(p);

                    }
                    if (op == 5) {
                        System.out.println("1 <- Casas\n"
                                + "2 <- Edificios\n"
                                + "3 <- Solares");
                        System.out.println("Ingrese lo que quiere comprar comprar: ");
                        int opziones = leer.nextInt();

                        if (opziones == 1) {
                            for (Object t : lista) {
                                if (t instanceof Casas) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                            System.out.println("Posicion a comprar: ");
                            int x = leer.nextInt();
                            System.out.println("VEndido a: ");
                            leer.nextLine();
                            String owner = leer.nextLine();
                            ((Casas) lista.get(x)).setDue??o(owner);

                        } else if (opziones == 2) {
                            for (Object t : lista) {
                                if (t instanceof Edificios) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                            System.out.println("Posicion a comprar: ");
                            int x = leer.nextInt();
                            System.out.println("Vendino a: ");
                            leer.nextLine();
                            String owner = leer.nextLine();
                            ((Edificios) lista.get(x)).setDue??o(owner);

                        } else if (opziones == 3) {
                            for (Object t : lista) {
                                if (t instanceof Solares) {
                                    System.out.println("" + lista.indexOf(t) + "- " + t + "\n");
                                }

                            }
                            System.out.println("Posicion a comprar: ");
                            int x = leer.nextInt();
                            System.out.println("Vendido a: ");
                            leer.nextLine();
                            String owner = leer.nextLine();
                            ((Solares) lista.get(x)).setDue??o(owner);
                        }

                    }

                } while (op != 6);
            }
//------------------------------------------------------------------------------
            if (opcion == 2) {

            }
//------------------------------------------------------------------------------
            if (opcion == 3) {
                int opsi;

                do {
                    System.out.println("Menu user\n"
                            + "1 <- Crear Usuario\n"
                            + "2 <- Iniciar Sesion\n"
                            + "3 <- Log out\n"
                            + "4 <- Salir");
                    System.out.println("Ingrese su opcion: ");
                    opsi = leer.nextInt();

                    if (opsi == 1) {
                        System.out.println("Ingrese su nombre: ");
                        leer.nextLine();
                        String nombre = leer.next();

                        System.out.println("Ingrese el nombre de usuario: ");
                        leer.nextLine();
                        String usuari = leer.next();

                        System.out.println("Ingrese su contrase??a: ");
                        leer.nextLine();
                        String pass = leer.next();

                        System.out.println("Ingrese la edad del usuario: ");
                        int edad = leer.nextInt();

                        usuarios.add(new Users(nombre, edad, usuari, pass));
                    }
                    if (opsi == 2) {
                        System.out.println("nombre de usuario: ");
                        leer.nextLine();
                        String user = leer.next();
                        System.out.println("la contrase??a: ");
                        leer.nextLine();
                        String contra = leer.next();
                        System.out.println("Sesion iniciada...");

                    }
                    if (opsi == 3) {
                        llave--;
                        System.out.println("Sesion a terminado");

                    }

                } while (opsi != 4);

            }
        } while (opcion != 4);

    }

    static Casas casa() {
        String casa;
        int bloque;
        Color color;
        int ancho;
        int largo;
        int ba??os;
        int cuartos;
        String estado;
        String due??o;

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
        System.out.println("Ingrese ba??os");
        ba??os = leer.nextInt();
        System.out.println("Ingrese cuartos");
        cuartos = leer.nextInt();
        System.out.println("Ingrese estado");
        estado = leer.next();
        System.out.println("Ingrese due??o");
        due??o = leer.next();

        retorno = new Casas(casa, bloque, color, ancho, largo, ba??os, cuartos, estado, due??o);
        return retorno;

    }

    static Edificios edificios() {
        int piso;
        int locales;
        String direccion;
        String estado;
        String due??o;

        Edificios retorno;
        System.out.println("Ingrese piso");
        piso = leer.nextInt();
        System.out.println("Ingrese locales");
        locales = leer.nextInt();
        System.out.println("Ingrese ancho");
        direccion = leer.next();
        System.out.println("Ingrese estado");
        estado = leer.next();
        System.out.println("Ingrese due??o");
        due??o = leer.next();

        retorno = new Edificios(piso, locales, direccion, estado, due??o);
        return retorno;

    }

    static Solares solares() {
        int largo;
        int ancho;
        int area;
        String due??o;
        String estado;

        Solares retorno;
        System.out.println("Ingrese largo");
        largo = leer.nextInt();
        System.out.println("Ingrese ancho");
        ancho = leer.nextInt();
        System.out.println("Ingrese area");
        area = leer.nextInt();
        System.out.println("Ingrese due??o");
        due??o = leer.next();
        System.out.println("Ingrese estado");
        estado = leer.next();
        

        retorno = new Solares(largo, ancho, area, due??o, estado);
        return retorno;

    }
    

}
