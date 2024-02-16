import java.lang.System;
public class Main {
    public static void main(String[] args) {

        Atleta atleta = new Atleta();

        atleta.setNome("Luiz Moura");
        atleta.setQuantidadeParticipacoes(8);
        atleta.setDataNascimento("03-11-1990");

        System.out.println("Nome do atleta: " + atleta.getNome());
        System.out.println("Quantidade de Participações: " + atleta.getQuantidadeParticipacoes());

        System.out.println("fim do programa");








    }
}