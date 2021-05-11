package com.mycompany.trabalho_n1;


public enum Eficacia_Danos {
    
    INEFICAS(0.0),
    SEM_EFEITOS(0.5),
    REGULAR(1.0),
    SUPER_EFETIVO(2.0);
    
    private double efetividade;

    private Eficacia_Danos(double efetividade) {
        this.efetividade = efetividade;
    }

    public Double getVal() {
        return this.efetividade;
    }

    @Override
    public String toString() {
        return Double.toString(this.efetividade);
    }
}