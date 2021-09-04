package com.digitalioonovationone.collectionsjava.Set;

import java.lang.reflect.Array;
import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {
//        Crie um conjunto com as cores do arco-íris:
        Set<String> cores = new HashSet<>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");
//        Exiba as cores uma abaixo da outra
        for (String cor:cores){
            System.out.println(cor);
        }
//        Exiba a quantidade de cores que o arco-íris possui
        System.out.println("O arco-íris possui: "+cores.size()+" cores");
//        Exiba as cores em ordem alfabetica
        Set<String> coresOrdenadas = new TreeSet<>(cores);
        System.out.println("Cores ordenadas: "+coresOrdenadas);
//        Exiba as cores na ordem inversa a informada
        Set<String> coresInserida = new LinkedHashSet<>();
        coresInserida.add("vermelho");
        coresInserida.add("laranja");
        coresInserida.add("amarelo");
        coresInserida.add("verde");
        coresInserida.add("azul");
        coresInserida.add("anil");
        coresInserida.add("violeta");
        List<String> coresInversa = new ArrayList<>(coresInserida);
        Collections.reverse(coresInversa);
        System.out.println("Cores inversa: "+coresInversa);
//        Exiba as cores que começam com v
        System.out.println("Cores que começam com v: ");
        for (String cor: cores){
            if (cor.startsWith("v")){
                System.out.println(cor);
            }

        }
//        Remova todas as cores que não começam com v
        Iterator<String> iterator2 = cores.iterator();
        while (iterator2.hasNext()){
            if (!iterator2.next().startsWith("v")){
                iterator2.remove();
            }
        }
        System.out.println(cores);
//        Limpe o conjunto
        cores.clear();
        System.out.println("Lista vazia: "+cores);
//        Confira se a lista está vazia
        System.out.println("Lista está vazia? "+cores.isEmpty());
    }
}
