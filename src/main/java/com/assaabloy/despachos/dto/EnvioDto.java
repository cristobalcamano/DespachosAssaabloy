package com.assaabloy.despachos.dto;

public class EnvioDto {

    private  Integer id;
    private String idPedido;
    private String lugarEnvio;
    private String transportadora;

    public EnvioDto() {
    }

    public EnvioDto(String idPedido, String lugarEnvio, String transportadora) {
        this.idPedido = idPedido;
        this.lugarEnvio = lugarEnvio;
        this.transportadora = transportadora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getLugarEnvio() {
        return lugarEnvio;
    }

    public void setLugarEnvio(String lugarEnvio) {
        this.lugarEnvio = lugarEnvio;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public String toString() {
        return "EnvioDto{" +
                "id=" + id +
                ", idPedido='" + idPedido + '\'' +
                ", lugarEnvio='" + lugarEnvio + '\'' +
                ", transportadora='" + transportadora + '\'' +
                '}';
    }
}
