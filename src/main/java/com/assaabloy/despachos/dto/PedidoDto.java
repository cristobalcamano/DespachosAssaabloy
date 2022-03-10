package com.assaabloy.despachos.dto;

import java.util.Date;

public class PedidoDto {

    private String id;
    private  String canalOrigenCompra;
    private  String estadoPedido;
    private  String referenciaCompra;
    private Integer factura;
    private  String ordenPedido;
    private  String ordenVenta;
    private Date fechaCreacion;
    private RespuestaDto respuestaDto;

    public PedidoDto() {
    }

    public PedidoDto(String canalOrigenCompra, String estadoPedido, String referenciaCompra, Integer factura, String ordenPedido, String ordenVenta, Date fechaCreacion, RespuestaDto respuestaDto) {
        this.canalOrigenCompra = canalOrigenCompra;
        this.estadoPedido = estadoPedido;
        this.referenciaCompra = referenciaCompra;
        this.factura = factura;
        this.ordenPedido = ordenPedido;
        this.ordenVenta = ordenVenta;
        this.fechaCreacion = fechaCreacion;
        this.respuestaDto = respuestaDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getReferenciaCompra() {
        return referenciaCompra;
    }

    public void setReferenciaCompra(String referenciaCompra) {
        this.referenciaCompra = referenciaCompra;
    }

    public Integer getFactura() {
        return factura;
    }

    public void setFactura(Integer factura) {
        this.factura = factura;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public RespuestaDto getRespuestaDto() {
        return respuestaDto;
    }

    public void setRespuestaDto(RespuestaDto respuestaDto) {
        this.respuestaDto = respuestaDto;
    }
}
