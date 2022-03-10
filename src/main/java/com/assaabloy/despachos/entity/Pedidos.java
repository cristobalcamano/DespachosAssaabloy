package com.assaabloy.despachos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "pedidos")
public class Pedidos  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "orden_pedido")
    private String ordenPedido;
    @Column(name = "orden_venta")
    private String ordenVenta;
    @Column(name = "factura")
    private Integer factura;
    @Column(name = "referencia_compra")
    private String referenciaCompra;
    @Column(name = "canal_origen_compra")
    private  String canalOrigenCompra;
    @Column(name = "estado_pedido")
    private String estadoPedido;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    public Pedidos() {
    }

    public Pedidos(String ordenPedido, String ordenVenta, Integer factura, String referenciaCompra, String canalOrigenCompra, String estadoPedido, Date fechaCreacion) {
        this.ordenPedido = ordenPedido;
        this.ordenVenta = ordenVenta;
        this.factura = factura;
        this.referenciaCompra = referenciaCompra;
        this.canalOrigenCompra = canalOrigenCompra;
        this.estadoPedido = estadoPedido;
        this.fechaCreacion = fechaCreacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getCanalOrigenCompra() {
        return canalOrigenCompra;
    }

    public void setCanalOrigenCompra(String canalOrigenCompra) {
        this.canalOrigenCompra = canalOrigenCompra;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "id=" + id +
                ", ordenPedido='" + ordenPedido + '\'' +
                ", ordenVenta='" + ordenVenta + '\'' +
                ", factura=" + factura +
                ", referenciaCompra='" + referenciaCompra + '\'' +
                ", canalOrigenCompra='" + canalOrigenCompra + '\'' +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
