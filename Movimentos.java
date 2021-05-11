package com.mycompany.trabalho_n1;

public class Movimentos {

    static void ataque(Pokemon seuPoke, Pokemon oponentePoke, Movimentos movimento1) {
        throw new UnsupportedOperationException("Não .");
    }
    
    private final String nome;
    private final Tipo tipo;
    private final int poder;
    private int pontos;
    
    public Movimentos(String nome, Tipo tipo, int poder, int pontos) {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
        this.pontos = pontos;
    }
    
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public Tipo getTipo() {
        return this.tipo;
    }
    
    public int getPoder() {
        return this.poder;
    }
    
    public int getPontos() {
        return this.pontos;
    }
    
    public static void ataque(pokemonAtacante, pokemonDefensor, Movimentos movimentoAtacante) {
        int level = 100;
        int a = atacante.getAtaque();
        int d = defensor.getDefesa();
        int poder = movimentoAtacante.getPoder();
        double stab = Tipo.verificarStab(movimentoAtacante, atacante);
        double efetividade = Tipo.verificarEfeito(movimentoAtacante, defensor);
        double modifcador = (stab * efetividade);

        double dano = (((((((((2 * level) / 5) + 2) * poder) * (a / d))) / 50) + 2) * modificador);

        defensor.setVida(defensor.getVida() - dano);
        
        movimentoAtacante.pontos--;
    }
}