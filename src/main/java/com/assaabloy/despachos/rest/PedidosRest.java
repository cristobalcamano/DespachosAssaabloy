package com.assaabloy.despachos.rest;

import com.assaabloy.despachos.entity.Pedidos;
import com.assaabloy.despachos.services.PedidosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/Pedido/")
@RestController
public class PedidosRest {

    @Autowired
    private PedidosServices pedidosServices;

    @GetMapping("")
    public ResponseEntity<?> ListarPedidos(){
        try {
            return new ResponseEntity<>(pedidosServices.listaPedidos(), HttpStatus.OK);
        } catch (Exception error){
            return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("ref-compra/{referencia-compra}/compra-canal/{canal-compra}")
    public ResponseEntity<?>VerificarPedido(@PathVariable(name = "referencia-compra") String referenciaCompra,
                                            @PathVariable(name = "canal-compra") String canalCompra){
        try {
                String id = referenciaCompra + canalCompra;
            return new ResponseEntity<>(pedidosServices.getPedido(referenciaCompra, canalCompra),HttpStatus.OK);

        }catch (Exception error){
            return  new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("validar-estado-pedido/{estado-pedido}")
    public ResponseEntity<?>VerificarEstado(@PathVariable(name = "estado-pedido") String estadoPedido){
        try {
            return new ResponseEntity<>(pedidosServices.getPedidosEstados(estadoPedido),HttpStatus.OK);

        }catch (Exception error){
            return  new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("validar-pedido/{idpedido}")
    public ResponseEntity<?>VerificarPedido(@PathVariable(name = "idpedido") String idPedido ){
        try {

            return new ResponseEntity<>(pedidosServices.getPedidoId(idPedido),HttpStatus.OK);
        }catch (Exception error){
            return  new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping("/updateEstado/{id}")
    public ResponseEntity<?>UpdatePedidoEstado(@PathVariable("id") String idPedido,@RequestBody Pedidos pedidos){
        try {
            return new ResponseEntity<>(pedidosServices.updatePedidoEstado(idPedido,pedidos.getEstadoPedido()),HttpStatus.OK);
        }catch (Exception error){
            return  new ResponseEntity<>("Error",HttpStatus.BAD_REQUEST);
        }
    }


}
