package co.scastillos.ucentral.quiz.controladores;

import co.scastillos.ucentral.quiz.entidades.ElementoTecnologico;
import co.scastillos.ucentral.quiz.servicios.ServicioTecnologia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorTecnologia {

   @Autowired
   ServicioTecnologia servicioTecnologia;

   @GetMapping("/")
   public String inicio(){
       return "redirect:/listar";
   }

    @GetMapping("/ingresar")
    public String formularioIngresar(Model model){
        ElementoTecnologico tecnologia = new ElementoTecnologico();
        model.addAttribute("tecnologia",tecnologia);
        return "ingresar-tecnologia";
    }

    @PostMapping("/registrar")
    public String registrarTecnologia(@ModelAttribute("tecnologia") ElementoTecnologico tecnologia){
        servicioTecnologia.crear(tecnologia);
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public String listarTecnologias(Model model){
        model.addAttribute("tecnologias",servicioTecnologia.listarTecnologias());
        return "lista";

    }

}

