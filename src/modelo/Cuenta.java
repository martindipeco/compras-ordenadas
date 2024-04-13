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

    public void mostrarSaldo()
    {
        System.out.println(this.getSaldo());
    }
}
