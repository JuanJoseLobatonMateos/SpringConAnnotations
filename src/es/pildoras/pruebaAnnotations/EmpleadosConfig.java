package es.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaAnnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {
	//Definir el bean para informe financiero dto compras
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {//sera el id del bean inyectado
		
		return new InformeFinancieroDtoCompras();
		
	}
	
	
	
	//definir el bean para un directorFinanciero e inyectar dependencias
	@Bean
	public DirectorFinanciero directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
