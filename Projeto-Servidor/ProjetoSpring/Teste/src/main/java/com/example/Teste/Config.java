package com.example.Teste;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public  class Config {

    @Bean
    public String nomeDoGrupo() {
        return "Nome do Grupo: <br><br> Diogo Trezza <br> RGM:31135323";
    }

    @Bean
    public String descricaoDoProjeto() {
        return "<hr><br>Bem vindo ao nosso projeto!<br> Neste site temos 3 rotas <br>" +
                "Para entrar em alguma rota, digite a rota desejada e logo após digite seu texto" +
                "<br><br> <b>LEMBRANDO:" +
                "<br><br> A ROTA 1 IRÁ DAR AS BOAS VINDAS <br>Exemplo: localhost:3500/rota1/seu nome aqui" +
                "<br><br> A ROTA 2 IRÁ RECEBER UM NÚMERO E IRÁ FAZER UMA TABUADA <br>Exemplo: localhost:3500/rota2/6" +
                "<br><br> A ROTA 3 É UMA CALCULADORA IMC, IRÁ RECEBER DOIS NÚMEROS E DEPOIS DIZER QUAL SEU IMC <br>Exemplo: localhost:3500/rota3/75/1.85" +
                "<br> OBS: Ao usar o número decimal, utilizar o Ponto";
    }

}