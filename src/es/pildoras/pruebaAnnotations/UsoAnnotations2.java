package es.pildoras.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el class de configuracion

				AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
				//Pedir un bean al conetenedor
				
				/*
				 * Empleados Juan=contexto.getBean("comercialExperimentado",Empleados.class);
				 * Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
				 * 
				 * //¿apuntan al mismo objeto en memoria?
				 * 
				 * if(Juan==Antonio) { System.out.println("Apuntan al mismo lugar en memoria");
				 * System.out.println(Juan +"\n"+ Antonio); }else {
				 * System.out.println("No apuntan al mismo lugar en memoria");
				 * System.out.println(Juan +"\n"+ Antonio); }
				 */
				
				
				/*
				 * Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
				 * 
				 * System.out.println(empleado.getTareas());
				 * System.out.println(empleado.getInforme());
				 */
				DirectorFinanciero financiero=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
				
				System.out.println("Email del director: "+financiero.getEmail()+
						"\nNombre de la empresa: "+financiero.getNombreEmpresa()+
						"\nTelefono de la empresa: "+financiero.getTelefono());
				
				
				
				//Cerrael contexto
				contexto.close();
	}

}
