package com.digitalioonovationone.collectionsjava.Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //        Criar uma lista com 7 alunos;
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0d);
        notas.add(3.6);
        System.out.println("Notas: "+ notas);
//        Exibir a posição da nota 5.0
//        Não é possivel
//        Adicionar a nota 8.0 na posição 4
//         Não é possivel
//        Substituir 5.0 por 6.0
//         Não é possivel
//        Conferir se nota 5.0 esta na lista
        System.out.println("Lista possui nota 5? "+notas.contains(5d));
//        Exibir a 3 nota adicionada
//         Não é possivel
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
//         Não é possivel
//        Remover notas menores que 7
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next =iterator1.next();
            if (next<7){
                iterator1.remove();
            }
        }
        System.out.println("Lista com notas maior ou igual a 7: "+ notas);
//        Exibir notas na ordem informada
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("Notas na ordem informada: "+ notas2);
//        Exibir notas em ordem crescente
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Notas na ordem natural dos numeros (crescente): "+notas3);
//        Apagar toda a lista
        notas.clear();
        System.out.println("Lista apagada: "+notas);
//        Verifique se a lista está mesmo vazia
        System.out.println("Lista está vazia? "+notas.isEmpty());
    }
}
