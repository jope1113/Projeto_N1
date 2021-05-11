package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Tipo;


public class MovimentosFogo extends Movimentos {
    
    public MovimentosFogo(String nome, int poder, int pontos) {
        super(nome, Tipo.FOGO, poder, pontos);
    }
    
    public static Movimentos flareBlitz = new MovimentosFogo("Flare Blitz", 120, 15);
    public static Movimentos heatWave = new MovimentosFogo("Heat Wave", 95, 10);
}
