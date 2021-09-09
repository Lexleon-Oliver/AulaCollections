package com.digitalioonovationone.collectionsjava.StreamsApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {
    /* É uma classe que não recebeu um nome e é tanto declarada e instanciada em uma unica instrução.Você deve considerar
    o uso de uma classe anonima sempre que precisar criar uma classe que será instanciada uma só vez;
    Sem a classe anônima:*/
    public static void main(String[] args) {
        /*
        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};
        gatos.sort(new ComparatorIdade());
        */
    }

}
/*
class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
*/


//Com a classe anônima
class ClasseAnonimaExemplo {
    public static void main(String[] args) {
       /* List<Gato> gatos2 = new ArrayList<>() {{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};
        gatos2.sort(new Comparator<Gato>() {
            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }
        });*/
    }
}