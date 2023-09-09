package com.moonlit.sorveteria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SorveteriaController {

    @GetMapping("/escolher-sorvete")
    public String home() {
        return "escolher-sorvete";
    }

    @PostMapping("/processar-formulario")
    public String processarFormulario(@RequestParam String sorveteInput) {

        switch (sorveteInput.toLowerCase()) {
            case "abacaxi":
                return "redirect:/paginas-sorvetes/abacaxi";
            case "baunilha":
                return "redirect:/paginas-sorvetes/baunilha";
            case "chocolate":
                return "redirect:/paginas-sorvetes/chocolate";
            case "flocos":
                return "redirect:/paginas-sorvetes/flocos";
            case "limão":
            case "limao":
                return "redirect:/paginas-sorvetes/limao";
            case "maracuja":
            case "maracujá":
                return "redirect:/paginas-sorvetes/maracuja";
            case "morango":
                return "redirect:/paginas-sorvetes/morango";
            default:
                return "escolher-sorvete";
        }
    }

    @GetMapping("/paginas-sorvetes/abacaxi")
    public String abacaxi() {
        return "/paginas-sorvetes/abacaxi";
    }

    @GetMapping("/paginas-sorvetes/baunilha")
    public String baunilha() {
        return "/paginas-sorvetes/baunilha";
    }

    @GetMapping("/paginas-sorvetes/chocolate")
    public String chocolate() {
        return "/paginas-sorvetes/chocolate";
    }

    @GetMapping("/paginas-sorvetes/flocos")
    public String flocos() {
        return "/paginas-sorvetes/flocos";
    }

    @GetMapping("/paginas-sorvetes/limao")
    public String limao() {
        return "/paginas-sorvetes/limao";
    }

    @GetMapping("/paginas-sorvetes/maracuja")
    public String maracuja() {
        return "/paginas-sorvetes/maracuja";
    }

    @GetMapping("/paginas-sorvetes/morango")
    public String morango() {
        return "/paginas-sorvetes/morango";
    }

}
