package es.pildoras.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el xml de configuracion
				ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

				
				//Pedir un bean al conetenedor
				
				Empleados Juan=contexto.getBean("comercialExperimentado",Empleados.class);
				Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
				
				//¿apuntan al mismo objeto en memoria?
				
				if(Juan==Antonio) {
					System.out.println("Apuntan al mismo lugar en memoria");
					System.out.println(Juan +"\n"+ Antonio);
				}else {
					System.out.println("No apuntan al mismo lugar en memoria");
					System.out.println(Juan +"\n"+ Antonio);
				}
				
				//Cerrael contexto
				contexto.close();
	}

}
