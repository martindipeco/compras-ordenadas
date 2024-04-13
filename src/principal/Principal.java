package principal;

import modelo.Cuenta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {

        //inicio scanner para pedir input de usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a las Compras Ordenadas");
        System.out.println("Ingrese la opción deseada");
        String opcion;

        //instancio cuenta para acceder a sus métodos
        Cuenta cuenta = new Cuenta();

        //TODO: segir a partir de acá
        do
        {
            System.out.println("a: muestra saldo");
            System.out.println("b: realiza nueva compra");
            System.out.println("c: historial de compras");
            System.out.println("x: salir");

            //convierto a minusculas por las dudas
            opcion = scanner.nextLine().toLowerCase();

            switch (opcion)
            {
                case "a":
                    mostrarSaldo(cuenta);
                    break;
                case "b":
                    //realiza nueva compra();
                    break;
                case "c":
                    //historial de compras(); --abre nuevo menu de opciones
                    break;

                case "x":
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese de nuevo");
                    break;
            }
        }
        while (!"x".equals(opcion)); //metodo especial para comparar Stinngs
        scanner.close();
    }

    public static void sumar()
    {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        float numero;
        float resultado = 0f;
        do
        {
            System.out.println("Ingrese número a sumar, o 'e' para terminar la operación");
            opcion = scanner.nextLine();
            //bloque try catch para evitar que NO se ingrese un número
            try
            {
                numero = Float.parseFloat(opcion);
                resultado += numero; //voy acumulando hasta opcion "e"
                System.out.println("resultado parcial = " + resultado);
            }
            catch (NumberFormatException e)
            {
                //si el catch se activó x la opción e, no hay que mostrar el mensaje
                if (!"e".equals(opcion))
                {
                    System.out.println("El dato ingresado no es un número");
                }
            }
        }
        while (!"e".equals(opcion));
        System.out.println("El resultado es = " + resultado);
    }

    public static void mostrarSaldo(Cuenta cuenta)
    {
        System.out.println(cuenta.getSaldo());
    }
}