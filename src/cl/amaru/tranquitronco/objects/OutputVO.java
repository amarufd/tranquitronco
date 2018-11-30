package cl.amaru.tranquitronco.objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OutputVO {
	
	private String salida;

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	@Override
	public String toString() {
		return "OutputVO [salida=" + salida + "]";
	}
	
	

}
