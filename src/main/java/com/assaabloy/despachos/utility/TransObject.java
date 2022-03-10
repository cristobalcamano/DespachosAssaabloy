package com.assaabloy.despachos.utility;

import com.assaabloy.despachos.dto.PedidoDto;
import com.assaabloy.despachos.entity.Pedidos;

public final class TransObject {

    public static PedidoDto TransforPedidoEntityToDto(Pedidos pedidos) throws Exception {
        if(pedidos == null){
            throw new Exception("El Pedido es nulo");
        }

        PedidoDto pedidodto = new PedidoDto();
        pedidodto.setId(pedidos.getId());
        pedidodto.setCanalOrigenCompra(pedidos.getCanalOrigenCompra());
        pedidodto.setEstadoPedido(pedidos.getEstadoPedido());
        pedidodto.setReferenciaCompra(pedidos.getReferenciaCompra());
        pedidodto.setOrdenPedido(pedidos.getOrdenPedido());
        pedidodto.setOrdenVenta(pedidos.getOrdenVenta());
        pedidodto.setFactura(pedidos.getFactura());
        pedidodto.setFechaCreacion(pedidos.getFechaCreacion());


        return  pedidodto;
    }

    public  static Pedidos TransforPedidoDtoToEntity(PedidoDto pedidoDto)throws Exception{
        Pedidos pedidos = new Pedidos();
        pedidos.setId(pedidoDto.getId());
        pedidos.setEstadoPedido(pedidoDto.getEstadoPedido());
        pedidos.setOrdenPedido(pedidoDto.getOrdenPedido());
        pedidos.setOrdenVenta(pedidoDto.getOrdenVenta());
        pedidos.setFactura(pedidoDto.getFactura());
        pedidos.setFechaCreacion(pedidoDto.getFechaCreacion());
        pedidos.setCanalOrigenCompra(pedidoDto.getCanalOrigenCompra());
        pedidos.setReferenciaCompra(pedidoDto.getReferenciaCompra());

        return  pedidos;
    }
}
