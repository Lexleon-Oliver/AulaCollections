package com.digitalioonovationone.collectionsjava.Map;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        /*Dadas as informações dos livros e autores abaixo crie um dicionario e ordene este dicionario exibindo (Nome
        Autor - Nome Livro)
        1- Autor = Hawking, Stephen - Livro = Uma Breve História do Tempo. páginas: 256
        2- Autor = Duhigg, Charles - Livro = O Poder do Hábito. páginas: 408
        3- Autor = Harari, Yuval Noah - Livro = 21 Lições para o Século 21. páginas: 432


        Exibir em ordem aleatória */
        Map<String,Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o Século 21",432));
        }};
        System.out.println("Livros em ordem Aleatória: ");
        for (Map.Entry<String,Livro>livro: livros.entrySet()){
            System.out.println(livro.getKey()+ " - "+livro.getValue().getNome());
        }
        System.out.println(" ");

//        Exibir em ordem de inserção
        Map<String,Livro> livrosOrdenados = new LinkedHashMap<>(){{
            put("Hawking, Stephen",new Livro("Uma Breve História do Tempo",256));
            put("Duhigg, Charles",new Livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah",new Livro("21 Lições para o Século 21",432));
        }};
        System.out.println("Livros em ordem inserção: ");
        for (Map.Entry<String,Livro>livro: livrosOrdenados.entrySet()){
            System.out.println(livro.getKey()+ " - "+livro.getValue().getNome());
        }
        System.out.println("");

//        Exibir autores por ordem alfabetica
        Map<String,Livro> livrosOrdenadosAutores = new TreeMap<>(livrosOrdenados);
        System.out.println("Livros ordenados por autores: ");
        for (Map.Entry<String,Livro>livro: livrosOrdenadosAutores.entrySet()){
            System.out.println(livro.getKey()+ " - "+livro.getValue().getNome());
        }
        System.out.println(" ");

//        Exibir livros por oderm alfabetica
        Set<Map.Entry<String ,Livro>> livrosOrdenadosNome = new TreeSet<>(new ComparatorNome());
        livrosOrdenadosNome.addAll(livrosOrdenados.entrySet());
        System.out.println("Livros ordenados por nome: ");
        for (Map.Entry<String,Livro>livro: livrosOrdenadosNome){
            System.out.println(livro.getValue().getNome()+ " - "+livro.getKey());
        }
        System.out.println("");

//        Exibir por número de páginas
        Set<Map.Entry<String,Livro>> livrosOrdenadosPaginas = new TreeSet<>(new ComparatorPaginas());
        livrosOrdenadosPaginas.addAll(livrosOrdenados.entrySet());
        System.out.println(("Livros Ordenados por Número de Páginas: "));
        for (Map.Entry<String ,Livro> livro: livrosOrdenadosPaginas){
            System.out.println(livro.getValue().getNome()+ " - "+livro.getKey()+" - "+livro.getValue().getPaginas()+" páginas");
        }


    }
}
class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
