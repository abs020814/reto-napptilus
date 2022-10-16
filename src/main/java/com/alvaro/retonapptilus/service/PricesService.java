package com.alvaro.retonapptilus.service;
/*********************
*
*
* Clase Servicio PricesServicio ,, 
* 	queda sin Id concreta, y se define en clase aparte PricesPK
* 
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvaro.retonapptilus.model.PricesModel;
import com.alvaro.retonapptilus.repository.PricesRepository;

@Service
public class PricesService {

	@Autowired
	PricesRepository pricesRepository;
	
	
	/**
	lógica del servicio, método que:
	 -> Acepte como parámetros de entrada: 
	 		fecha de aplicación, identificador de producto, identificador de cadena.
	 <- Devuelva como datos de salida: 
	 		identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
	 */

	public ReturnParamsDto obtenerPrecioMomentoDado(EntryParamsDto entryParams) {
		System.out.println(this.getClass());	

		System.out.println(entryParams);
		
		//Se recuperan los registros cuyo intervalo de fechas abarca la fecha de entrada
		List<PricesModel> pricesResult = pricesRepository.findByFechaProdBrand( entryParams.getInstante(),
																					entryParams.getBrandId(),
																					entryParams.getProductId());
		
		ReturnParamsDto returnParams= new ReturnParamsDto(); 
		ModelMapper modelMapper = new ModelMapper();
		if ( !(pricesResult.isEmpty()) ) {
			returnParams = modelMapper.map(pricesResult.get(0), ReturnParamsDto.class);
			//returnParams.setAll(pricesResult.get(0));
			return returnParams;
		}
		else {
			return returnParams;
		}
	}
	
	
	///////////////PRUEBAS
	//uno cualquiera, el primero devuelto.. para probar
	public ReturnParamsDto encontrarUno() {
		
		List<PricesModel> pricesResult = pricesRepository.findAll();
		
		ReturnParamsDto returnParams = new ReturnParamsDto(pricesResult.get(0));
		return  returnParams;
	}
	
}
