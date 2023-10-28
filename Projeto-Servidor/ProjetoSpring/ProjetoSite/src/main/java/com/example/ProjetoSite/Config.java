package com.example.ProjetoSite;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public  class Config {

    @Bean
    public String nomeDoGrupo() {
        return "<b>Diogo Trezza  RGM:31135323<br> Marcos Andrade  RGM:32009119 <br> Samuel Bia Medeiros  RGM:31422497</b>";
    }

    @Bean
    public String descricaoDoProjeto() {
        return "<hr><h1>Projeto 01</h1> Bem vindo ao nosso projeto! <br> Neste site temos 3 rotas. " +
                "Para entrar em alguma rota, digite a rota desejada e logo após digite seu texto" +
                "<br><br> <b>LEMBRANDO:</b>" +
                "<br><br> A ROTA 1 IRÁ DAR AS BOAS VINDAS. <br>Exemplo: <br>localhost:3500/rota1/José " +
                "<br><br> A ROTA 2 IRÁ RECEBER UM NÚMERO E IRÁ FAZER UMA TABUADA. <br>Exemplo: <br>localhost:3500/rota2/6" +
                "<br><br> A ROTA 3 É UMA CALCULADORA IMC QUE RECEBE PESO E ALTURA, DEPOIS VAI DIZER QUAL SEU IMC. <br>Exemplo: <br>localhost:3500/rota3/75/1.85" +
                "<br> <b>OBS: Ao usar o número decimal, utilizar o Ponto</b>";
    }

}
