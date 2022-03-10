package com.assaabloy.despachos.services;

import com.assaabloy.despachos.dto.PedidoDto;
import com.assaabloy.despachos.entity.Pedidos;
import com.assaabloy.despachos.repository.PedidosRepository;

import java.util.List;

public interface PedidosServices   {

     public List<Pedidos> listaPedidos() throws Exception;

     public PedidoDto getPedido(String refCompra, String canalCompra) throws Exception;

     public List<Pedidos> getPedidosEstados(String estados) throws Exception;

     public  PedidoDto getPedidoId(String idPedido)throws Exception;

     public PedidoDto updatePedidoEstado(String idPedido,String estadoPedido) throws Exception;

}
