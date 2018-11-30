package cl.amaru.tranquitronco.objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InputVO {
	
	private String entrada;

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	@Override
	public String toString() {
		return "InputVO [entrada=" + entrada + "]";
	}
	
}
