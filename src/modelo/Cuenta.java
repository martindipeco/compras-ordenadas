package modelo;

import java.util.ArrayList;
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
        System.out.println("El saldo de la cuenta de " + this.titular + " es " + this.getSaldo() +"\n");
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
}
