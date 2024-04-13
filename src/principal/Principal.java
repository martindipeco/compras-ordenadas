package principal;

import modelo.Compra;
import modelo.Cuenta;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Principal {
    public static void main(String[] args) {

        //inicio scanner para pedir input de usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nBienvenido a las Compras Ordenadas");
        System.out.println("Ingrese la opción deseada");
        String opcion;

        //instancio cuenta para acceder a sus métodos
        Cuenta cuenta = new Cuenta();

        //instancio una compra para acceder a sus métodos
        Compra compra = new Compra();

        //TODO: seguir a partir de acá
        do
        {
            System.out.println("\na: muestra saldo");
            System.out.println("b: realiza nueva compra");
            System.out.println("c: historial de compras");
            System.out.println("x: salir");

            //convierto a minusculas por las dudas
            opcion = scanner.nextLine().toLowerCase();

            switch (opcion)
            {
                case "a":
                    cuenta.mostrarSaldo();
                    break;
                case "b":
                    //realiza nueva compra();
                    System.out.println("Ingrese el nombre del producto: ");
                    String producto = scanner.nextLine();
                    //TODO: validar que no se ingresen números
                    System.out.println("Ingrese el precio: ");
                    Double precio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el carácter de nueva línea pendiente

                    //el metodo responsable de chequear que tenga saldo esta en Cuenta
                    //TODO: chequear que sea numero
                    Compra nuevaCompra = new Compra(precio, producto);
                    //valido compra y agrego a la lista
                    cuenta.agregarCompra(nuevaCompra);
                    break;
                case "c":
                    //historial de compras();
                    // TODO: abre nuevo menu de opciones para ordenar x monto y fecha
                    cuenta.mostrarHistorial();
                    break;

                case "x":
                    System.out.println("Gracias por utilizar el sistema\n");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese de nuevo\n");
                    break;
            }
        }
        while (!"x".equals(opcion));
        scanner.close();
    }

//    public static void sumar()
//    {
//        Scanner scanner = new Scanner(System.in);
//        String opcion;
//        float numero;
//        float resultado = 0f;
//        do
//        {
//            System.out.println("Ingrese número a sumar, o 'e' para terminar la operación");
//            opcion = scanner.nextLine();
//            //bloque try catch para evitar que NO se ingrese un número
//            try
//            {
//                numero = Float.parseFloat(opcion);
//                resultado += numero; //voy acumulando hasta opcion "e"
//                System.out.println("resultado parcial = " + resultado);
//            }
//            catch (NumberFormatException e)
//            {
//                //si el catch se activó x la opción e, no hay que mostrar el mensaje
//                if (!"e".equals(opcion))
//                {
//                    System.out.println("El dato ingresado no es un número");
//                }
//            }
//        }
//        while (!"e".equals(opcion));
//        System.out.println("El resultado es = " + resultado);
//    }

}