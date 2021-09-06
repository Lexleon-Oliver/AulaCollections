package com.digitalioonovationone.collectionsjava.Set;

import java.util.*;

public class ExerciciosPropostos02 {
//    Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Depois, crie um conjunto com 3
//    linguagens e faça um programa que ordene esse conjunto por:
public static void main(String[] args) {
    Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
    linguagens.add(new LinguagemFavorita("Java", "1991","Visual Studio Code"));
    linguagens.add(new LinguagemFavorita("Python", "1991", "Pycharm"));
    linguagens.add(new LinguagemFavorita("JavaScript", "1995", "IntelliJ"));

//    Exiba por ordem de Inserção
    System.out.println("Ordem de inserção: ");
    for (LinguagemFavorita linguagem: linguagens){
        System.out.println(linguagem);
    }

//    Exiba em ordem natural por nome
    Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
    System.out.println("Ordem natural por nome: ");
    for (LinguagemFavorita linguagem:linguagens1){
        System.out.println(linguagem);
    }

//    Exiba por IDE
    Set<LinguagemFavorita> linguagens2 = new TreeSet<LinguagemFavorita>(new ComparatorIDE());
    linguagens2.addAll(linguagens);
    System.out.println("Ordem natural por IDE");
    for (LinguagemFavorita linguagem:linguagens2){
        System.out.println(linguagem);
    }

//    Exiba por ano de criação e nome
    Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
    linguagens3.addAll(linguagens);
    System.out.println("Ordem natural por Ano de Criação / Nome");
    for (LinguagemFavorita linguagem:linguagens3){
        System.out.println(linguagem);
    }

//    Exiba por nome, ano de criação e IDE
    Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoIde());
    linguagens4.addAll(linguagens);
    System.out.println("Ordem natural por Nome/Ano de criação/IDE");
    for (LinguagemFavorita linguagem:linguagens4){
        System.out.println(linguagem);
    }
}
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private String ano;
    private String ide;

    public String getNome() {
        return nome;
    }

    public String getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", ano='" + ano + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && ano.equals(that.ano) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ano, ide);
    }

    public LinguagemFavorita(String nome, String ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareTo(o.nome);
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = l1.getAno().compareToIgnoreCase(l2.getAno());
        if (anoCriacao!=0){
            return anoCriacao;
        }
        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome!= 0){
            return nome;
        }
        int ano= l1.getAno().compareToIgnoreCase(l2.getNome());
        if ((ano!=0)){
            return ano;
        }
        return l1.getIde().compareToIgnoreCase(l1.getIde());
    }
}