package com.alvaro.retonapptilus.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

	public ReturnParamsService obtenerPrecioMomentoDado(EntryParamsService entryParams) {
		
		System.out.println(entryParams);
		
		//Se recuperan los registros cuyo intervalo de fechas abarca la fecha de entrada
		List<PricesModel> pricesResult = pricesRepository.findByFechaProdBrand( entryParams.getFecha(),
																					entryParams.getBrandId(),
																					entryParams.getProductId());
		ReturnParamsService returnParams = new ReturnParamsService(pricesResult.get(0));
		return  returnParams;
	}
	
	//uno cualquiera, para probar
	public ReturnParamsService encontrarUno() {
		
		List<PricesModel> pricesResult = pricesRepository.findAll();
		
		ReturnParamsService returnParams = new ReturnParamsService(pricesResult.get(0));
		return  returnParams;
	}
	
}
