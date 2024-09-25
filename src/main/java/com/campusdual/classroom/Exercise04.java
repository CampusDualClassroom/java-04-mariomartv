package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");

        int sumaPrimera=5;
        System.out.println("Suma de los primeros 5 números: "+sumNum(sumaPrimera));

        int sumaPares=40;
        System.out.println("Suma de los primeros 20 números pares: "+sumEvenNum(sumaPares));

        int factorial=7;
        System.out.println("Obtén el factorial del número 7 → (7!): "+factorial(factorial));

        System.out.println("¿Suma de los primeros 5 números igual?: " + (sumNum(sumaPrimera) == (1 + 2 + 3 + 4 + 5)));
        System.out.println("¿Suma de los primeros 20 números pares igual?: " + (sumEvenNum(sumaPares) == (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40)));
        System.out.println("¿Factorial del número 7?" + (factorial(factorial) == (7 * 6 * 5 * 4 * 3 * 2 * 1)));

    }

    public static int sumNum(int num) {

        int suma=0;
        for(int i=1;i<=num;i++){
            suma=suma+i;
        }

        return suma;
    }

    public static int sumEvenNum(int num) {

        int suma = 0;
        int contador = 0;
        int numero =2;


        while (contador < num) {
            suma += numero;
            contador++;
            numero=numero+2;
        }

        return suma;
    }

    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        // Caso recursivo: n * factorial de n-1
        return num * factorial(num - 1);

    }
}
