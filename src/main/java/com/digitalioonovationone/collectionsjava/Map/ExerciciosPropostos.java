package com.digitalioonovationone.collectionsjava.Map;

import java.util.*;

public class ExerciciosPropostos {
    /*Dada a população dos estados abaixo informada:
     Estado = PE - População = 9.616.6)21
     Estado = AL - População = 3.351.543
     Estado = CE - População = 9.187.103
     Estado = RN - População = 3.534.265

     crie um dicionário e relacione os estados e suas populações;*/
    public static void main(String[] args) {
        Map<String,Integer> populacao = new HashMap<>();
        populacao.put("PE",9616621);
        populacao.put("AL",3351543);
        populacao.put("CE",9187103);
        populacao.put("RN",3534265);
        System.out.println("Populacão dos estados do NE: "+populacao);

//        Substitua a população do estado do RN por 3.534.165
        populacao.put("RN",3534165);
        System.out.println("População dos estados do NE com RN atualizado: "+populacao);
//        Verifique se o estado PB está no dicionário
        System.out.println("PB está no dicionário? "+ populacao.containsKey("PB"));
        populacao.put("PB", 4039277);
        System.out.println("PB está no dicionário? "+ populacao.containsKey("PB"));
        System.out.println("População dos estados do NE com PB adicionado "+populacao);
//        Exiba a populacao de PE
        System.out.println("População de PE é: "+populacao.get("PE"));
//        Exiba os estados por oredem de inserção
        Map<String,Integer> populacaoOrdenada = new LinkedHashMap<>();
        populacaoOrdenada.put("PE",9616621);
        populacaoOrdenada.put("AL",3351543);
        populacaoOrdenada.put("CE",9187103);
        populacaoOrdenada.put("RN",3534265);
        System.out.println("Populacão dos estados do NE por ordem de inserção: "+populacaoOrdenada);
//        Exiba os estados em ordem alfabetica
        Map<String,Integer> populacaoOrdenadaEstado = new TreeMap<>(populacaoOrdenada);
        System.out.println("População dos estados do NE por ordem alfabetica: "+populacaoOrdenadaEstado);
//        Exiba o estado com a menor população e sua quantidade
        Integer menorPopulaçao = Collections.min(populacaoOrdenada.values());
        Set<Map.Entry<String,Integer>> entries=populacaoOrdenada.entrySet();
        String estadoMenorPopulacao;
        for (Map.Entry<String,Integer> entry:entries){
            if (entry.getValue()==menorPopulaçao){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("O estado com menor populacao é "+ estadoMenorPopulacao+", com a seguinte populacao: "+menorPopulaçao);
            }
        }
//        Exiba o estado com maior populacao e sua quantidade
        Integer maiorPopulacao= Collections.max(populacaoOrdenada.values());
        String estadoMaiorPopulacao;
        for (Map.Entry<String,Integer>entry:entries){
            if (entry.getValue()==maiorPopulacao){
                estadoMaiorPopulacao =entry.getKey();
                System.out.println("O estado com maior populaçao e "+estadoMaiorPopulacao+", com a seguinte populacao: "+maiorPopulacao);
            }
        }
//        Exiba a soma da populacao desses estados
        Iterator<Integer> iterator = populacao.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma = soma + next;
        }
        System.out.println("A soma da populaçaõ dos estados do NE é: "+soma);
        System.out.println("A média da população do NE é de: "+ soma/populacao.values().size());
//        Remova os estados com população menor que 4000000
        Iterator<Integer> iterator1 = populacao.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next()<4000000){
                iterator1.remove();
            }
        }
        System.out.println("Dicionário sem estados com população menor que 4000000: "+populacao);
//        Apague o dicionário de estados
        populacao.clear();
        System.out.println("Dicionário apagado: "+ populacao);
//        Verificar se o dicionário foi apagado
        System.out.println("Lista de estados está vazia? "+populacao.isEmpty());

    }

}
