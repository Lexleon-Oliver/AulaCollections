package com.digitalioonovationone.collectionsjava.Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
//        Com as series informadas, crie um conjunto e ordene este conjunto exibindo: (Nome - genero - duração de episodio)
//        Série 1 = Nome: got, Gênero: fantasia, TempoEpisódio: 60
//        Série 2 = Nome: dark, Gênero: drama, TempoEpisódio: 60
//        Série 3 = Nome: that '70s show, Gênero: comédia, TempoEpisódio: 25

//        Exibir em ordem aleatória
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia",60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that '70s show","comédia",25));
        }};
        System.out.println("Ordem aleatória: "+ series);
//        Exibir em ordem de inserção
        Set<Serie> series1 = new LinkedHashSet<>();
        series1.add(new Serie("got", "fantasia",60));
        series1.add(new Serie("dark", "drama",60));
        series1.add(new Serie("that '70s show", "comédia",25));
        System.out.println("Ordem de inserção: "+series1);
//        Exibir em ordem natural por tempo de episódio
        Set<Serie> series2 = new TreeSet<>(series1);
        System.out.println("Ordem por tempo de Episódio: "+series2);
//        Exibir em ordem natural por nome/genero/duração
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
        series3.add(new Serie("got", "fantasia",60));
        series3.add(new Serie("dark", "drama",60));
        series3.add(new Serie("that '70s show", "comédia",25));
        System.out.println("Ordem de inserção: "+series3);

    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer duracao;

    public Serie(String nome, String genero, Integer duracao) {
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && duracao.equals(serie.duracao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracao);
    }

    @Override
    public int compareTo(Serie serie) {
        int duracao = Integer.compare(this.getDuracao(), serie.getDuracao());
        if (duracao != 0){
            return duracao;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNomeGeneroDuracao implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0){
            return nome;
        }
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0){
            return genero;
        }
        return Integer.compare(s1.getDuracao(),s2.getDuracao());
    }
}