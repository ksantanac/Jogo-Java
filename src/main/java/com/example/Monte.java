package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        // fazendo um foreach para percorrer os valores de naipe
        for (Naipe naipe: Naipe.values()){
            for(int i = 1; i <= 13; i++){
                // o segundo param do construtor Carta será a variavel dentro do objeto Naipe
                cartas.add(new Carta(i, naipe));
            }
        }
    }

    public void embaralhar(){
        // Collections.shuffle(cartas) = vai embaralhar a lista de cartas
        Collections.shuffle(cartas);
    }

    public Carta virar(){
        return cartas.remove(0);
    }

}
