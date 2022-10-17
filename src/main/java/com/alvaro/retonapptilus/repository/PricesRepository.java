package com.alvaro.retonapptilus.repository;
/*********************
 *
 *
 * Interface repositorio de la Entity PricesModel
 * 
 * 
 * (Alvaro B.S. octubre 2022)
 *
 *
 */
import java.time.Instant;
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
			+ "where p.startDate <= :instante "
			+ "  and p.endDate   >= :instante "
			+ "  and p.brandId   = :brand "
			+ "  and p.productId = :prod  "
			+ "order by p.priority desc ")
	public List<PricesModel> findByFechaProdBrand(
						@Param("instante") Instant instante,
						@Param("brand") Long brand,
						@Param("prod")  Long prod);
	
	// consulta genérica (....de práctica, sin uso)
	@Query("from PricesModel")
	@Override 
	public List<PricesModel> findAll();
}