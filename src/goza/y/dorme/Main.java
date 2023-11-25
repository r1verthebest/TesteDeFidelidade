package goza.y.dorme;

public class Main {

    public static void main(String[] args) {
        try {
            Jogador neymar = Jogador.criarJogador("Neymar");
            Jogador militao = Jogador.criarJogador("Militao");
            Jogador chico = Jogador.criarJogador("Chico");

            System.out.println("Neymar é " + TesteDeFidelidade.realizarTeste(neymar));
            System.out.println("Militão é " + TesteDeFidelidade.realizarTeste(militao));
            System.out.println("Chico é " + TesteDeFidelidade.realizarTeste(chico));
            Jogador jogadorDesconhecido = Jogador.criarJogador("Outro");
        } catch (JogadorNaoReconhecidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
