package com.alvaro.retonapptilus;
/*********************
*
*
* Clase Configuration, donde inserto los datos de prueba ,, 
* 
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
						+ "1,'2020-06-14 00:00:00.0',"
						+ "'2020-12-31 23:59:59.9', 1, "
						+ "35455, 0 , 35.50, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-14 15:00:00.0',"
						+ "'2020-06-14 18:30:00.0', 2, "
						+ "35455, 1 , 25.45, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-15 00:00:00.0',"
						+ "'2020-06-15 11:00:00.0', 3, "
						+ "35455, 1 , 30.50, 'EUR'); ");
				jdbcTemplate.execute("Insert into Prices (Brand_Id,"
						+ "Start_Date,End_Date,Price_List,"
						+ "Product_Id,Priority,Price,Curr) values ("
						+ "1,'2020-06-15 16:00:00.0',"
						+ "'2020-12-31 23:59:59.9', 4, "
						+ "35455, 1 , 38.95, 'EUR'); ");
			}
		};
	}
	
	
}
