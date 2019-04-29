package br.com.balatech.bean;

import lombok.*;
import lombok.extern.java.Log;

@Data
@Builder
@Log
public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;

    public String imprimirNome() {

        log.info("Imprimindo nome....");

        return nome;
    }

}
