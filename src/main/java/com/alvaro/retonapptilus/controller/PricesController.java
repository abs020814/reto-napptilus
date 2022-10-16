package com.alvaro.retonapptilus.controller;
/*********************
*
*
* Clase Controlador PricesController ,, 
* 	entrada API:
*	-> Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, 
*												identificador de cadena.
*	<- Devuelva como datos de salida: identificador de producto, identificador de cadena, 
*						tarifa a aplicar, fechas de aplicación y precio final a aplicar.
*
*		la clase Instant convierte la fecha de entrada a UTC, sin embargo, en bbdd se habían grabado
*		los datos tal cual el enunciado del reto, por tanto hay respuestas no esperadas
*		SOLUCION: intentar que no haga esa conversión, o grabar datos de prueba tndo eso en cuenta
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.retonapptilus.model.PricesModel;
import com.alvaro.retonapptilus.service.EntryParamsDto;
import com.alvaro.retonapptilus.service.PricesService;
import com.alvaro.retonapptilus.service.ReturnParamsDto;

@RestController
@RequestMapping(value = "/prices" , params = {"instante","productId","brandId"} )
public class PricesController {

	@Autowired
	PricesService pricesService;

	//entrada API:
	// Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
	// Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
	
	
	@GetMapping()
	public ReturnParamsDto obtenerPrecioMomentoDado( EntryParamsDto entryParams) {
					System.out.println(this.getClass());	
					System.out.println(entryParams.getInstante());
		return pricesService.obtenerPrecioMomentoDado(entryParams);
	}
	
//	@GetMapping()
//	public ReturnParamsService obtenerPrimerPrecio() {
//					
//		return pricesService.encontrarUno();
//	}
}
