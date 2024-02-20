package com.example;

public class Jogo {
    
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Computador computador = new Computador();


    public Jogo() {
        monte.embaralhar();
    }


    public Carta distribuirCartaParaJogador(Jogador jogador) {
        // early return
        if(jogador.parou()) return null;

        var carta = monte.virar();
        jogador.receberCarta(carta);
        return carta;
    }


    public boolean acabou() {

        var osDoisPararam = jogador.parou() && computador.parou();
        var jogadorEstourou = jogador.getPontos() > 21;
        var computadorEstourou = computador.getPontos() > 21;

        return osDoisPararam || jogadorEstourou  || computadorEstourou;

    }

    public String resultado() {

        var pontuacaoIgual = jogador.getPontos() == computador.getPontos();
        var jogadorEstourou = jogador.getPontos() > 21;
        var computadorEstourou = computador.getPontos() > 21;
        var osDoisEstouraram = jogadorEstourou && computadorEstourou;
        var jogadorTemMaisPontos = jogador.getPontos() > computador.getPontos();
        
        if (pontuacaoIgual || osDoisEstouraram) return "Empatou";

        if (!jogadorEstourou && (jogadorTemMaisPontos || computadorEstourou)) return "Você ganhou!";
        return "Você Perdeu!";

    }


}
