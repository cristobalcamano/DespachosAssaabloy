package com.assaabloy.despachos.repository;

import com.assaabloy.despachos.entity.BoomiOvDetalle;
import com.assaabloy.despachos.entity.Pedidos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PedidosRepository extends JpaRepository<Pedidos,String> {

    List<Pedidos> findAllByEstadoPedido(String strings);
    
	@Query(value = "SELECT * FROM pedidos p ", countQuery = ("SELECT * FROM pedidos p"), nativeQuery = true)
	Page<Pedidos> consultarPedidod(Pageable pageable);


}
