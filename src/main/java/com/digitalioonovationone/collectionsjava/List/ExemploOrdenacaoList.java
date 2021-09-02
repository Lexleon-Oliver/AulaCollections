package com.digitalioonovationone.collectionsjava.List;
//Com base nas seguintes informações dos gatos abaixo, crie uma lista e ordene-a exibindo (nome - idade - cor);
//Gato 01 = nome: John, idade: 18, cor: preto
//Gato 02 = nome: Simba, idade: 6, cor: tigrado
//Gato 03 = nome: John, idade: 12, cor: amarelo

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("John",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("John",12,"amarelo"));
        }};
//        Imprimir na ordem de inserção:
        System.out.println("Gatos em ordem de inserção:" + gatos);
//        Imprimir em Ordem Aleatória
        Collections.shuffle(gatos);
        System.out.println("Gatos em ordem aleatória:" + gatos);
//        Imprimir pela ordem natural nome
        Collections.sort(gatos);
        System.out.println("Gatos em ordem natural por nome"+gatos);
//        Imprimir pela ordem natural idade
//        Collections.sort(gatos,new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println("Gatos em ordem natural por idade"+gatos);
//        Imprimir pela ordem natural cor
//        Collections.sort(gatos,new ComparatorCor());
        gatos.sort(new ComparatorCor());
        System.out.println("Gatos em ordem natural por cor"+gatos);
//        Imprimir pela ordem natural nome/idade/cor
//        gatos.sort(new ComparatorNomeCorIdade());
        Collections.sort(gatos,new ComparatorNomeCorIdade());
        System.out.println("Gatos em ordem natural por nome, cor e idade" +gatos);
    }
}


class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome= gato1.getNome().compareToIgnoreCase(gato2.getNome());
        int cor= gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (nome!= 0){
            return nome;
        }
        if (cor != 0){
            return cor;
        }
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}