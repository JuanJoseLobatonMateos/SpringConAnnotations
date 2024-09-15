package es.pildoras.pruebaAnnotations;

import org.springframework.stereotype.Component;

@Component

public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion del informe catastrofico del trimestre 2";
	}

}
