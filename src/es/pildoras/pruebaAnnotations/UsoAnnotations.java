package es.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//leer el xml de configuracion
		//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		//leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Pedir un bean al conetenedor
		
		Empleados Juan=contexto.getBean("comercialExperimentado",Empleados.class);
		
		//Usar el bean
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		
		
		//Cerrael contexto
		contexto.close();
	}

}
