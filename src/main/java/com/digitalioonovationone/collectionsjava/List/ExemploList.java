package com.digitalioonovationone.collectionsjava.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList{
    public static void main(String[] args) {
//        Criar uma lista com 7 alunos;
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);
        System.out.println("Notas: "+ notas);
//        Exibir a posição da nota 5.0
        System.out.println("Posição da nota 5: "+notas.indexOf(5d));
//        Adicionar a nota 8.0 na posição 4
        notas.add(4,8d);
        System.out.println(notas);
//        Substituir 5.0 por 6.0
        notas.set(notas.indexOf(5.0),6.0 );
        System.out.println(notas);
//        Conferir se nota 5.0 esta na lista
        System.out.println("Lista possui nota 5? "+notas.contains(5d));
//        Exibir notas na ordem informada
        System.out.println("Notas na ordem informada: "+notas);
//        Exibir a 3 nota adicionada
        System.out.println("Terceira nota adicionada: "+notas.get(2));
//        Exibir a menor nota
        System.out.println("Menor nota informada: "+ Collections.min(notas));
//        Exibir a maior nota
        System.out.println("Maior nota informada: "+ Collections.max(notas));
//        Exibir a soma das notas
        System.out.println("A soma das notas é:");
        Iterator<Double> iterator= notas.iterator();
        Double soma= 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma +=  next;
        }
        System.out.println(soma);
//        Exibir a media das notas
        System.out.println("A média das notas é: "+ soma/notas.size());
//        Remover a nota 0.0
        notas.remove(0d);
        System.out.println("Lista sem a nota 0.0: "+ notas);
//        Remover a nota da posição 0
        notas.remove(0);
        System.out.println("Lista sem a nota da posição 0: "+notas);
//        Remover notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next =iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println("Lista com notas maior ou igual a 7: "+ notas);
//        Apagar toda a lista
        notas.clear();
        System.out.println("Lista apagada: "+notas);
//        Verifique se a lista está mesmo vazia
        System.out.println("Lista está vazia? "+notas.isEmpty());
    }

         }