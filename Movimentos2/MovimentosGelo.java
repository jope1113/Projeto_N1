package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Tipo;

public class MovimentosGelo extends Movimentos {
    
    public MovimentosGelo(String nome, int poder, int pontos) {
        super(nome, Tipo.GRAMA, poder, pontos);
    }
    
    public static Movimentos blizzard = new MovimentosGelo("Blizzard", 110, 5);
    public static Movimentos iceBall = new MovimentosGelo("Ice Ball", 30, 20);
}