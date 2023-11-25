package goza.y.dorme;

public class TesteDeFidelidade {
    public static String realizarTeste(Jogador jogador) {
        return jogador.getFidelidade() == Fidelidade.FIEL ? "Fiel" : "Errei, fui mlk";
    }
}
