package com.assaabloy.despachos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Boomi_OvEncabezado")
public class BoomiOvEncabezado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Id_EncabezadoOV_Ods")
    private Integer iDEncabezadoOVOds;
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "PedidoId",unique=true)
    private String pedidoId;
    @Column(name = "VendidoA")
    private String vendidoA;
    @Column(name = "EmbarcaA")
    private String embarcaA;
    @Column(name = "CobrarA")
    private String cobrarA;
    @Column(name = "OrdenDeVenta")
    private String ordenDeVenta;
    @Column(name = "Tipo")
    private String tipo;
    @Column(name = "EstadoPedido")
    private String estadoPedido;
    @Column(name = "SolicitudDesbloqueo")
    private  byte solicitudDesbloqueo;
    @Column(name = "SolicitudDesbloqueoExitoso")
    private byte solicitudDesbloqueoExitoso;
    @Column(name = "OrdenDeCompraCliente")
    private String ordenCompraCliente;
    @Column(name = "TerminosDePago")
    private String   terminosPago;
    @Column(name = "Moneda")
    private String moneda;
    @Column(name = "ImporteTotal")
    private BigDecimal importeTotal;
    @Column(name = "Almacen")
    private String almacen;
    @Column(name = "FechaOrdenVenta")
    private LocalDateTime fechaOrdenVenta;
    @Column(name = "FechaCompromisoEntrega")
    private LocalDateTime fechaCompromisoEntrega;
    @Column(name = "FechaVencimiento")
    private LocalDateTime fechaVencimiento;
    @Column(name = "CorreoElectronico")
    private String correoEletronico;
    @Column(name = "TipoVentaContable")
    private String tipoVentaContable;
    @Column(name = "Proyecto")
    private String proyecto;
    @Column(name = "UsoDeImpuesto")
    private String usoDeImpuesto;
    @Column(name = "AmbienteDeImpuesto")
    private String ambienteDeImpuesto;
    @Column(name = "ClaseDeImpuesto")
    private String claseDeImpuesto;
    @Column(name = "CuentaPorCobrar")
    private  byte cuentaPorCobrar;
    @Column(name = "Vendedor")
    private String vendedor;
    @Column(name = "PorcentajeDescuentoAdicional")
    private BigDecimal porcentajeDescuentoAdicional;
    @Column(name = "MontoDescuentoAdicional")
    private BigDecimal montoDescuentoAdicional;
    @Column(name = "ViaEmbarque")
    private String viaEmbarque;
    @Column(name = "CanalDeVentaMercadeo")
    private String canalDeVentaMercadeo;
    @Column(name = "FechaCreacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "FechaCierre")
    private LocalDateTime fechaCierre;
    @Column(name = "TrmNegociada")
    private BigDecimal trmNegociada;
    @Column(name = "FechaSolicitud")
    private LocalDateTime fechaSolicitud;
    @Column(name = "FechaSync")
    private LocalDateTime fechaSync;
    @Column(name = "UsuarioIntegracion")
    private String usuarioIntegracion;

    public BoomiOvEncabezado() {
    }

    public BoomiOvEncabezado(String pedidoId, String vendidoA, String embarcaA, String cobrarA, String ordenDeVenta, String tipo, String estadoPedido, byte solicitudDesbloqueo, byte solicitudDesbloqueoExitoso, String ordenCompraCliente, String terminosPago, String moneda, BigDecimal importeTotal, String almacen, LocalDateTime fechaOrdenVenta, LocalDateTime fechaCompromisoEntrega, LocalDateTime fechaVencimiento, String correoEletronico, String tipoVentaContable, String proyecto, String usoDeImpuesto, String ambienteDeImpuesto, String claseDeImpuesto, byte cuentaPorCobrar, String vendedor, BigDecimal porcentajeDescuentoAdicional, BigDecimal montoDescuentoAdicional, String viaEmbarque, String canalDeVentaMercadeo, LocalDateTime fechaCreacion, LocalDateTime fechaCierre, BigDecimal trmNegociada, LocalDateTime fechaSolicitud, LocalDateTime fechaSync, String usuarioIntegracion) {
        this.pedidoId = pedidoId;
        this.vendidoA = vendidoA;
        this.embarcaA = embarcaA;
        this.cobrarA = cobrarA;
        this.ordenDeVenta = ordenDeVenta;
        this.tipo = tipo;
        this.estadoPedido = estadoPedido;
        this.solicitudDesbloqueo = solicitudDesbloqueo;
        this.solicitudDesbloqueoExitoso = solicitudDesbloqueoExitoso;
        this.ordenCompraCliente = ordenCompraCliente;
        this.terminosPago = terminosPago;
        this.moneda = moneda;
        this.importeTotal = importeTotal;
        this.almacen = almacen;
        this.fechaOrdenVenta = fechaOrdenVenta;
        this.fechaCompromisoEntrega = fechaCompromisoEntrega;
        this.fechaVencimiento = fechaVencimiento;
        this.correoEletronico = correoEletronico;
        this.tipoVentaContable = tipoVentaContable;
        this.proyecto = proyecto;
        this.usoDeImpuesto = usoDeImpuesto;
        this.ambienteDeImpuesto = ambienteDeImpuesto;
        this.claseDeImpuesto = claseDeImpuesto;
        this.cuentaPorCobrar = cuentaPorCobrar;
        this.vendedor = vendedor;
        this.porcentajeDescuentoAdicional = porcentajeDescuentoAdicional;
        this.montoDescuentoAdicional = montoDescuentoAdicional;
        this.viaEmbarque = viaEmbarque;
        this.canalDeVentaMercadeo = canalDeVentaMercadeo;
        this.fechaCreacion = fechaCreacion;
        this.fechaCierre = fechaCierre;
        this.trmNegociada = trmNegociada;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaSync = fechaSync;
        this.usuarioIntegracion = usuarioIntegracion;
    }

    public Integer getiDEncabezadoOVOds() {
        return iDEncabezadoOVOds;
    }

    public void setiDEncabezadoOVOds(Integer iDEncabezadoOVOds) {
        this.iDEncabezadoOVOds = iDEncabezadoOVOds;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getVendidoA() {
        return vendidoA;
    }

    public void setVendidoA(String vendidoA) {
        this.vendidoA = vendidoA;
    }

    public String getEmbarcaA() {
        return embarcaA;
    }

    public void setEmbarcaA(String embarcaA) {
        this.embarcaA = embarcaA;
    }

    public String getCobrarA() {
        return cobrarA;
    }

    public void setCobrarA(String cobrarA) {
        this.cobrarA = cobrarA;
    }

    public String getOrdenDeVenta() {
        return ordenDeVenta;
    }

    public void setOrdenDeVenta(String ordenDeVenta) {
        this.ordenDeVenta = ordenDeVenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public byte getSolicitudDesbloqueo() {
        return solicitudDesbloqueo;
    }

    public void setSolicitudDesbloqueo(byte solicitudDesbloqueo) {
        this.solicitudDesbloqueo = solicitudDesbloqueo;
    }

    public byte getSolicitudDesbloqueoExitoso() {
        return solicitudDesbloqueoExitoso;
    }

    public void setSolicitudDesbloqueoExitoso(byte solicitudDesbloqueoExitoso) {
        this.solicitudDesbloqueoExitoso = solicitudDesbloqueoExitoso;
    }

    public String getOrdenCompraCliente() {
        return ordenCompraCliente;
    }

    public void setOrdenCompraCliente(String ordenCompraCliente) {
        this.ordenCompraCliente = ordenCompraCliente;
    }

    public String getTerminosPago() {
        return terminosPago;
    }

    public void setTerminosPago(String terminosPago) {
        this.terminosPago = terminosPago;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public LocalDateTime getFechaOrdenVenta() {
        return fechaOrdenVenta;
    }

    public void setFechaOrdenVenta(LocalDateTime fechaOrdenVenta) {
        this.fechaOrdenVenta = fechaOrdenVenta;
    }

    public LocalDateTime getFechaCompromisoEntrega() {
        return fechaCompromisoEntrega;
    }

    public void setFechaCompromisoEntrega(LocalDateTime fechaCompromisoEntrega) {
        this.fechaCompromisoEntrega = fechaCompromisoEntrega;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCorreoEletronico() {
        return correoEletronico;
    }

    public void setCorreoEletronico(String correoEletronico) {
        this.correoEletronico = correoEletronico;
    }

    public String getTipoVentaContable() {
        return tipoVentaContable;
    }

    public void setTipoVentaContable(String tipoVentaContable) {
        this.tipoVentaContable = tipoVentaContable;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getUsoDeImpuesto() {
        return usoDeImpuesto;
    }

    public void setUsoDeImpuesto(String usoDeImpuesto) {
        this.usoDeImpuesto = usoDeImpuesto;
    }

    public String getAmbienteDeImpuesto() {
        return ambienteDeImpuesto;
    }

    public void setAmbienteDeImpuesto(String ambienteDeImpuesto) {
        this.ambienteDeImpuesto = ambienteDeImpuesto;
    }

    public String getClaseDeImpuesto() {
        return claseDeImpuesto;
    }

    public void setClaseDeImpuesto(String claseDeImpuesto) {
        this.claseDeImpuesto = claseDeImpuesto;
    }

    public byte getCuentaPorCobrar() {
        return cuentaPorCobrar;
    }

    public void setCuentaPorCobrar(byte cuentaPorCobrar) {
        this.cuentaPorCobrar = cuentaPorCobrar;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public BigDecimal getPorcentajeDescuentoAdicional() {
        return porcentajeDescuentoAdicional;
    }

    public void setPorcentajeDescuentoAdicional(BigDecimal porcentajeDescuentoAdicional) {
        this.porcentajeDescuentoAdicional = porcentajeDescuentoAdicional;
    }

    public BigDecimal getMontoDescuentoAdicional() {
        return montoDescuentoAdicional;
    }

    public void setMontoDescuentoAdicional(BigDecimal montoDescuentoAdicional) {
        this.montoDescuentoAdicional = montoDescuentoAdicional;
    }

    public String getViaEmbarque() {
        return viaEmbarque;
    }

    public void setViaEmbarque(String viaEmbarque) {
        this.viaEmbarque = viaEmbarque;
    }

    public String getCanalDeVentaMercadeo() {
        return canalDeVentaMercadeo;
    }

    public void setCanalDeVentaMercadeo(String canalDeVentaMercadeo) {
        this.canalDeVentaMercadeo = canalDeVentaMercadeo;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDateTime fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public BigDecimal getTrmNegociada() {
        return trmNegociada;
    }

    public void setTrmNegociada(BigDecimal trmNegociada) {
        this.trmNegociada = trmNegociada;
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
        return "BoomiOvEncabezado{" +
                "iDEncabezadoOVOds=" + iDEncabezadoOVOds +
                ", pedidoId='" + pedidoId + '\'' +
                ", vendidoA='" + vendidoA + '\'' +
                ", embarcaA='" + embarcaA + '\'' +
                ", cobrarA='" + cobrarA + '\'' +
                ", ordenDeVenta='" + ordenDeVenta + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", solicitudDesbloqueo=" + solicitudDesbloqueo +
                ", solicitudDesbloqueoExitoso=" + solicitudDesbloqueoExitoso +
                ", ordenCompraCliente='" + ordenCompraCliente + '\'' +
                ", terminosPago='" + terminosPago + '\'' +
                ", moneda='" + moneda + '\'' +
                ", importeTotal=" + importeTotal +
                ", almacen='" + almacen + '\'' +
                ", fechaOrdenVenta=" + fechaOrdenVenta +
                ", fechaCompromisoEntrega=" + fechaCompromisoEntrega +
                ", fechaVencimiento=" + fechaVencimiento +
                ", correoEletronico='" + correoEletronico + '\'' +
                ", tipoVentaContable='" + tipoVentaContable + '\'' +
                ", proyecto='" + proyecto + '\'' +
                ", usoDeImpuesto='" + usoDeImpuesto + '\'' +
                ", ambienteDeImpuesto='" + ambienteDeImpuesto + '\'' +
                ", claseDeImpuesto='" + claseDeImpuesto + '\'' +
                ", cuentaPorCobrar=" + cuentaPorCobrar +
                ", vendedor='" + vendedor + '\'' +
                ", porcentajeDescuentoAdicional=" + porcentajeDescuentoAdicional +
                ", montoDescuentoAdicional=" + montoDescuentoAdicional +
                ", viaEmbarque='" + viaEmbarque + '\'' +
                ", canalDeVentaMercadeo='" + canalDeVentaMercadeo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaCierre=" + fechaCierre +
                ", trmNegociada=" + trmNegociada +
                ", fechaSolicitud=" + fechaSolicitud +
                ", fechaSync=" + fechaSync +
                ", usuarioIntegracion='" + usuarioIntegracion + '\'' +
                '}';
    }
}
