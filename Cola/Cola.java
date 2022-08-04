import java.io.*;

public class Cola {
    public static void main(String[] args) {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        char cola[] = new char[6];

        int frente = 0, fin = 0;

        byte option = 0;
        int x, i, aux = 0;

        char resp = 'S', elem;
        boolean valid = true;

        // COLAS SIMPLES
        System.out.println("COLAS SIMPLES\n");
        do {
            do {
                System.out.println("Opciones para la Cola");
                System.out.println("1. Insertar");
                System.out.println("2. Eliminar");
                System.out.println("3. Imprimir Cola");
                System.out.println("4. Salir ...");

                try {
                    System.out.print("Introduzca una opcion: ");
                    option = Byte.parseByte(read.readLine());

                    if (option < 0 || option > 4) {
                        System.out.println("Error! Su opcion no es valida, Vuelva a introducir...");
                        valid = false;
                    }

                    valid = true;
                } catch (NumberFormatException er) {
                    System.out.println("ERROR... " + er);
                    valid = false;
                } catch (IOException e) {
                    System.out.println(e);
                    valid = false;
                }

            } while (!valid);

            switch (option) {
                case 1:
                    System.out.println("1. INSERTAR");

                    do {
                        try {
                            System.out.println("La cola tiene un maximo de 5 espacios.");
                            for (i = 0; i < 5; i++) {
                                System.out.print("Introduzca el elemento " + (i + 1) + ": ");
                                elem = (char) read.read();
                                cola[i] = elem;

                                // Algoritmo de insertar
                                if (fin < 5) {
                                    fin = fin + 1;
                                    cola[fin] = elem;
                                    if (fin == 1) {
                                        frente = 1;
                                    }
                                } else {
                                    System.out.println("COLA LLENA");
                                }
                                valid = true;
                            }
                        } catch (NumberFormatException err) {
                            System.out.println("Error! Introduzca un valor valido");
                            System.out.println(err);
                            valid = false;
                        } catch (IOException er) {
                            System.out.println(er);
                            valid = false;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println(e);
                            valid = false;
                        }
                    } while (!valid);

                    break;

                case 2:
                    System.out.println("2. ELIMINAR");

                    System.out.println("FRENTE: " + frente);
                    System.out.println("FINAL: " + fin);

                    // Algoritmo de eliminar
                    if (frente != 0) {
                        cola[frente - 1] = 0;
                        if (frente == fin) {
                            frente = 0;
                            fin = 0;
                        } else {
                            frente = frente + 1;
                        }
                    } else {
                        System.out.println("COLA VACIA");
                    }

                    break;

                case 3:
                    System.out.println("IMPRIMIR COLA");

                    for (x = 0; x < 5; x++) {
                        System.out.println("\t" + "Cola [" + (x + 1) + "]: " + cola[x] + "\t");
                        aux = x;
                    }
                    if (cola[aux] == 0) {
                        System.out.println("Su cola esta completamente vacia.");
                    } else if (cola[aux] != 0) {
                        System.out.println("Su cola tiene contenido.");
                    }
                    break;

                case 4: // SALIR
                    System.out.println("SALIR");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Introdujo un valor invalido...");
                    break;

            }

            do {
                try {
                    System.out.println("¿Desea ingresar otros datos? (S/N)");
                    resp = (char) read.read();
                    valid = true;
                    read.skip(2);
                    if (resp != 'S' && resp != 's' && resp != 'N' && resp != 'n') {
                        System.out.println("Error! Ingrese una opcion valida!");
                        valid = false;
                    }
                } catch (IOException err) {
                    System.out.println(err);
                    valid = false;
                }
            } while (!valid);
        } while (resp == 's' || resp == 'S');
    }
}