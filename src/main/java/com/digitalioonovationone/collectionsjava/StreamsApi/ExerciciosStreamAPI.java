package com.digitalioonovationone.collectionsjava.StreamsApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","9","6","5");
        System.out.println("Imprima todos os elementos dessa Lista: ");
//        numerosAleatorios.stream()
//                .forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//        System.out.println(s);
//                    }
//                });

//------------------------------------------------------------------------
//        OU lambda:
//                .forEach(s -> System.out.println(s));
//                .forEach(System.out::println);
//------------------------------------------------------------------------
//        Ou com o proprio ForEach do List sem precisar do Stream:
//        numerosAleatorios.forEach(s -> System.out.println(s));

//------------------------------------------------------------------------
//        Ou com o method reference:
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um SET: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme essa lista de String em uma lista de inteiros: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
//---------------------------------------------------------------------------
//        Ou lambda:
//                .map(s -> Integer.parseInt(s));
//---------------------------------------------------------------------------
//        ou method reference:
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma Lista: ");
        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                       if (integer%2==0 && integer>2){
//                           return true;
//                       }else{
//                           return false;
//                       }
//                    }
//                }).collect(Collectors.toList());
//------------------------------------------------------------------------------
//        ou Lambda:
                .filter(integer -> integer%2==0 && integer>2).collect(Collectors.toList());

        System.out.println("MOstre a media dos numeros: ");
        numerosAleatorios.stream()
//                .mapToInt(new ToIntFunction<String>() {
//                    @Override
//                    public int applyAsInt(String s) {
//                        return Integer.parseInt(s);
//                    }
//                });
//---------------------------------------------------------------------------------
//        Ou lambda:
//                .mapToInt(s-> Integer.parseInt(s));
//        -------------------------------------------------------------------------
//        Ou Method reference:
                .mapToInt(Integer::parseInt)


                .average()
//                .ifPresent(new DoubleConsumer() {
//                    @Override
//                    public void accept(double value) {
//                        System.out.println(value);
//                    }
//                });
//----------------------------------------------------------------------------------
//         Com Lambda
//                .ifPresent(value -> System.out.println(value));
//        --------------------------------------------------------------------------
//        COm Method reference
                .ifPresent(System.out::println);

        System.out.println("Remova os numeros impares: ");
//        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                if (integer %2!=0){
//                    return true;
//                }else{
//                    return false;
//                }
//
//            }
//        });
//        -------------------------------------------------------------------------------
//        Com Lambda:
        numerosAleatoriosInteger.removeIf(integer -> integer %2!=0);
        System.out.println(numerosAleatoriosInteger);
    }
}
