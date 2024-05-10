package cl.bootcamp.demo_spring_clase61.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola-mundo")
public class HolaMundoController {
	
	@GetMapping
	public String hola() {
		return "Hola Mundo";
	}
	
	@GetMapping("/chao")
	public String chao( @RequestParam String nombre,
						@RequestParam int edad
			) {
		
		int edadMas10=edad+10;
		
		return "Chao "+nombre+ " tu edad mas :"+edadMas10;
	}
	
	@GetMapping("/saludar/{nombre}/apellido/{apellido}")
	public String pathvariable(@PathVariable String nombre,
							   @PathVariable String apellido) {
		return "hola:--->"+nombre+" "+apellido;
	}
	
}
