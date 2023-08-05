import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
//        exercise8();
//        exercise9();
//        exercise10();
//        exercise11();
//        exercise12();
//        exercise13();


    }

    public static void exercise1() {
        System.out.println("\nExercise 1");

        String nombre = "Manuel";
        String apellido = "Dominguez";
        int edad = 23;

        System.out.println("\nMi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años de edad.");
    }

    public static void exercise2() {
        System.out.println("\nExercise 2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("\nEl número mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\nEl número mayor es: " + num2);
        } else {
            System.out.println("\nEl número mayor es: " + num3);
        }
    }

    public static void exercise3() {
        System.out.println("\nExercise 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese un número y te diré su paridad: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("\nEl número " + num + " es par.");
        } else {
            System.out.println("\nEl número " + num + " es impar.");
        }
    }

    public static void exercise4() {
        System.out.println("\nExercise 4");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primer palabra: ");
        String palabra1 = scanner.next();

        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = scanner.next();

        if (Objects.equals(palabra1, palabra2)) {
            System.out.println("\nAmbas palabras son iguales.");
        } else {
            System.out.println("\nLas palabras son distintas.");
        }
    }

    public static void exercise5() {
        System.out.println("\nExercise 5");

        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numeros = new ArrayList<>();

        int numero;

        System.out.println("Ingrese números (0 para terminar): ");
        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }

        for (int e : numeros) {
            System.out.println("-> " + e);
        }
    }

    public static void exercise6() {
        System.out.println("\nExercise 6");

        System.out.println("\nBienvenidos a la grieta del invocador!");
    }

    public static void exercise7() {
        System.out.println("\nExercise 7");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese un número y te diré su paridad: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("\nEl número " + numero + " es par.");
        } else {
            System.out.println("\nEl número " + numero + " es impar.");
        }
    }

    public static void exercise8() {
        System.out.println("\nExercise 8");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese un número y te diré si es primo: ");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("\n" + numero + " es un número primo.");
        } else {
            System.out.println("\n" + numero + " no es un número primo.");
        }
    }

    public static void exercise9() {
        System.out.println("\nExercise 9");

        Scanner scanner = new Scanner(System.in);
        Collection<Integer> numeros = new ArrayList<>();

        int numero;

        System.out.println("\nIngrese números (0 para finalizar): ");
        while ((numero = scanner.nextInt()) != 0) {
            if (esImpar(numero)) {
                numeros.add(numero);
            }
        }

        int sumaImpares = sumaNumerosCollection(numeros);
        System.out.println("\nLa suma de los números impares es: " + sumaImpares);
    }

    public static void exercise10() {
        System.out.println("\nExercise 10");

        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numeros = new ArrayList<>();

        int numero;

        System.out.println("\nIngrese números (0 para finalizar): ");

        while ((numero = scanner.nextInt()) != 0) {
            numeros.add(numero);
        }

        System.out.println("\nLos números ingresados son: " + numeros);

        Collection<Integer> numerosPares = soloPares(numeros);

        System.out.println("\nLos números pares son: " + numerosPares);

        Collection<Integer> numerosPrimos = soloPrimos(numeros);

        System.out.println("\nLos números primos son: " + numerosPrimos);

        System.out.println("\nLa suma de los números primos es: " + sumaNumerosCollection(numerosPrimos));
    }

    public static boolean esPar(int numero) {

        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {

        return numero % 2 != 0;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static Collection<Integer> soloPares(Collection<Integer> numeros) {
        Collection<Integer> numerosPares = new ArrayList<>();

        for (int numero : numeros) {
            if (esPar(numero)) {
                numerosPares.add(numero);
            }
        }

        return numerosPares;
    }

    public static Collection<Integer> soloPrimos(Collection<Integer> numeros) {
        Collection<Integer> numerosPrimos = new ArrayList<>();

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                numerosPrimos.add(numero);
            }
        }

        return numerosPrimos;
    }

    public static int sumaNumerosCollection(Collection<Integer> numeros) {
        int sumaNumeros = 0;

        for (int numero : numeros) {
            sumaNumeros += numero;
        }

        return sumaNumeros;
    }

    public static void exercise11() {

        System.out.println("<< CALCULADORA >>");
        System.out.println("1 -> Suma");
        System.out.println("2 -> Resta");
        System.out.println("3 -> Multiplicación");
        System.out.println("4 -> División");
        System.out.println("0 -> Salir");
        System.out.print("Elija una opción: ");
    }

    public static void exercise12() {
        System.out.println("\nExercise 12");

        Scanner scanner = new Scanner(System.in);

        int eleccion;
        do {
            exercise11();
            eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 0:
                    System.out.println("Finalizando programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (eleccion != 0);

        scanner.close();
    }

    public static void sumar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int num2 = scanner.nextInt();

        System.out.println("Los números ingresados son: " + num1 + " y " + num2);

        int resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void restar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int num2 = scanner.nextInt();

        System.out.println("Los números ingresados son: " + num1 + " y " + num2);

        int resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void multiplicar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un número: ");
        int num2 = scanner.nextInt();

        System.out.println("Los números ingresados son: " + num1 + " y " + num2);

        int resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void dividir() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese un número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Los números ingresados son: " + num1 + " y " + num2);

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }

    public static void exercise13() {
        System.out.println("\nExercise 13");

        Scanner scanner = new Scanner(System.in);
        int capacidadMaxima = 500;
        int capacidadActual = 0;
        int dineroRecaudado = 0;

        while (true) {
            System.out.println("<< MAD CLUB >>");
            System.out.println("1 -> Ingreso de datos");
            System.out.println("2 -> Capacidad disponible");
            System.out.println("3 -> Dinero recaudado");
            System.out.println("4 -> Salir del sistema");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("<< Ingreso de datos >>");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("DNI: ");
                    int dni = scanner.nextInt();
                    System.out.print("Pase (normal, vip o descuento): ");
                    String pase = scanner.next();

                    if (edad >= 21) {
                        boolean ingresoGratis = false;
                        int valorEntrada = 0;

                        if (pase.equalsIgnoreCase("vip")) {
                            ingresoGratis = true;
                        } else if (pase.equalsIgnoreCase("descuento")) {
                            valorEntrada = 750; // Mitad del valor normal
                        } else {
                            valorEntrada = 1500; // Valor normal
                        }

                        if (!ingresoGratis) {
                            System.out.println("<< Cobro de entrada >>");
                            System.out.println("1. Entrada normal ($1500)");
                            System.out.println("2. Entrada VIP ($2000)");
                            System.out.print("Ingrese una opción: ");
                            int opcionEntrada = scanner.nextInt();

                            if (opcionEntrada == 2) {
                                valorEntrada = 2000;
                            }
                        }

                        capacidadActual++;
                        dineroRecaudado += valorEntrada;
                        System.out.println("Welcome " + nombre + "!");
                    } else {
                        System.out.println("Only +21.");
                    }

                    break;
                case 2:
                    int capacidadDisponible = capacidadMaxima - capacidadActual;
                    System.out.println("Capacidad disponible: " + capacidadDisponible + " personas");
                    break;
                case 3:
                    System.out.println("Dinero recaudado: $" + dineroRecaudado);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

}

