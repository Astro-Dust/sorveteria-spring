package com.moonlit.sorveteria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.Normalizer;
import java.util.regex.Pattern;

@Controller
@RequestMapping(produces = "text/html;charset=UTF-8")
public class SorveteriaController {

    @GetMapping("/escolher-sorvete")
    public String home() {
        return "escolher-sorvete";
    }

    @PostMapping("/processar-formulario")
    public String processarFormulario(@RequestParam String saborInput) {

        String saborNormalizado = normalizeString(saborInput);

        String[] sabores = {"abacaxi", "baunilha", "chocolate", "flocos", "limao", "limão", "maracuja", "maracujá", "morango"};

        for (String sabor : sabores) {
            if (normalizeString(sabor).equalsIgnoreCase(saborNormalizado)) {
                return "redirect:/paginas-sorvetes/" + sabor;
            }
        }

        return "escolher-sorvete";

    }

    private String normalizeString(String input) {
        // remove acentos e caracteres especiais
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").toLowerCase();
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
