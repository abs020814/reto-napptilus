package com.alvaro.retonapptilus.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.alvaro.retonapptilus.model.PricesModel;

@Repository
public interface PricesRepository extends CrudRepository<PricesModel,Long> {

	// query concreta para el servicio pedido
	@Query("from PricesModel p "
			+ "where p.col002StartDate < :fecha "
			+ "  and p.col003EndDate   > :fecha "
			+ "  and p.col001BrandId   = :brand "
			+ "  and p.col005ProductId = :prod  "
			+ "order by p.col006Priority desc ")
	public List<PricesModel> findByFechaProdBrand(
						@Param("fecha") Timestamp fecha,
						@Param("brand") Long brand,
						@Param("prod")  Long prod);
	
	// consulta genérica
	@Query("from PricesModel")
	@Override 
	public List<PricesModel> findAll();
}