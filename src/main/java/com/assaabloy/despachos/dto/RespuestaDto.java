package com.assaabloy.despachos.dto;

public class RespuestaDto {

    private String mensaje;
    private boolean estado;

    public RespuestaDto() {
    }

    public RespuestaDto(String mensaje, boolean estado) {
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
