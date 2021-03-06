package com.assaabloy.despachos.services;

import com.assaabloy.despachos.dto.PedidoDto;
import com.assaabloy.despachos.entity.Pedidos;
import com.assaabloy.despachos.repository.PedidosRepository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidosServices   {

     public List<Pedidos> listaPedidos() throws Exception;

     public PedidoDto getPedido(String refCompra, String canalCompra) throws Exception;

     public List<Pedidos> getPedidosEstados(String estados) throws Exception;

     public  PedidoDto getPedidoId(String idPedido)throws Exception;

     public PedidoDto updatePedidoEstado(String idPedido,String estadoPedido) throws Exception;
     
     public Page<Pedidos> consultar(Pageable pageable)throws Exception;

}
