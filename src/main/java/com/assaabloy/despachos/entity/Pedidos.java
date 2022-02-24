package com.assaabloy.despachos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "pedidos")
public class Pedidos  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "orden_pedido")
    private String ordenPedido;
    @Column(name = "orden_venta")
    private String ordenVenta;
    @Column(name = "factura")
    private Integer factura;
    @Column(name = "referencia_compra")
    private String referenciaCompra;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    public Pedidos() {
    }

    public Pedidos(String ordenPedido, String ordenVenta, Integer factura, String referenciaCompra, Date fechaCreacion) {
        this.ordenPedido = ordenPedido;
        this.ordenVenta = ordenVenta;
        this.factura = factura;
        this.referenciaCompra = referenciaCompra;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdenPedido() {
        return ordenPedido;
    }

    public void setOrdenPedido(String ordenPedido) {
        this.ordenPedido = ordenPedido;
    }

    public String getOrdenVenta() {
        return ordenVenta;
    }

    public void setOrdenVenta(String ordenVenta) {
        this.ordenVenta = ordenVenta;
    }

    public Integer getFactura() {
        return factura;
    }

    public void setFactura(Integer factura) {
        this.factura = factura;
    }

    public String getReferenciaCompra() {
        return referenciaCompra;
    }

    public void setReferenciaCompra(String referenciaCompra) {
        this.referenciaCompra = referenciaCompra;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", ordenPedido='" + ordenPedido + '\'' +
                ", ordenVenta='" + ordenVenta + '\'' +
                ", factura=" + factura +
                ", referenciaCompra='" + referenciaCompra + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
