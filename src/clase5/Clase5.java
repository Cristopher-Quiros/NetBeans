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
        
        while (true){
            
        System.out.println("What do you wanna do?: ");
        System.out.println("1. Vote");
        System.out.println("2. Report 1");
        System.out.println("3. Report 2");
        System.out.println("4. Report 3");
       
        


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
