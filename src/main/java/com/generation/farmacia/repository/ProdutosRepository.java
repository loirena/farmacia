package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.generation.farmacia.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>
{
	public List<Produtos> findAllById (Long id);
	
	public List<Produtos> findAllByNomeContainingIgnoreCase (String nome);
	
	public List<Produtos> findByPrecoBetween (@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);
}
