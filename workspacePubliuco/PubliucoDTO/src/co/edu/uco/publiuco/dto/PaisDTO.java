package co.edu.uco.publiuco.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaisDTO {

	private UUID codigo;
	private String nombre;
	
}
