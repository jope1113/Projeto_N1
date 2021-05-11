package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Tipo;

public class MovimentosPsiquico extends Movimentos{
    
    public MovimentosPsiquico(String nome, int poder, int pontos) {
        super(nome, Tipo.PSIQUICO, poder, pontos);
    }
    
    public static Movimentos psyshock = new MovimentosPsiquico("Psyshock", 80, 10);
}