package com.assaabloy.despachos.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Boomie_Cuenta")
public class BoomiCuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "TipoDeVenta")
    private String tipoVenta;
    @Column(name = "CodigoCliente")
    private String codigoCliente;
    @Column(name = "Ciudad")
    private String ciudad;
    @Column(name = "Municipio")
    private String municipio;
    @Column(name = "Pais")
    private String pais;
    @Column(name = "FechaDeCreacion")
    private LocalDateTime fechaCreacion;
    @Column(name = "EstadoCuenta")
    private int estadoCuenta;
    @Column(name = "NumIdentificacion")
    private String numeroIdentificacion;
    @Column(name = "Dirrecion1")
    private String dirrecion1;
    @Column(name = "TipoDeDocumento")
    private String tipoDocumento;
    @Column(name = "FechaDeModificacion")
    private LocalDateTime fechaModificacion;
    @Column(name = "RazonSocial")
    private String razonSocial;
    @Column(name = "Telefono")
    private String telefono;
    @Column(name = "DigitoDeVerificacion")
    private String digitoVerificacion;
    @Column(name = "CodigoCuentaPrincipal")
    private String codigoCuentaPrincipal;
    @Column(name = "RazonComercial")
    private String razonComercial;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "ImpIncluido")
    private impIncluido;
    @Column(name = "UsoImp")
    private String usoImp;
    @Column(name = "ZonaImp")
    private String zonaImp;
    @Column(name = "Gravable")
    private String gravable;
    @Column(name = "ClaseImp")
    private String claseImp;
    @Column(name = "TipoDeCuenta")
    private String tipoCuenta;
    @Column(name = "CodigoPostal")
    private String codigoPostal;
    @Column(name = "ViaEmbarque")
    private String viaEmbarque;
    @Column(name = "Mercado")
    private String mercado;
    @Column(name = "Relacionados")
    private String relacionados;
    @Column(name = "Vendedor")
    private String vendedor;
    @Column(name = "CuentaCXCPrincipal")
    private String cuentaCXCPrincipal;
    @Column(name = "CuentaCXCAlterna")
    private String cuentaCXCAlterna;
    @Column(name = "CupoCreditoDisponible")
    private  cupoCreditoDisponible;
    @Column(name = "CobrarA")
    private String cobrarA;
    @Column(name = "Canal")
    private String canal;
    @Column(name = "RetencionDeCredito")
    private  retencionCredito;
    @Column(name = "MontoDeCredito")
    private BigDecimal montoCredito;
    @Column(name = "UltimaRevisionDeCredito")
    private LocalDateTime ultimaRevisionCredito;
    @Column(name = "TerminoDePago")
    private String terminoPago;
    @Column(name = "UltimaActualizacionDeCredito")
    private LocalDateTime ultimaActualizacionCredito;
    @Column(name = "Moneda")
    private String moneda;
    @Column(name = "TerminosFlete")
    private String terminosFlete;
    @Column(name = "Email")
    private String email;
    @Column(name = "CodigoTransportadora")
    private String codigoTransportadora;
    @Column(name = "Sic")
    private String sic;
    @Column(name = "Almacen")
    private String almacen;
    @Column(name = "CodigoAsesor")
    private String codigoAsesor;
    @Column(name = "Region")
    private String region;
    @Column(name = "Jerarquia")
    private String jerarquia;
    @Column(name = "Agrupador1")
    private String agrupador1;
    @Column(name = "Apellido1")
    private String apellido1;
    @Column(name = "Apellido2")
    private String apellido2;
    @Column(name = "TipoContribucion")
    private String tipoContribucion;
    @Column(name = "Email1Fe")
    private String email1Fe;
    @Column(name = "Email2Fe")
    private String email2Fe;
    @Column(name = "MpioExpedicionRUT")
    private String mpioExpedicionRUT;
    @Column(name = "Nombre1")
    private String nombre1;
    @Column(name = "Nombre2")
    private String nombre2;
    @Column(name = "TipoPersona")
    private String tipoPersona;
    @Column(name = "Responsabilidades")
    private String responsabilidades;
    @Column(name = "FechaSolicitud")
    private LocalDateTime fechaSolicitud;
    @Column(name = "FechaSync")
    private LocalDateTime fechaSync;
    @Column(name = "CuentaId")
    private String cuentaId;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "Id_Cuenta_Ods")
    private Integer idCuentaOds;
    @Column(name = "CanalOriginacion")
    private String canalOriginacion;
    @Column(name = "SubCanal")
    private String subCanal;
    @Column(name = "CanalVentaContable")
    private String canalVentaContable;
    @Column(name = "UsuarioIntegracion")
    private String usuarioIntegracion;

}
