package com.alvaro.retonapptilus.controller;
/*********************
*
*
* Clase Controlador auxiliar para diferente formato de datos de entrada ,, 
* 
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
import com.alvaro.retonapptilus.service.EntryParamsAuxDto;
import com.alvaro.retonapptilus.service.EntryParamsDto;
import com.alvaro.retonapptilus.service.PricesService;
import com.alvaro.retonapptilus.service.ReturnParamsDto;

@RestController
@RequestMapping(value = "/prices/aux" , params = {"fecha","hora","minutos","productId","brandId"} )
public class PricesAuxController {

	@Autowired
	PricesService pricesService;

	//entrada API:
	// Acepte como parámetros de entrada: fecha de aplicación, identificador de producto, identificador de cadena.
	// Devuelva como datos de salida: identificador de producto, identificador de cadena, tarifa a aplicar, fechas de aplicación y precio final a aplicar.
	
	
	@GetMapping()
	public ReturnParamsDto obtenerPrecioMomentoDado( EntryParamsAuxDto entryParamsAux) {
					System.out.println(this.getClass());										
		//montar entryParams desde entryParamsAux, es decir, montar objeto Instant a partir de fecha y hora
		EntryParamsDto entryParams = new EntryParamsDto(); 
		try {
							System.out.println(entryParamsAux);
			entryParams.setInstante(entryParamsAux.toInstant());
			entryParams.setBrandId(entryParamsAux.getBrandId());
			entryParams.setProductId(entryParamsAux.getProductId());
		}
		catch(Exception e) {
			
		}
		
		return pricesService.obtenerPrecioMomentoDado(entryParams);
	}
	
//	@GetMapping()
//	public ReturnParamsService obtenerPrimerPrecio() {
//					
//		return pricesService.encontrarUno();
//	}
}
