package br.com.balatech.bean;

import lombok.val;
import lombok.var;

public class TesteVariavel {

    public static void main(String[] args) {
        //Variáveis comuns
        String nome = "Joao";
        int idade = 4;

        //Lombok: Variáveis final
        val nomeVal = "Joao";
        val idadeVal = 3;
        val valor = 3.0;

        //Lombok: Variáveis comuns
        var nomeVar = "Joao";
        var idadeVar = 5;
    }
}
