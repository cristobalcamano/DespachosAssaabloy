package com.assaabloy.despachos.services.impl;

import com.assaabloy.despachos.dto.EnvioDto;
import com.assaabloy.despachos.dto.PedidoDto;
import com.assaabloy.despachos.dto.RespuestaDto;
import com.assaabloy.despachos.entity.Pedidos;
import com.assaabloy.despachos.repository.PedidosRepository;
import com.assaabloy.despachos.services.PedidosServices;
import com.assaabloy.despachos.utility.ConstantesGlobales;
import com.assaabloy.despachos.utility.ConsumirRest;
import com.assaabloy.despachos.utility.TransObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PedidosServicesImpl implements PedidosServices {

    @Autowired
    private PedidosRepository pedidosRepository;

    public PedidosServicesImpl() {

    }

    @Override
    public List<Pedidos> listaPedidos() throws Exception {
        return (List<Pedidos>) pedidosRepository.findAll();
    }

    @Override
    public PedidoDto getPedido(String refCompra, String canalCompra) throws Exception {

        if (refCompra == null || refCompra.equalsIgnoreCase("")
                || canalCompra == null || canalCompra.equalsIgnoreCase("")) {
            throw new Exception("Debe enviar la referencia de compra y el canal de compra");
        }

        Pedidos pedido = pedidosRepository.findById(refCompra.concat(canalCompra)).orElse(null);

        PedidoDto respuesta = new PedidoDto();
        String mensaje = "";
        if (pedido == null) {
            pedido = new Pedidos();

            pedido.setEstadoPedido(ConstantesGlobales.NO_SOLICITADO);
            pedido.setOrdenPedido("");
            pedido.setFactura(null);
            pedido.setId(refCompra.concat(canalCompra));
            pedido.setFechaCreacion(new Date());
            pedido.setCanalOrigenCompra(canalCompra);
            pedido.setOrdenVenta("");
            pedido.setReferenciaCompra(refCompra);

            pedido = pedidosRepository.save(pedido);
            mensaje = "Pedido creado exitosamente";
        } else {
            mensaje = "Pedido existente en OV";
        }
        respuesta = TransObject.TransforPedidoEntityToDto(pedido);

        return respuesta;
    }

    @Override
    public List<Pedidos> getPedidosEstados(String estados) throws Exception {
        if (estados == null || estados.equalsIgnoreCase("")) {
            throw new Exception("El estado se encuentra vacío");
        }
        List<Pedidos> findEstado = new ArrayList<>();

        findEstado = pedidosRepository.findAllByEstadoPedido(estados);

        return findEstado;
    }

    @Override
    public PedidoDto getPedidoId(String idPedido) throws Exception {
        Pedidos pedido = pedidosRepository.findById(idPedido).orElse(null);
        RespuestaDto respuestaDto = new RespuestaDto();
        PedidoDto respuesta = new PedidoDto();
        if (pedido == null) {
            respuestaDto.setMensaje("El Pedido no se encuentra");
        } else {
            respuesta = TransObject.TransforPedidoEntityToDto(pedido);
        }
        respuesta.setRespuestaDto(respuestaDto);
        return respuesta;
    }

    @Override
    public PedidoDto updatePedidoEstado(String idPedido, String estadoPedido) throws Exception {
        Pedidos pedido = pedidosRepository.findById(idPedido).orElse(null);
        Pedidos pedidosActualizado = new Pedidos();
        PedidoDto respuesta = new PedidoDto();
        RespuestaDto respuestaDto = new RespuestaDto();
        EnvioDto envioDto = new EnvioDto();
        if (pedido == null) {
            respuestaDto.setMensaje("No se encontro el pedido");
            respuestaDto.setEstado(false);
            respuesta.setRespuestaDto(respuestaDto);
        } else {
            pedido.setEstadoPedido(estadoPedido);
            pedidosActualizado = pedidosRepository.save(pedido);
            if (pedidosActualizado.getEstadoPedido().equalsIgnoreCase(ConstantesGlobales.LISTO_PARA_DESPACHAR)) {
                envioDto.setIdPedido(pedidosActualizado.getId());
                envioDto.setLugarEnvio("Bogota");
                envioDto.setTransportadora("sur");
                String body = ConsumirRest.addEnviosRest(ConstantesGlobales.URLENVIO + "addEnvios", envioDto);
                respuestaDto.setEstado(true);
                respuestaDto.setMensaje(body);
            }
            respuesta = TransObject.TransforPedidoEntityToDto(pedidosActualizado);
            respuesta.setRespuestaDto(respuestaDto);

        }

        return respuesta;
    }

    @Override
    public Page<Pedidos> consultar(Pageable pageable) throws Exception {
        return pedidosRepository.consultarPedidod(pageable);
    }


}
