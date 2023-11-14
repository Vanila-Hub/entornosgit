package main;

import java.util.Scanner;

/**
 * Esta clase representa una calculadora simple que realiza operaciones de suma,
 * resta, multiplicación y división.
 * 
 * @author jurretabizkaia
 * @since 2023-10-16 
 * @version 1.0
 * 
 */

// @deprecated indica que la clase/método está deprecado, y por tanto a funturo
//no se le va a dar soporte. Como podeis ver, nos tacha encima la clase.
public class Calculadora {


    /**isudhholappoopo
     * Método principal que interactúa con el usuario y permite realizar cálculos.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("Elija una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
	
    /**
     * Realiza la operación de suma.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El resultado de la suma.
     * @hidden sólo para indicar que a esta clase no se debe acceder desde programas externos.
     */
    public static double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la operación de resta.
     *
     * @param a El número del que se resta.
     * @param b El número a restar.
     * @return El resultado de la resta.
     */
    public static double restar(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la operación de multiplicación.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El resultado de la multiplicación.
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la operación de división.
     *
     * @param a El número del que se divide.
     * @param b El divisor.
     * @return El resultado de la división.
     * @throws ArithmeticException Si se intenta dividir por cero
     */
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

}

