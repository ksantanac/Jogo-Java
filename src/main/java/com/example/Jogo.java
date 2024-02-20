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
        return osDoisPararam || jogador.estorou() || computador.estorou();

    }

    public String resultado() {

        var pontuacaoIgual = jogador.getPontos() == computador.getPontos();
        var osDoisEstouraram = jogador.estorou() && computador.estorou();
        var jogadorTemMaisPontos = jogador.getPontos() > computador.getPontos();
        
        if (pontuacaoIgual || osDoisEstouraram) return "Empatou";

        if (!jogador.estorou() && (jogadorTemMaisPontos || computador.estorou())) return "Você ganhou!";
        return "Você Perdeu!";

    }


}
