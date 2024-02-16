public class Atleta {

    protected String nome;
    protected int quantidadeParticipacoes;
    protected String melhorTempo;
    protected String cpf;
    private String dataNascimento;

    public Atleta () {}

    public Atleta(String nome, int quantidadeParticipacoes, String melhorTempo, String cpf, String dataNascimento) {
        this.nome = nome;
        this.quantidadeParticipacoes = quantidadeParticipacoes;
        this.melhorTempo = melhorTempo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeParticipacoes() {
        return quantidadeParticipacoes;
    }

    public void setQuantidadeParticipacoes(int quantidadeParticipacoes) {
        this.quantidadeParticipacoes = quantidadeParticipacoes;
    }

    public String getMelhorTempo() {
        return melhorTempo;
    }

    public void setMelhorTempo(String melhorTempo) {
        this.melhorTempo = melhorTempo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
