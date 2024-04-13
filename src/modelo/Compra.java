package modelo;

import java.time.LocalDateTime;
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
}
