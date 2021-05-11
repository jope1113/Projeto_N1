package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Tipo;


public class MovimentosAgua extends Movimentos {
    
    public MovimentosAgua(String nome, int poder, int pontos) {
        super(nome, Tipo.AGUA, poder, pontos);
    }
    
    public static Movimentos waterPulse = new MovimentosAgua("Water Pulse", 60, 20);
    public static Movimentos hydroPump = new MovimentosAgua("Hydro Pump", 150, 5);
}