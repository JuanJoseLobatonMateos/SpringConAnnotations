package es.pildoras.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//leer el xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		//Pedir un bean al conetenedor
		
		Empleados Juan=contexto.getBean("comercialExperimentado",Empleados.class);
		
		//Usar el bean
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		
		
		//Cerrael contexto
		contexto.close();
	}

}
