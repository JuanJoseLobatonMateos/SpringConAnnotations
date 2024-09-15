package es.pildoras.pruebaAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//para scope singleton no hace falta anotacion ya que por drfecto es singleton
public class ComercialExperimentado implements Empleados {
	
	//Ejecucion de codigo despues de creacion del bean
	@PostConstruct
	private void init() {
		System.out.println("Este es el metodo init");

	}
	
	//Ejecucion de codigo despues de apagado de bean
	@PreDestroy
	private void destroy() {
		System.out.println("Este es el metodo destroy");

	}
	
	public ComercialExperimentado() {
		
	};
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		super();
		this.nuevoInforme = nuevoInforme;
	}*/
	/*@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender mas";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}
	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero nuevoInforme;
	

}
