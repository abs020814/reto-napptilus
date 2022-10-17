package com.alvaro.retonapptilus;

/*********************
*
*
* Clase Configuration, donde inserto los datos de prueba ,, 
* 
* 	INSERTO TAL CUAL LA INFORMACIÓN FACILITADA. SIN EMBARGO VIENDO EN LA CONSOLA H2, SE VERA QUE LA HORA ES DIFERENTE, 
* 	ES DEBIDO A QUE LA CLASE INSTANT ASUME FECHA+HORA EN HORARIO UTC, PERO EL TIMESTAMP DE LA BASE DE DATOS ES HORA LOCAL
*   Y POR ESO LO TRANSFORMA, UNICAMENTE A NIVEL INTERNO DE LA BBDD H2 POR TANTO ES TRANSPARENTE DE CARA A LOS RESULTADOS
* 
* (Alvaro B.S. octubre 2022)
*
*
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import java.time.Instant;
import java.util.concurrent.ThreadLocalRandom;

@Configuration
public class PricesInit {

	@Autowired JdbcTemplate jdbcTemplate; 
	@Bean
	CommandLineRunner initDb() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
				
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-14T00:00:00.0Z',"
						+ "'2020-12-31T23:59:59.9Z', 1, "
						+ "35455, 0 , 35.50, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-14T15:00:00.0Z',"
						+ "'2020-06-14T18:30:00.0Z', 2, "
						+ "35455, 1 , 25.45, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-15T00:00:00.0Z',"
						+ "'2020-06-15T11:00:00.0Z', 3, "
						+ "35455, 1 , 30.50, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-15T16:00:00.0Z',"
						+ "'2020-12-31T23:59:59.9Z', 4, "
						+ "35455, 1 , 38.95, 'EUR'); ");
					/**
					 * 
					 * PRUEBAS DE MUCHOS REGISTROS....
				for (int i=0; i<100; i++) {
					jdbcTemplate.execute("Insert into Prices (Brand_Id,"
							+ "Start_Date,End_Date,Price_List,"
							+ "Product_Id,Priority,Price,Curr) values ("
							+ "1,'"+rndFecha().toString()+"',"
							+ "'"+rndFecha().toString()+"', "+rndInt()+","
							+ "35455, "+rndInt()+" ,"+rndDouble()+", 'EUR'); ");
				
				}
				jdbcTemplate.execute("delete from Prices where Start_Date >= End_date;");
				*/
			}
			
			public Instant rndFecha() {
			    long random = ThreadLocalRandom
			      .current()
			      .nextLong(0, Long.parseLong("999999999"));
			    
			    return Instant.ofEpochSecond(random);
			}
			private int rndInt() {
				return ThreadLocalRandom.current().nextInt(1,10);
			}
			private double rndDouble() {
				return ThreadLocalRandom.current().nextDouble(1,10.0);
			}
		};
	}
	
	
}
