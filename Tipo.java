package com.mycompany.trabalho_n1;


public enum Tipo {
    
    FOGO,
    AGUA,
    GRAMA,
    ELETRICO,
    PSIQUICO,
    GELO,
    
    public static double verificarStab(Movimentos movimento, Pokemon pokemon) {

        if (movimento.getTipo() == pokemon.getTipo()) {
            return 1.5;
        } else {
            return 1.0;
        }
    }
    
    public static double verificarEfeito (Movimentos movimento, Pokemon pokemon) {
        Tipo tipoMovimento = movimento.getTipo();
        Tipo tipoPokemon = pokemon.getTipo();
}
     if (tipoMovimento.equals(FOGO)&& tipoPokemon.equals(GRAMA) || tipoPokemon.equals(GELO)) {
    
            return SUPER_EFETIVO.getVal();

        } else if (tipoMovimento.equals(FOGO) && (tipoPokemon.equals(FOGO) || tipoPokemon.equals(AGUA))) {

            return SEM_EFEITOS.getVal();

        } else if (tipoMovimento.equals(AGUA) && tipoPokemon.equals(FOGO)) {

            return SUPER_EFETIVO.getVal();

        } else if (tipoMovimento.equals(AGUA) && (tipoPokemon.equals(AGUA) || tipoPokemon.equals(GRAMA))) {

            return SEM_EFEITOS.getVal();

        } else if (tipoMovimento.equals(GRAMA) && (tipoPokemon.equals(AGUA))) {

            return SUPER_EFETIVO.getVal();

        } else if (tipoMovimento.equals(GRAMA) && (tipoPokemon.equals(FOGO) || tipoPokemon.equals(GRAMA))) {

            return SEM_EFEITOS.getVal();

        } else if (tipoMovimento.equals(ELETRICO) && (tipoPokemon.equals(AGUA))) {

            return SUPER_EFETIVO.getVal();

        } else if (tipoMovimento.equals(ELETERICO) && (tipoPokemon.equals(GRAMA) || tipoPokemon.equals(ELECTRICO))) {

            return SEM_EFEITOS.getVal();

        } else if (tipoMovimento.equals(PSIQUICO) && (tipoPokemon.equals(FOGO) || tipoPokemon.equals(GRAMA) || tipoPokemon.equals(ELECTRICO) || (tipoPokemon.equals(AGUA) || tipoPokemon.equals(GELO) )) {

            return SEM_EFEITOS.getVal();

        } else if (tipoMovimento.equals(GELO) && (tipoPokemon.equals(GRAMA))) {

            return SUPER_EFFECTIVE.getVal();
        
            else {

            return REGULAR.getVal();
        }
    }
}