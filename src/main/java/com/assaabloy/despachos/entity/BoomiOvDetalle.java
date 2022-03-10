package com.assaabloy.despachos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Boomi_OvDetalle")
public class BoomiOvDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "IdPedidoDet")
    private String idPedidoDet;
    @Column(name = "OrdenDeVenta")
    private  String ordenVenta;
    @Column(name = "CodUbicacion")
    private String codUbicacion;
    @Column(name = "EmbarcaA")
    private String embarcaA;
    @Column(name = "Sku")
    private String sku;
    @Column(name = "Almacen")
    private String almcen;
    @Column(name = "Linea")
    private Integer linea;
    @Column(name = "DescripcionSku")
    private String descripcionSku;
    @Column(name = "UnidadMedida")
    private String unidadMedida;
    @Column(name = "Gravable")
    private long gravable;
    @Column(name = "PrecioUnitarioFinal")
    private BigDecimal precioUnitarioFinal;
    @Column(name = "PrecioCliente")
    private BigDecimal precioCliente;
    @Column(name = "CantidadOrdenada")
    private BigDecimal cantidadOrdenada;
    @Column(name = "CantidadPendiente")
    private BigDecimal cantidadPendiente;
    @Column(name = "CantidadFacturado")
    private BigDecimal cantidadFacturado;
    @Column(name = "CantidadRemisionado")
    private BigDecimal cantidadRemisionado;
    @Column(name = "CausaDevolucion")
    private String causaDevolucion;
    @Column(name = "DiagnosticoDevolucion")
    private String diagnosticoDevolucion;
    @Column(name = "FechaModificacion")
    private LocalDateTime fechaMdodificacion;
    @Column(name = "DescuentoComercial")
    private BigDecimal descuentoComercial;
    @Column(name = "DescuentoPromocion")
    private BigDecimal descuentoPromocion;
    @Column(name = "DescuentoNegociacionEspecial")
    private BigDecimal descuentoNegociacionEspecial;
    @Column(name = "FechaSolicitud")
    private LocalDateTime fechaSolicitud;
    @Column(name = "FechaSync")
    private LocalDateTime fechaSync;
    @Column(name = "UsuarioIntegracion")
    private String usuarioIntegracion;

    public BoomiOvDetalle() {
    }

    public BoomiOvDetalle(String ordenVenta, String codUbicacion, String embarcaA, String sku, String almcen, Integer linea, String descripcionSku, String unidadMedida, long gravable, BigDecimal precioUnitarioFinal, BigDecimal precioCliente, BigDecimal cantidadOrdenada, BigDecimal cantidadPendiente, BigDecimal cantidadFacturado, BigDecimal cantidadRemisionado, String causaDevolucion, String diagnosticoDevolucion, LocalDateTime fechaMdodificacion, BigDecimal descuentoComercial, BigDecimal descuentoPromocion, BigDecimal descuentoNegociacionEspecial, LocalDateTime fechaSolicitud, LocalDateTime fechaSync, String usuarioIntegracion) {
        this.ordenVenta = ordenVenta;
        this.codUbicacion = codUbicacion;
        this.embarcaA = embarcaA;
        this.sku = sku;
        this.almcen = almcen;
        this.linea = linea;
        this.descripcionSku = descripcionSku;
        this.unidadMedida = unidadMedida;
        this.gravable = gravable;
        this.precioUnitarioFinal = precioUnitarioFinal;
        this.precioCliente = precioCliente;
        this.cantidadOrdenada = cantidadOrdenada;
        this.cantidadPendiente = cantidadPendiente;
        this.cantidadFacturado = cantidadFacturado;
        this.cantidadRemisionado = cantidadRemisionado;
        this.causaDevolucion = causaDevolucion;
        this.diagnosticoDevolucion = diagnosticoDevolucion;
        this.fechaMdodificacion = fechaMdodificacion;
        this.descuentoComercial = descuentoComercial;
        this.descuentoPromocion = descuentoPromocion;
        this.descuentoNegociacionEspecial = descuentoNegociacionEspecial;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaSync = fechaSync;
        this.usuarioIntegracion = usuarioIntegracion;
    }

    public String getIdPedidoDet() {
        return idPedidoDet;
    }

    public void setIdPedidoDet(String idPedidoDet) {
        this.idPedidoDet = idPedidoDet;
    }

    public String getOrdenVenta() {
        return ordenVenta;
    }

    public void setOrdenVenta(String ordenVenta) {
        this.ordenVenta = ordenVenta;
    }

    public String getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public String getEmbarcaA() {
        return embarcaA;
    }

    public void setEmbarcaA(String embarcaA) {
        this.embarcaA = embarcaA;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAlmcen() {
        return almcen;
    }

    public void setAlmcen(String almcen) {
        this.almcen = almcen;
    }

    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public String getDescripcionSku() {
        return descripcionSku;
    }

    public void setDescripcionSku(String descripcionSku) {
        this.descripcionSku = descripcionSku;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public long getGravable() {
        return gravable;
    }

    public void setGravable(long gravable) {
        this.gravable = gravable;
    }

    public BigDecimal getPrecioUnitarioFinal() {
        return precioUnitarioFinal;
    }

    public void setPrecioUnitarioFinal(BigDecimal precioUnitarioFinal) {
        this.precioUnitarioFinal = precioUnitarioFinal;
    }

    public BigDecimal getPrecioCliente() {
        return precioCliente;
    }

    public void setPrecioCliente(BigDecimal precioCliente) {
        this.precioCliente = precioCliente;
    }

    public BigDecimal getCantidadOrdenada() {
        return cantidadOrdenada;
    }

    public void setCantidadOrdenada(BigDecimal cantidadOrdenada) {
        this.cantidadOrdenada = cantidadOrdenada;
    }

    public BigDecimal getCantidadPendiente() {
        return cantidadPendiente;
    }

    public void setCantidadPendiente(BigDecimal cantidadPendiente) {
        this.cantidadPendiente = cantidadPendiente;
    }

    public BigDecimal getCantidadFacturado() {
        return cantidadFacturado;
    }

    public void setCantidadFacturado(BigDecimal cantidadFacturado) {
        this.cantidadFacturado = cantidadFacturado;
    }

    public BigDecimal getCantidadRemisionado() {
        return cantidadRemisionado;
    }

    public void setCantidadRemisionado(BigDecimal cantidadRemisionado) {
        this.cantidadRemisionado = cantidadRemisionado;
    }

    public String getCausaDevolucion() {
        return causaDevolucion;
    }

    public void setCausaDevolucion(String causaDevolucion) {
        this.causaDevolucion = causaDevolucion;
    }

    public String getDiagnosticoDevolucion() {
        return diagnosticoDevolucion;
    }

    public void setDiagnosticoDevolucion(String diagnosticoDevolucion) {
        this.diagnosticoDevolucion = diagnosticoDevolucion;
    }

    public LocalDateTime getFechaMdodificacion() {
        return fechaMdodificacion;
    }

    public void setFechaMdodificacion(LocalDateTime fechaMdodificacion) {
        this.fechaMdodificacion = fechaMdodificacion;
    }

    public BigDecimal getDescuentoComercial() {
        return descuentoComercial;
    }

    public void setDescuentoComercial(BigDecimal descuentoComercial) {
        this.descuentoComercial = descuentoComercial;
    }

    public BigDecimal getDescuentoPromocion() {
        return descuentoPromocion;
    }

    public void setDescuentoPromocion(BigDecimal descuentoPromocion) {
        this.descuentoPromocion = descuentoPromocion;
    }

    public BigDecimal getDescuentoNegociacionEspecial() {
        return descuentoNegociacionEspecial;
    }

    public void setDescuentoNegociacionEspecial(BigDecimal descuentoNegociacionEspecial) {
        this.descuentoNegociacionEspecial = descuentoNegociacionEspecial;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDateTime getFechaSync() {
        return fechaSync;
    }

    public void setFechaSync(LocalDateTime fechaSync) {
        this.fechaSync = fechaSync;
    }

    public String getUsuarioIntegracion() {
        return usuarioIntegracion;
    }

    public void setUsuarioIntegracion(String usuarioIntegracion) {
        this.usuarioIntegracion = usuarioIntegracion;
    }

    @Override
    public String toString() {
        return "BoomiOvDetalle{" +
                "idPedidoDet='" + idPedidoDet + '\'' +
                ", ordenVenta='" + ordenVenta + '\'' +
                ", codUbicacion='" + codUbicacion + '\'' +
                ", embarcaA='" + embarcaA + '\'' +
                ", sku='" + sku + '\'' +
                ", almcen='" + almcen + '\'' +
                ", linea=" + linea +
                ", descripcionSku='" + descripcionSku + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", gravable=" + gravable +
                ", precioUnitarioFinal=" + precioUnitarioFinal +
                ", precioCliente=" + precioCliente +
                ", cantidadOrdenada=" + cantidadOrdenada +
                ", cantidadPendiente=" + cantidadPendiente +
                ", cantidadFacturado=" + cantidadFacturado +
                ", cantidadRemisionado=" + cantidadRemisionado +
                ", causaDevolucion='" + causaDevolucion + '\'' +
                ", diagnosticoDevolucion='" + diagnosticoDevolucion + '\'' +
                ", fechaMdodificacion=" + fechaMdodificacion +
                ", descuentoComercial=" + descuentoComercial +
                ", descuentoPromocion=" + descuentoPromocion +
                ", descuentoNegociacionEspecial=" + descuentoNegociacionEspecial +
                ", fechaSolicitud=" + fechaSolicitud +
                ", fechaSync=" + fechaSync +
                ", usuarioIntegracion='" + usuarioIntegracion + '\'' +
                '}';
    }
}
