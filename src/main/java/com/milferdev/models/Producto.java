package com.milferdev.models;

public class Producto {
    // Atributos
    private int id;
    private String nombreProducto;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int cantidad;
    private int idProveedor;
    private int cantidadStock;

    // Constructores
    public Producto() {
    }

    public Producto(int id, String nombreProducto, String descripcion, double precioCompra, double precioVenta, int cantidad, int idProveedor, int cantidadStock) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.idProveedor = idProveedor;
        this.cantidadStock = cantidadStock;
    }

    //Metodos Getter
    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    //Metodos Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
