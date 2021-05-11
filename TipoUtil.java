package com.mycompany.trabalho_n1;

import com.google.common.collect.ArrayTable;
import java.util.EnumSet;
import static com.mycompany.trabalho_n1.Tipo.AGUA;
import static com.mycompany.trabalho_n1.Tipo.ELETRICO;
import static com.mycompany.trabalho_n1.Tipo.FOGO;
import static com.mycompany.trabalho_n1.Tipo.GELO;
import static com.mycompany.trabalho_n1.Tipo.GRAMA;
import static com.mycompany.trabalho_n1.Tipo.PSIQUICO;

public class TipoUtil {
    
    private static ArrayTable<Tipo, Tipo, Double> buscarMesa;

    private static ArrayTable<Tipo, Tipo, Double> buscarMesa() {
        if (buscarMesa != null) {
            return buscarMesa;
        } else {
            buscarMesa = ArrayTable.create(EnumSet.allOf(Tipo.class), EnumSet.allOf(Tipo.class));
            for (Tipo row : buscarMesa.rowKeyList()) {
                for (Tipo column : buscarMesa.columnKeyList()) {
                    buscarMesa.put(row, column, 1.0);
                }
            }

            buscarMesa.put(FOGO, GRAMA, 2.0);
            buscarMesa.put(FOGO, GELO, 2.0);
            buscarMesa.put(FOGO, AGUA, 0.5);
            buscarMesa.put(FOGO, FOGO, 0.5);
            buscarMesa.put(AGUA, FOGO, 2.0);
            buscarMesa.put(AGUA, AGUA, 0.5);
            buscarMesa.put(AGUA, GRAMA, 0.5);
            buscarMesa.put(GRAMA, AGUA, 2.0);
            buscarMesa.put(GRAMA, FOGO, 0.5);
            buscarMesa.put(GRAMA, GRAMA, 0.5);
            buscarMesa.put(ELETRICO, AGUA, 2.0);
            buscarMesa.put(ELETRICO, GRAMA, 0.5);
            buscarMesa.put(ELETRICO, ELETRICO, 0.5);
            buscarMesa.put(PSIQUICO, FOGO, 0.5);
            buscarMesa.put(PSIQUICO, AGUA, 0.5);
            buscarMesa.put(PSIQUICO, GRAMA, 0.5);
            buscarMesa.put(PSIQUICO, ELETRICO, 0.5);
            buscarMesa.put(PSIQUICO, PSIQUICO, 0.5);
            buscarMesa.put(PSIQUICO, GELO, 0.5);
            buscarMesa.put(GELO, GRAMA, 2.0);
            buscarMesa.put(GELO, FOGO, 0.5);
            buscarMesa.put(GELO, AGUA, 0.5);
            buscarMesa.put(GELO, GELO, 0.5);
            return buscarMesa;
        }
    }

}
