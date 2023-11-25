package goza.y.dorme;

public class Jogador {
    private String nome;
    private Fidelidade fidelidade;

    private Jogador(String nome, Fidelidade fidelidade) {
        this.nome = nome;
        this.fidelidade = fidelidade;
    }

    public String getNome() {
        return nome;
    }

    public Fidelidade getFidelidade() {
        return fidelidade;
    }

    public static Jogador criarJogador(String nome) {
        switch (nome.toLowerCase()) {
            case "neymar":
                return new Jogador("Neymar", Fidelidade.FIEL);
            case "militao":
                return new Jogador("Militao", Fidelidade.FIEL);
            case "chico":
                return new Jogador("Chico", Fidelidade.FIEL);
            default:
                throw new JogadorNaoReconhecidoException("Jogador não reconhecido: " + nome);
        }
    }
}
