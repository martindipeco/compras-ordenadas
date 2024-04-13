package principal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //inicio scanner para pedir input de usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a las Compras Ordenadas");
        String opcion;

        do
        {
            System.out.println("Ingrese la opción deseada");
            System.out.println("a: suma");
            System.out.println("b: resta");
            System.out.println("c: multiplicación");
            System.out.println("d: división");
            System.out.println("e: salir");

            //convierto a minusculas por las dudas
            opcion = scanner.nextLine().toLowerCase();

            switch (opcion)
            {
                case "a":
                    sumar();
                    break;
                case "b":
                    restar();
                    break;
                case "c":
                    multiplicar();
                    break;
                case "d":
                    dividir();
                    break;
                case "e":
                    System.out.println("Gracias por utilizar el sistema");
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese de nuevo");
                    break;
            }
        }
        while (!"e".equals(opcion)); //metodo especial para comparar Stinngs
        scanner.close();
    }

    public static void sumar()
    {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        float numero = 0f;
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

    }
}