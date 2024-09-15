package es.pildoras.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestión y dirección de las operaciones finacieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public int getTelefono() {
		return telefono;
	}

	private CreacionInformeFinanciero informeFinanciero;
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	@Value("${telefono}")
	private int telefono;

}
