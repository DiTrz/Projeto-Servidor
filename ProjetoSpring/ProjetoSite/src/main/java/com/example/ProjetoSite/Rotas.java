package com.example.ProjetoSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rotas {

    @Autowired
    private String nomeDoGrupo;

    @Autowired
    private String descricaoDoProjeto;


    @GetMapping("/")
    public String apresentacao(){

        return nomeDoGrupo + descricaoDoProjeto;
    }
    @GetMapping("/rota1/{texto}")
    public String rota1(@PathVariable String texto){
        return "Bem vindo ao nosso site, " + texto;
    }

    @GetMapping("/rota2/{num}")
    public String rota2(@PathVariable int num) {
        String tabuada = "";

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            tabuada += "<br>" +  num + " x " + i + " = " + resultado;
        }

        return "<b>TABUADA <hr>" +  tabuada;
    }
    @GetMapping("/rota3/{var1}/{var2}")
    public String rota3(@PathVariable double var1,@PathVariable double var2){
        double imc = (var1/(var2*var2));
        String resultado = "";
        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc > 18.5 && imc < 24.99){
            resultado = "Peso Ideal";
        } else if (imc > 25 && imc < 29.99){
            resultado = "Sobrepeso";
        } else if (imc > 30 && imc < 34.99){
            resultado = "Obesidade";
        }  else if (imc > 35 && imc < 39.99){
            resultado = "Obesidade II";
        } else if (imc > 40){
            resultado = "Obesidade III";
        }
        return "<b>Calculadora IMC</b><hr>Você digitou: " + var1 + " e: " + var2 + "<br> O IMC é igual a: " + imc +
                "<br>--------------------------------" +
                "<br>   Resultado:" + resultado +
                "<br>--------------------------------" ;
    }



}
