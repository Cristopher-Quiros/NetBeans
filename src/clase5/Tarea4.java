/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Tarea4 {
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
   /* Definir una función que inserte en una estructura de datos de tipo lista números aleatorios.
    Luego , recorrer la estructura de datos y por cada número par cambiarlo por un símbolo de dólar($)
    y por cada número impar cambiarlo por un símbolo numeral (#). Imprimir tanto la estructura de datos
    con los números generados aleatoriamente 
    como la estructura con los símbolos para ver los resultados. */
    

    
    public static void Listas() {
        
        Random numbers = new Random();
        
        int max = 100;
        int min = 0;
        
        
        ArrayList<Integer> numerosRandom = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = numbers.nextInt(max - min) + min;
            numerosRandom.add(numeroAleatorio);
 
        }
        
        System.out.println("Numeros aleatorios: ");
        for (int numero : numerosRandom) {

            if (numero % 2 == 0) {   
                System.out.println(numero + ":$");
            } else {
                System.out.println(numero +":#");
            }
        } 
        
    }
    
    public static void Diccionarios() {
        Random numbers = new Random();

        int max = 100; // Máximo exclusivo
        int min = 1;   // Mínimo inclusivo

        Map<Integer, Character> numerosRandom = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = numbers.nextInt(max - min) + min;
            char simbolo = (numeroAleatorio % 2 == 0) ? '$' : '#';
            numerosRandom.put(numeroAleatorio, simbolo);
        }

        System.out.println("Diccionario con números aleatorios y símbolos:");
        for (Map.Entry<Integer, Character> entry : numerosRandom.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static void Temperaturas() {
        Scanner scanner = new Scanner(System.in);
        
        // Generar las temperaturas aleatorias
        float[][] temperatura = generarTemperaturas();
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        // Menú
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar temperaturas de la semana");
            System.out.println("2. Mostrar temperaturas mínimas y máximas de cada semana");
            System.out.println("3. Mostrar promedio de temperatura de cada semana");
            System.out.println("4. Mostrar temperatura más alta del mes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    imprimirTemperaturas(temperatura, diasSemana);
                    break;
                case 2:
                    imprimirMinMaxSemana(temperatura, diasSemana);
                    break;
                case 3:
                    imprimirPromedioSemana(temperatura);
                    break;
                case 4:
                    imprimirMaxTempMes(temperatura, diasSemana);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }

    public static float[][] generarTemperaturas() {
        float[][] temperatura = new float[4][7];
        Random random = new Random();

        for (int f = 0; f < temperatura.length; f++) {
            for (int c = 0; c < temperatura[f].length; c++) {
                temperatura[f][c] = random.nextInt(33) + 7; // Rango de temperatura ajustado
            }
        }

        return temperatura;
    }

    public static void imprimirTemperaturas(float[][] temperatura, String[] diasSemana) {
        System.out.println("Calendario de Temperaturas - Febrero");
        System.out.println("=====================================");
        for (int f = 0; f < temperatura.length; f++) {
            System.out.println("Semana " + (f + 1) + ":");
            for (int c = 0; c < temperatura[f].length; c++) {
                // Cambiar el color de la temperatura mínima a azul y de la máxima a rojo
                if (temperatura[f][c] == getMinTemperaturaSemana(temperatura[f])) {
                    System.out.printf("\033[34m%s: %.1f°C   \033[0m", diasSemana[c], temperatura[f][c]);
                } else if (temperatura[f][c] == getMaxTemperaturaSemana(temperatura[f])) {
                    System.out.printf("\033[31m%s: %.1f°C   \033[0m", diasSemana[c], temperatura[f][c]);
                } else {
                    System.out.printf("%s: %.1f°C   ", diasSemana[c], temperatura[f][c]);
                }
            }
            System.out.println(); // Saltar a la siguiente línea para la siguiente semana
        }
    }

    public static float getMinTemperaturaSemana(float[] semana) {
        float min = semana[0];
        for (float temp : semana) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static float getMaxTemperaturaSemana(float[] semana) {
        float max = semana[0];
        for (float temp : semana) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static void imprimirMinMaxSemana(float[][] temperatura, String[] diasSemana) {
        System.out.println("\nA. Temperaturas Mínimas y Máximas de Cada Semana");
        System.out.println("=================================================");
        for (int f = 0; f < temperatura.length; f++) {
            float min = temperatura[f][0];
            float max = temperatura[f][0];
            int indiceMin = 0;
            int indiceMax = 0;
            for (int c = 1; c < temperatura[f].length; c++) {
                if (temperatura[f][c] < min) {
                    min = temperatura[f][c];
                    indiceMin = c;
                }
                if (temperatura[f][c] > max) {
                    max = temperatura[f][c];
                    indiceMax = c;
                }
            }
            System.out.printf("Semana %d: Temperatura Mínima = %.1f°C ( %s ), Temperatura Máxima = %.1f°C ( %s )%n",
                    f + 1, min, diasSemana[indiceMin], max, diasSemana[indiceMax]);
        }

    }

    public static void imprimirPromedioSemana(float[][] temperatura) {
        System.out.println("\nB. Promedio de Temperaturas de Cada Semana");
        System.out.println("=========================================");
        for (int f = 0; f < temperatura.length; f++) {
            float sum = 0;
            for (float temp : temperatura[f]) {
                sum += temp;
            }
            float promedio = sum / temperatura[f].length;
            System.out.printf("En la semana %d el promedio de temperatura es de %.1f°C%n", f + 1, promedio);
        }
    }

    public static void imprimirMaxTempMes(float[][] temperatura, String[] diasSemana) {
        System.out.println("\nC. Temperatura Más Alta del Mes");
        System.out.println("===============================");
        float maxTemp = temperatura[0][0];
        int semanaMax = 0;
        int diaMax = 0;
        for (int f = 0; f < temperatura.length; f++) {
            for (int c = 0; c < temperatura[f].length; c++) {
                if (temperatura[f][c] > maxTemp) {
                    maxTemp = temperatura[f][c];
                    semanaMax = f;
                    diaMax = c;
                }
            }
        }
        System.out.printf("La temperatura más alta del mes es en la semana %d el día %s con una temperatura de %.1f°C.%n",
                semanaMax + 1, diasSemana[diaMax], maxTemp);
    }

    

    
    
    
    public static void menu() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Menu Principal");
            System.out.println("1 > Numeros aleatorio en Listas");
            System.out.println("2 > Numeros aleatorios en Diccionarios");
            System.out.println("3 > Temperaturas");
            System.out.println("4 > Salir");

            int opcionSelec = scan.nextInt();

            switch (opcionSelec) {
                case 1:
                    Listas();
                    break;

                case 2:
                    Diccionarios();
  
                    break;

                case 3:
                    Temperaturas();
                    break;
                    
                case 4:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                    
               default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
                    

            }
        }
    } 
}
