package codigo;

import java.util.Random;
import java.util.Scanner;

public class triki_2D {
	public static void main(String[] args) {
        int x, y, i, Opcion;
        String Jugador;
        Random rnd = new Random();
        char Matriz[][] = new char[3][3];
        Scanner Entrada = new Scanner(System.in);
        System.out.println("   BIENVENIDO AL JUEGO TRIQUI\n\n"
                + "\tMENU PRINCIPAL\n\n"
                + "¿En que modo desea jugar?\n\n"
                + "1) Contra la computadora\n"
                + "2) Multijugador\n"
                + "3) Salir\n");
        do {
            System.out.print("Por favor ingrese el numero correspondiente a la opcion: ");
            Opcion = Entrada.nextInt();
            if (Opcion != 1 && Opcion != 2 && Opcion != 3) {
                System.out.println("\n\n\tLA OPCION QUE INGRESO NO ES VALIDA, POR FAVOR LEA NUEVAMENTE EL MENU");
            }
        } while (Opcion != 1 && Opcion != 2 && Opcion != 3);
        if (Opcion == 1) {
        	
        	System.out.print("\nUsted selecciono jugar contra la computadora");
            for (i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    do {
                        System.out.println("\nJugador" + "\nIngrese la posicion en la que quiere jugar");
                        do {
                            System.out.print("Fila:");
                            x = Entrada.nextInt();
                            if (x < 0 || x > 2) {
                                System.out.println("La fila ingresada es invalida, esta debe ser un numero de 0 a 2");
                            }
                        } while (x < 0 || x > 2);
                        do {
                            System.out.print("Columna:");
                            y = Entrada.nextInt();
                            if (y < 0 || y > 2) {
                                System.out.println("La columna ingresada es invalida, esta debe ser un numero de 0 a 2");
                            }
                        } while (y < 0 || y > 2);
                        System.out.print("\n");
                        if (Matriz[x][y] == 'O' || Matriz[x][y] == 'X') {
                            System.out.println("La posicion a jugar se encuentra ocupada, por favor intente otra posicion");
                        }
                    } while (Matriz[x][y] == 'O' || Matriz[x][y] == 'X');
                } else {
                    do {
                        x = (int) (rnd.nextDouble() * 3.0);
                        y = (int) (rnd.nextDouble() * 3.0);
                        if (Matriz[x][y] == 'O' || Matriz[x][y] == 'X') {
                            x = (int) (rnd.nextDouble() * 3.0);
                            y = (int) (rnd.nextDouble() * 3.0);
                        }
                    } while (Matriz[x][y] == 'O' || Matriz[x][y] == 'X');
                }
                if (i % 2 == 0) {
                    Matriz[x][y] = 'O';
                } else {
                    Matriz[x][y] = 'X';
                }
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        System.out.print("[" + Matriz[x][y] + "]");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[0][1] && Matriz[0][1] == Matriz[0][2]) {
                    System.out.print("\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[1][1] && Matriz[1][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[1][0] && Matriz[1][0] == Matriz[2][0]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[2][0] == 'X' && Matriz[2][0] == Matriz[2][1] && Matriz[2][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[2][0] == 'X' && Matriz[2][0] == Matriz[1][1] && Matriz[1][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el Â¨PC");
                    i = 9;
                } else if (Matriz[2][2] == 'X' && Matriz[2][2] == Matriz[1][2] && Matriz[1][2] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[1][0] == 'X' && Matriz[1][0] == Matriz[1][1] && Matriz[1][1] == Matriz[1][2]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                } else if (Matriz[0][1] == 'X' && Matriz[0][1] == Matriz[1][1] && Matriz[1][1] == Matriz[2][1]) {
                    System.out.print("\n\n\tEl Ganador es el PC");
                    i = 9;
                }
                if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[0][1] && Matriz[0][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[1][1] && Matriz[1][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[1][0] && Matriz[1][0] == Matriz[2][0]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][0] == 'O' && Matriz[2][0] == Matriz[2][1] && Matriz[2][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][0] == 'O' && Matriz[2][0] == Matriz[1][1] && Matriz[1][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][2] == 'O' && Matriz[2][2] == Matriz[1][2] && Matriz[1][2] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[1][0] == 'O' && Matriz[1][0] == Matriz[1][1] && Matriz[1][1] == Matriz[1][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][1] == 'O' && Matriz[0][1] == Matriz[1][1] && Matriz[1][1] == Matriz[2][1]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                }
            }
        } else if (Opcion == 2) {
            
        	System.out.print("\nUsted selecciono jugar multijugador");
            for (i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    Jugador = "1 [O]";
                } else {
                    Jugador = "2 [X]";
                }
                do {
                    System.out.println("\nJUGADOR " + Jugador + "\nIngrese la posicion en la que quiere jugar");
                    do {
                        System.out.print("Fila:");
                        x = Entrada.nextInt();
                        if (x < 0 || x > 2) {
                            System.out.println("La fila ingresada es invalida, esta debe ser un numero de 0 a 2");
                        }
                    } while (x < 0 || x > 2);
                    do {
                        System.out.print("Columna:");
                        y = Entrada.nextInt();
                        if (y < 0 || y > 2) {
                            System.out.println("La columna ingresada es invalida, esta debe ser un numero de 0 a 2");
                        }
                    } while (y < 0 || y > 2);
                    System.out.print("\n");
                    if (Matriz[x][y] == 'O' || Matriz[x][y] == 'X') {
                        System.out.println("La posicion a jugar se encuentra ocupada, por favor intente otra posicion");
                    }
                } while (Matriz[x][y] == 'O' || Matriz[x][y] == 'X');
                if (i % 2 == 0) {
                    Matriz[x][y] = 'O';
                } else {
                    Matriz[x][y] = 'X';
                }
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {
                        System.out.print("[" + Matriz[x][y] + "]");
                    }
                    System.out.print("\n");
                }
                if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[0][1] && Matriz[0][1] == Matriz[0][2]) {
                    System.out.print("\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[1][1] && Matriz[1][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[0][0] == 'X' && Matriz[0][0] == Matriz[1][0] && Matriz[1][0] == Matriz[2][0]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[2][0] == 'X' && Matriz[2][0] == Matriz[2][1] && Matriz[2][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[2][0] == 'X' && Matriz[2][0] == Matriz[1][1] && Matriz[1][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[2][2] == 'X' && Matriz[2][2] == Matriz[1][2] && Matriz[1][2] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[1][0] == 'X' && Matriz[1][0] == Matriz[1][1] && Matriz[1][1] == Matriz[1][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                } else if (Matriz[0][1] == 'X' && Matriz[0][1] == Matriz[1][1] && Matriz[1][1] == Matriz[2][1]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 2 ");
                    i = 9;
                }
                if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[0][1] && Matriz[0][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[1][1] && Matriz[1][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][0] == 'O' && Matriz[0][0] == Matriz[1][0] && Matriz[1][0] == Matriz[2][0]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][0] == 'O' && Matriz[2][0] == Matriz[2][1] && Matriz[2][1] == Matriz[2][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][0] == 'O' && Matriz[2][0] == Matriz[1][1] && Matriz[1][1] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[2][2] == 'O' && Matriz[2][2] == Matriz[1][2] && Matriz[1][2] == Matriz[0][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[1][0] == 'O' && Matriz[1][0] == Matriz[1][1] && Matriz[1][1] == Matriz[1][2]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                } else if (Matriz[0][1] == 'O' && Matriz[0][1] == Matriz[1][1] && Matriz[1][1] == Matriz[2][1]) {
                    System.out.print("\n\n\tEl Ganador es el jugador 1 ");
                    i = 9;
                }
            }
        } else if (Opcion == 3) {
            System.out.print("\nUsted selecciono salir..."
                    + "\nAdios.");
        }
    }
}
