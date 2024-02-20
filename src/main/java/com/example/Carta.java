package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String imagePath() {

        String stringNumero = "" + numero;
        
        if (numero == 1) stringNumero = "Ace";
        if (numero == 11) stringNumero = "Jack";
        if (numero == 12) stringNumero = "Queen";
        if (numero == 13) stringNumero = "King";


        return "classic-cards/" + numero + naipe + ".png";
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }
    
}
