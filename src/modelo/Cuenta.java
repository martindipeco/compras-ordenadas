package modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Cuenta {

    private String titular;
    private double saldo;
    private List<Compra> listaCompras = new ArrayList<>();

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta()
    {
        this.titular = "Fulanito Cosme";
        this.saldo = 1000;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public List<Compra> getListaCompras()
    {
        return this.listaCompras;
    }

    public void mostrarSaldo()
    {
        System.out.println("\nEl saldo de la cuenta de " + this.titular + " es " + this.getSaldo());
    }

    public void agregarCompra(Compra compra)
    {
        if (this.saldo < compra.getMonto())
        {
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo-= compra.getMonto();
        listaCompras.add(compra);
    }

    public void mostrarHistorial()
    {
        for (Compra item: listaCompras)
        {
            System.out.println("Compra por " + item);
        }
    }
//
//    In Java, the expression `listaCompras.sort(Comparator.comparing(Compra::getNombreProducto));` utilizes a static method `Comparator.comparing()` from the `Comparator` interface to create a comparator based on the specified key extractor function (`Compra::getNombreProducto`). This method returns a comparator that compares elements based on the result of applying the given key extractor function to the elements.
//
//    You don't need to explicitly implement the `Comparator` interface because you're using a method provided by the interface itself, rather than implementing the interface directly. This is a feature introduced in Java 8 called "lambda expressions" or "method references", which allow for more concise code when working with functional interfaces (interfaces with a single abstract method, like `Comparator`).
//
//    So, instead of implementing the `Comparator` interface yourself, you're using a static method `Comparator.comparing()` which internally handles the implementation details, and you're providing a method reference (`Compra::getNombreProducto`) to specify the key for comparison. This makes your code shorter and more readable.

    public void ordenaPorNombre()
    {
        listaCompras.sort(Comparator.comparing(Compra::getNombreProducto));
    }

    public void ordenaPorNombreDescendente()
    {
        listaCompras.sort(Comparator.comparing(Compra::getNombreProducto).reversed());
    }

    public void ordenaPorMonto()
    {
        listaCompras.sort(Comparator.comparing(Compra::getMonto));
    }

    public void ordenaPorMontoDescendente()
    {
        listaCompras.sort(Comparator.comparing(Compra::getMonto).reversed());
    }

    public void ordenaPorFecha()
    {
        listaCompras.sort(Comparator.comparing(Compra::getFechaCompra));
    }

    public void ordenaPorFechaDescendente()
    {
        listaCompras.sort(Comparator.comparing(Compra::getFechaCompra).reversed());
    }
}
