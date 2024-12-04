package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetojpa.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	//Nenhuma implemantação é necessária. Spring Data JPA cuidará disso.

}
