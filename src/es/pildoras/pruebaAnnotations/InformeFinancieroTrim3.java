package es.pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component

public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe del trimestre 3";
	}

}
