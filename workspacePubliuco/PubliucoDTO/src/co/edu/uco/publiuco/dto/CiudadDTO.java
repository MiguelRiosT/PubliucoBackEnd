package co.edu.uco.publiuco.dto;

import java.util.UUID;

import lombok.Data;

@Data 
public class CiudadDTO {
	
	private UUID codigo;
	private DepartamentoDTO departamento;
	private String nombre;
}
