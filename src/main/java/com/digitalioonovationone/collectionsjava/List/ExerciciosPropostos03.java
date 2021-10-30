package com.digitalioonovationone.collectionsjava.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostos03 {
    public static void main(String[] args) {
//        Usando listas crie um programa que faça 5 perguntas sobre um crime. As perguntas são:
//        1- Telefonou para a vitima?
//        2- Esteve no local do crime?
//        3- Mora perto da vitima?
//        4- Devia para a vitima?
//        5- Ja trabalhou com a vitima?
//        Se a pessoa responder positivamente a 2 questoes ele deve ser classificada como "Suspeita", entre 3 e 4 como
//        "Cumplice" e 5 como "Assassina". Caso contrario, ela será classificada como "Inocente".

        List<Integer> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("---Perguntas---");
        System.out.println("Digite 1 para 'SIM' e 0 para 'NÃO'");
        System.out.println("Você telefonou para a vítima?");
        int resposta = scan.nextInt();
        respostas.add(resposta);
        System.out.println("Você esteve no local do crime?");
        resposta = scan.nextInt();
        respostas.add(resposta);
        System.out.println("Você mora perto da vítima?");
        resposta = scan.nextInt();
        respostas.add(resposta);
        System.out.println("Você devia para a vítima?");
        resposta = scan.nextInt();
        respostas.add(resposta);
        System.out.println("Você já trabalhou com a vítima?");
        resposta = scan.nextInt();
        respostas.add(resposta);
        Iterator<Integer> iterator= respostas.iterator();
        int culpa = 0;
        while (iterator.hasNext()){
            int next = iterator.next();
            if(next == 1){
                culpa += next;
            }
        }
        switch (culpa){
            case 5:
                System.out.println("------> Você é o Assassino <------");
                break;
            case 4:
            case 3:
                System.out.println("------> Você é Cúmplice <------");
                break;
            case 2:
                System.out.println("------> Você é Suspeito <------");
                break;
            default:
                System.out.println("------> Você é Inocente <------");
        }

    }
}
