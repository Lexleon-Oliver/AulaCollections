package com.digitalioonovationone.collectionsjava.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        //    Atividades para praticar:
//    *Resolver os exercicios de ExemploList com LinkedList colocando o nome de notas2 e adicione os elementos
//    do arraylist na notas2.
//    *Mostre a primeira nota de notas2 sem removê-la.
//    *Mostre a primeira nota de notas2 removendo-a.
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        //        Exibir a posição da nota 5.0
        System.out.println("Posição da nota 5: "+notas2.indexOf(5d));
        //        Adicionar a nota 8.0 na posição 4
        notas2.add(4,8d);
        System.out.println("Nota 8 adicionada a posição 4: "+notas2);
        //        Substituir 5.0 por 6.0
        notas2.set(notas2.indexOf(5d),6d );
        System.out.println("Nota 5 alterada para 6: "+ notas2);
        //        Conferir se nota 5.0 esta na lista
        System.out.println("Nota 5 ainda esta na lista? "+notas2.contains(5d));
        //        Exibir notas na ordem informada
        System.out.println("Notas em ordem de inserção: "+notas2);
        //        Exibir a 3 nota adicionada
        System.out.println("A terceira nota a ser informada, foi: "+notas2.get(2));
        //        Exibir a menor nota
        System.out.println("Menor nota informada: "+ Collections.min(notas2));
        //        Exibir a maior nota
        System.out.println("Maior nota informada: "+ Collections.max(notas2));
        //        Exibir a soma das notas
        Iterator<Double> iterator= notas2.iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma de todas as notas: "+soma);
        //        Exibir a media das notas
        System.out.println("A media das notas é: "+soma/notas2.size());
        //        Remover a nota 0.0
        notas2.remove(0d);
        System.out.println("Nota 0.0 removida: "+notas2);
        //    *Mostre a primeira nota de notas2 sem removê-la.
        System.out.println("Primeira nota: " +notas2.getFirst());
        System.out.println("Primeira nota: " +notas2.peekFirst());
        //    *Mostre a primeira nota de notas2 removendo-a.
        System.out.println("Primeira nota com remoção da nota: "+notas2.pollFirst());
        System.out.println("Notas com remoção da primeira: "+notas2);
        //        Remover a nota da posição 0
        notas2.remove(0);
        System.out.println("Primeira nota removida: "+notas2);
        //        Remover notas menores que 7
        Iterator<Double> iterator1 = notas2.iterator();
        while (iterator1.hasNext()){
            Double next =iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println("Notas menores que 7 removidas: "+notas2);
        //        Apagar toda a lista
        notas2.clear();
        System.out.println("Notas apagadas: "+notas2);
        //        Verifique se a lista está mesmo vazia
        System.out.println("Lista está vazia? "+notas2.isEmpty());
    }
}

