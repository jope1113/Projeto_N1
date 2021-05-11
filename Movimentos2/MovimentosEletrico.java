package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Tipo;
import com.mycompany.trabalho_n1.Movimentos;

public class MovimentosEletrico extends Movimentos {
    
    public MovimentosEletrico(String nome, int poder, int pontos) {
        super(nome, Tipo.ELETRICO, poder, pontos);
    }
    
    public static Movimentos thunderbolt = new MovimentosEletrico("Thunderbolt", 80, 10);
}