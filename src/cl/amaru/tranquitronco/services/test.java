package cl.amaru.tranquitronco.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.amaru.tranquitronco.objects.InputVO;
import cl.amaru.tranquitronco.objects.OutputVO;

@Path("/cotizador_service")
public class test {
	
	@POST
    @Path("/obtener/tipo_seguro")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON) 
    public OutputVO obtenerTipoSeguro(InputVO input){
		
		OutputVO output = new OutputVO();
		output.setSalida(input.getEntrada());

        return output;
    }

}
