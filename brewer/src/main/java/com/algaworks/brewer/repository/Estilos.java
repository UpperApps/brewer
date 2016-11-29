package com.algaworks.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.brewer.model.Estilo;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>{
	
	/**Este método faz uma busca por um nome ignorando a caixa.
	 * @author Rodrigo Melo
	 **/
	public Optional<Estilo> findByNomeIgnoreCase(String nome);
}
