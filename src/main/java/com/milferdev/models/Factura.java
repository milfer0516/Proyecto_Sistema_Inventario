package com.milferdev.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    //Atributos
    private static int contadorIds = 1;
    private int id; // numero consecutivo
    private Date fecha;
    private String cedulaCliente;
    private double impuesto;
    private double total;
    private List<Integer> idsProductos;

    // Constructores
    public Factura() {
        id = contadorIds;
        contadorIds++;
        idsProductos = new ArrayList<>();
    }
    public Factura(String cedulaCliente, double impuesto) {
        this(); // al usar el this aca se esta haciendo el llamado al constructor vacio y sus parametros
        fecha = new Date();
        this.cedulaCliente = cedulaCliente;
        this.impuesto = impuesto;
    }

    // Metodos Getter
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }

    // Metodos Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //Metodo para generar una lista de los productos
    public void agregarIdProducto(int idProducto){
        this.idsProductos.add(idProducto);
    }

    //Metodo para obtener toda la lista de los prodcutos
    public Integer[] getIdsProductos() {
        Integer[] idsProductosCopia = new Integer[idsProductos.size()];
        idsProductos.toArray(idsProductosCopia);

        return idsProductosCopia;
    }
}
