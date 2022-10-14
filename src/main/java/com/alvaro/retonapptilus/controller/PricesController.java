package com.alvaro.retonapptilus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.retonapptilus.model.PricesModel;
import com.alvaro.retonapptilus.service.EntryParamsService;
import com.alvaro.retonapptilus.service.PricesService;
import com.alvaro.retonapptilus.service.ReturnParamsService;

@RestController
@RequestMapping("/prices")
public class PricesController {

	@Autowired
	PricesService pricesService;

	//entrada API:
	// Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
	// Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
	
	
	@PostMapping()
	public ReturnParamsService obtenerPrecioMomentoDado(@RequestBody EntryParamsService entryParams) {
					System.out.println("controller");	
		return pricesService.obtenerPrecioMomentoDado(entryParams);
	}
	
	@GetMapping()
	public ReturnParamsService obtenerPrimerPrecio() {
					
		return pricesService.encontrarUno();
	}
}
