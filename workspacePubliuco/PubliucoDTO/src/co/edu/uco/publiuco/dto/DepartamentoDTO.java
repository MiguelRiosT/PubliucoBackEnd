package co.edu.uco.publiuco.dto;

import java.util.UUID;
import lombok.Data;

@Data
public class DepartamentoDTO {
	
	private UUID codigo;
	private PaisDTO pais;
	private String nombre;
}
