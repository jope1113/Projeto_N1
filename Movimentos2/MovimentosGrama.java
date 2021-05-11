package com.mycompany.trabalho_n1.Movimentos2;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Tipo;


public class MovimentosGrama extends Movimentos {
    
    public MovimentosGrama(String nome, int poder, int pontos) {
        super(nome, Tipo.GRAMA, poder, pontos);
    }
    
    public static Movimentos petalDance = new MovimentosGrama("Petal Dance", 120, 10);
    public static Movimentos solarBeam = new MovimentosGrama("Solar Beam", 120, 10);
}
