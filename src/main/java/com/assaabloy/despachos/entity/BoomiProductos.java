package com.assaabloy.despachos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Boomi_Productos")
public class BoomiProductos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "Id_Producto")
    private String idProducto;
    @Column(name = "Sku")
    private String sku;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "GrupoProducto")
    private String grupoProducto;
    @Column(name = "Categoria")
    private String categoria;
    @Column(name = "Familia")
    private String familia;
    @Column(name = "Mecanismo")
    private String mecanismo;
    @Column(name = "Segmento")
    private String segmento;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Paquete")
    private String paquete;
    @Column(name = "UnidadMedida")
    private String unidadMedida;
    @Column(name = "Estatus")
    private String estatus;
    @Column(name = "DescripcionGrupoProducto")
    private String descripcionGrupoProducto;
    @Column(name = "Com/Man")
    private String comMan;
    @Column(name = "Peso")
    private BigDecimal peso;
    @Column(name = "Alto")
    private BigDecimal alto;
    @Column(name = "Ancho")
    private BigDecimal ancho;
    @Column(name = "Largo")
    private  BigDecimal largo;
    @Column(name = "Volumen")
    private  BigDecimal volumen;
    @Column(name = "CodigoEan")
    private String codigoEan;
    @Column(name = "GrupoRebate")
    private String grupoRebate;
    @Column(name = "LiquidaRebate")
    private String liquidaRebate;
    @Column(name = "Costo")
    private BigDecimal costo;
    @Column(name = "fechaSolicitud")
    private LocalDateTime fechaSolicitud;

    public BoomiProductos() {
    }

    public BoomiProductos(String sku, String descripcion, String grupoProducto, String categoria, String familia, String mecanismo, String segmento, String marca, String paquete, String unidadMedida, String estatus, String descripcionGrupoProducto, String comMan, BigDecimal peso, BigDecimal alto, BigDecimal ancho, BigDecimal largo, BigDecimal volumen, String codigoEan, String grupoRebate, String liquidaRebate, BigDecimal costo, LocalDateTime fechaSolicitud) {
        this.sku = sku;
        this.descripcion = descripcion;
        this.grupoProducto = grupoProducto;
        this.categoria = categoria;
        this.familia = familia;
        this.mecanismo = mecanismo;
        this.segmento = segmento;
        this.marca = marca;
        this.paquete = paquete;
        this.unidadMedida = unidadMedida;
        this.estatus = estatus;
        this.descripcionGrupoProducto = descripcionGrupoProducto;
        this.comMan = comMan;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.volumen = volumen;
        this.codigoEan = codigoEan;
        this.grupoRebate = grupoRebate;
        this.liquidaRebate = liquidaRebate;
        this.costo = costo;
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGrupoProducto() {
        return grupoProducto;
    }

    public void setGrupoProducto(String grupoProducto) {
        this.grupoProducto = grupoProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getDescripcionGrupoProducto() {
        return descripcionGrupoProducto;
    }

    public void setDescripcionGrupoProducto(String descripcionGrupoProducto) {
        this.descripcionGrupoProducto = descripcionGrupoProducto;
    }

    public String getComMan() {
        return comMan;
    }

    public void setComMan(String comMan) {
        this.comMan = comMan;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAlto() {
        return alto;
    }

    public void setAlto(BigDecimal alto) {
        this.alto = alto;
    }

    public BigDecimal getAncho() {
        return ancho;
    }

    public void setAncho(BigDecimal ancho) {
        this.ancho = ancho;
    }

    public BigDecimal getLargo() {
        return largo;
    }

    public void setLargo(BigDecimal largo) {
        this.largo = largo;
    }

    public BigDecimal getVolumen() {
        return volumen;
    }

    public void setVolumen(BigDecimal volumen) {
        this.volumen = volumen;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public void setCodigoEan(String codigoEan) {
        this.codigoEan = codigoEan;
    }

    public String getGrupoRebate() {
        return grupoRebate;
    }

    public void setGrupoRebate(String grupoRebate) {
        this.grupoRebate = grupoRebate;
    }

    public String getLiquidaRebate() {
        return liquidaRebate;
    }

    public void setLiquidaRebate(String liquidaRebate) {
        this.liquidaRebate = liquidaRebate;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    @Override
    public String toString() {
        return "BoomiProductos{" +
                "idProducto='" + idProducto + '\'' +
                ", sku='" + sku + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", grupoProducto='" + grupoProducto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", familia='" + familia + '\'' +
                ", mecanismo='" + mecanismo + '\'' +
                ", segmento='" + segmento + '\'' +
                ", marca='" + marca + '\'' +
                ", paquete='" + paquete + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", estatus='" + estatus + '\'' +
                ", descripcionGrupoProducto='" + descripcionGrupoProducto + '\'' +
                ", comMan='" + comMan + '\'' +
                ", peso=" + peso +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", volumen=" + volumen +
                ", codigoEan='" + codigoEan + '\'' +
                ", grupoRebate='" + grupoRebate + '\'' +
                ", liquidaRebate='" + liquidaRebate + '\'' +
                ", costo=" + costo +
                ", fechaSolicitud=" + fechaSolicitud +
                '}';
    }
}
