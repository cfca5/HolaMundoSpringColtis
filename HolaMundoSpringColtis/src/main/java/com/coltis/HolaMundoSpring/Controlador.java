
package com.coltis.HolaMundoSpring;

import com.coltis.HolaMundoSpring.domain.Persona;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    public String inicio(Model model){
        
        //crear una variable mensaje y asignarle un valor
        var mensaje = "mensaje con Thymeleaf";
        
        //crear un objketo de instancia a la clase 
        var persona = new Persona();
        
        persona.setNombre("Johan");
        persona.setApellido("Gordillo");
        persona.setEmail("johan.gordillo@gmail.com");
        persona.setTelefono("231526");
        
         var persona2 = new Persona();
        
        persona2.setNombre("Melissa");
        persona2.setApellido("Gordillo");
        persona2.setEmail("melissa.gordillo@gmail.com");
        persona2.setTelefono("623734");
        
        var personas = Arrays.asList(persona, persona2);
        
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("personas", personas);
        
        
        return "index";
    }
    
}
