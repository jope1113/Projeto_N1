package com.mycompany.trabalho_n1;

import java.util.ArrayList;

public class Pokemon {
    
    private final String    nome;
    private final Tipo      tipo;
    private double          vida;
    private final int       ataque;
    private final int       defesa;
    private ArrayList<Movimentos> listaMovimentos;
    private final Movimentos      movimento1;
    private final Movimentos      movimento2;
    private final Movimentos      movimento3;
    private final Movimentos      movimento4;
 
public Pokemon(String nome, Tipo tipo, double vida, int ataque, int defesa, Movimentos movimento1, Movimentos movimento2, Movimentos movimento3, Movimentos movimento4) {

        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.movimento1 = movimento1;
        this.movimento2 = movimento2;
        this.movimento3 = movimento3;
        this.movimento4 = movimento4;

        this.listaMovimentos = new ArrayList<Movimentos>();
        this.listaMovimentos.add(movimento1);
        this.listaMovimentos.add(movimento2);
        this.listaMovimentos.add(movimento3);
        this.listaMovimentos.add(movimento4);
    }

    public Pokemon() {
        this.nome = null;
        this.tipo = null;
        this.vida = 0.0;
        this.ataque = 0;
        this.defesa = 0;
        this.movimento1 = null;
        this.movimento2 = null;
        this.movimento3 = null;
        this.movimento4 = null;
    }
    
    public void setVida(double health) {

        this.vida = vida;
}
    
    public String getNome() {

        return this.nome;
    }
    
    public Tipo getTipo() {

        return this.tipo;
}
    
     public double getVida() {

        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public ArrayList<Movimentos> getListaMovimentos() {
        return this.listaMovimentos;
    }
    
    public Movimentos getMovimento1() {
        return this.movimento1;
    }
    
     public Movimentos getMovimento2() {
        return this.movimento2;
    }
     
    public Movimentos getMovimento3() {
        return this.movimento3;
    }
    
    public Movimentos getMovimento4() {
        return this.movimento4;
    }
}