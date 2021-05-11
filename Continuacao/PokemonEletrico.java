package com.mycompany.trabalho_n1.Continuacao;

import com.mycompany.trabalho_n1.Movimentos;
import com.mycompany.trabalho_n1.Pokemon;
import com.mycompany.trabalho_n1.Tipo;

public class PokemonEletrico extends Pokemon {
    
    public PokemonEletrico (String nome, double vida, int ataque, int defesa, Movimentos movimento1, Movimentos movimento2, Movimentos movimento3, Movimentos movimento4) { 
        super (nome, Tipo.ELETRICO, vida, ataque, defesa, movimento1, movimento2, movimento3, movimento4); 
    } 
    
    public static Pokemon [] p = {}; 
}