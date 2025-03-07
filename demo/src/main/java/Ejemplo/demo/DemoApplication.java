package Ejemplo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class DemoApplication {

	@GetMapping("/")
	public String home(){
		return "Hola mundo desde Spring Boot";
	}

	@GetMapping("/About")
	public String about(){
		return "estamos en About";


	}

	@GetMapping("/us")
	public String us(){
		return "Esamos en endPoint de nosotros";
	}

	@GetMapping("/find/{id}/{nombre}")
	public String find(@PathVariable String id, @PathVariable String nombre){
		return "El id a buscar es: " + id + " y el nombre es " + nombre;
	}

	@GetMapping("/login/{username}/{password}")
	public HashMap<String, Object> login(@PathVariable String username, @PathVariable String password){
		HashMap<String, Object> objJson = new HashMap<>();
		objJson.put("username", username);
		objJson.put("password", password);
		return objJson;
	}
}

