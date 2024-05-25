package clase5;

import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {
        menu();
    }
    
    public static void Sets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto juegos ha ganado usted?: ");
        int set1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Cuantos juegos ha ganado su rival?: ");
        int set2 = scanner.nextInt();
        
        if (set1 >= 6 && Math.abs(set1 - set2) >= 2) {
            System.out.println("Ganaste!");
        } else if (set2 >= 6 && Math.abs(set2 - set1) >= 2)  {
            System.out.println("El rival gano!");
        }

        if (set1 == set2) {
            System.out.println("Empate ");
            System.out.println("Quien crees que va a ganar?: ");
            System.out.println("1. Tu");
            System.out.println("2. El Rival");
            int op = scanner.nextInt();
            
            if (op == 1) {
                System.out.println("Has Ganado!");
            } else if (op == 2) {
                System.out.println("El rival gano!");
            } 
        }

        if (set1 < 6 && set2 < 6) {
            System.out.println("El set aun no ha terminado");
        } 
    }
    
public static void Vote() {
    Scanner scanner = new Scanner(System.in);

    // Declaración de variables para los votos y la edad
    int votosAlajuela = 0;
    int votosHeredia = 0;
    int votosSanJose = 0;
    int votosCartago = 0;
    int votosLimon = 0;
    int votosPuntarenas = 0;
    int votosGuanacaste = 0;
    int CristoRey = 0;
    int Buda = 0;
    int Rihanna = 0;
    int between18and29 = 0;
    int between30and59 = 0;
    int older60 = 0;

    while (true) {
        System.out.println("Que desea hacer?: ");
        System.out.println("1. Votar");
        System.out.println("2. Reporte 1");
        System.out.println("3. Reporte 2");
        System.out.println("4. Reporte 3");

        int opc = scanner.nextInt();
        scanner.nextLine();

        switch (opc) {
            case 1:
                System.out.println("Que edad tiene?: ");
                int edad = scanner.nextInt();

                if (edad < 18) {
                    System.out.println("No es mayor de edad, todavía no puede votar");
                } else {
                    System.out.println("De qué provincia es?: ");
                    System.out.println("1. Alajuela");
                    System.out.println("2. Heredia");
                    System.out.println("3. San Jose");
                    System.out.println("4. Cartago");
                    System.out.println("5. Limon");
                    System.out.println("6. Puntarenas");
                    System.out.println("7. Guanacaste");

                    int opcionProvincia = scanner.nextInt();

                    switch (opcionProvincia) {
                        case 1:
                            votosAlajuela++;
                            System.out.println("Voto registrado por Alajuela!");
                            break;
                        case 2:
                            votosHeredia++;
                            System.out.println("Voto registrado por Heredia!");
                            break;
                        case 3:
                            votosSanJose++;
                            System.out.println("Voto registrado por San José!");
                            break;
                        case 4:
                            votosCartago++;
                            System.out.println("Voto registrado por Cartago!");
                            break;
                        case 5:
                            votosLimon++;
                            System.out.println("Voto registrado por Limón!");
                            break;
                        case 6:
                            votosPuntarenas++;
                            System.out.println("Voto registrado por Puntarenas!");
                            break;
                        case 7:
                            votosGuanacaste++;
                            System.out.println("Voto registrado por Guanacaste!");
                            break;
                        default:
                            System.out.println("Opción de provincia inválida");
                            break;
                    }

                    if (opcionProvincia >= 1 && opcionProvincia <= 7) {
                        System.out.println("Seleccione su candidato.");
                        System.out.println("1. Cristo Rey");
                        System.out.println("2. Buda");
                        System.out.println("3. Rihanna");

                        int opcionCandidatos = scanner.nextInt();

                        switch (opcionCandidatos) {
                            case 1:
                                CristoRey++;
                                System.out.println("Cristo Rey es grande!");
                                break;
                            case 2:
                                Buda++;
                                System.out.println("Viva Buda SUUU!");
                                break;
                            case 3:
                                Rihanna++;
                                System.out.println("RIHANNA GOD");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }

                    // Registra la edad en el rango correspondiente
                    if (edad >= 18 && edad <= 29) {
                        between18and29++;
                    } else if (edad >= 30 && edad <= 59) {
                        between30and59++;
                    } else {
                        older60++;
                    }
                }
                break;
            case 2:
                // Imprime los reportes
                System.out.println("Cantidad de votos de los candidatos");
                System.out.println("Votos a favor de Cristo Rey: " + CristoRey);
                System.out.println("Votos a favor de Buda: " + Buda);
                System.out.println("Votos a favor de Rihanna: " + Rihanna);
                break;
            case 3:
                System.out.println("Cantidad de votos por provincia en orden ascendente");
                System.out.println("Alajuela: " + votosAlajuela);
                System.out.println("Heredia: " + votosHeredia);
                System.out.println("San Jose: " + votosSanJose);
                System.out.println("Cartago: " + votosCartago);
                System.out.println("Limon: " + votosLimon);
                System.out.println("Puntarenas: " + votosPuntarenas);
                System.out.println("Guanacaste: " + votosGuanacaste);
                break;
            case 4:
                System.out.println("Cantidad de votos en un rango de edad");
                System.out.println("Votos de 18 - 29: " + between18and29);
                System.out.println("Votos de 30 - 59 " + between30and59);
                System.out.println("Votos de 60+: " + older60);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}

    
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Principal");
            System.out.println("1 > Sets");
            System.out.println("2 > Votar");

            int opcionSelec = scan.nextInt();

            switch (opcionSelec) {
                case 1:
                    Sets();
                    break;
                    
                case 2:
                    Vote();
                    break;
                    
                case 3:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }
        }
    }
}
