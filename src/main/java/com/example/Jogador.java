package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou;

    public void receberCarta(Carta carta){
        cartas.add(carta);

        var pontos = carta.getNumero();

        if(pontos > 10) pontos = 10;

        this.pontos += pontos;
    }

    public void para(){
        parou = true;
    }

    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public boolean parou() {
        return parou;
    }

    public boolean estorou() {
        return pontos > 21;
    }

}
