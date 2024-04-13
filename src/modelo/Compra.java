package modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Compra {

    private double monto;
    private String nombreProducto;
    private LocalDateTime fechaCompra;

    public Compra(double monto, String nombreProducto, LocalDateTime fechaCompra) {
        this.monto = monto;
        this.nombreProducto = nombreProducto;
        this.fechaCompra = fechaCompra;
    }

    public Compra(double monto, String nombreProducto){
        this.monto = monto;
        this.nombreProducto = nombreProducto;
        this.fechaCompra = LocalDateTime.now();
    }

    public Compra() { }

    public Double getMonto()
    {
        return this.monto;
    }

    @Override
    public String toString()
    {
        return "Monto: " + monto + ", Producto: " + nombreProducto + ", fecha: " + fechaCompra.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) ;
    }
}
