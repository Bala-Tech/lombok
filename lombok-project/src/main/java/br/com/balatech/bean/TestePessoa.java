package br.com.balatech.bean;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoaComParametros = new Pessoa("Joao",
                "1234567", 20);
        Pessoa pessoaComParametros2 = new Pessoa("Joao",
                "1234567", 20);

        System.out.println(pessoaComParametros);
        System.out.println(pessoaComParametros.equals(pessoaComParametros2));

        Pessoa pessoaComBuilder =
                Pessoa.builder()
                        .cpf("3312312")
                        .idade(12)
                        .nome("Joaquim").build();

        System.out.println(pessoaComBuilder);

        System.out.println(pessoaComBuilder.imprimirNome());
    }
}
