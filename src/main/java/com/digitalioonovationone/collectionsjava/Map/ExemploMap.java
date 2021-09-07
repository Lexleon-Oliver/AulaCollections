package com.digitalioonovationone.collectionsjava.Map;

import java.util.*;

public class ExemploMap {
    /*Dados os seguintes modelos de carros e seus respectivos consumos na estrada:
    Modelo = gol - consumo - 14,4 km/l
    Modelo = uno - consumo - 15,6 km/l
    Modelo = mobi - consumo - 16,1 km/l
    Modelo = hb20 - consumo - 14,5 km/l
    Modelo = kwid - consumo - 15,6 km/l

    Crie um dicionário e relacione os modelos com seus respectivos consumos
     */

    public static void main(String[] args) {
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Carros populares e seus consumos: "+carrosPopulares);
//        Substitua o consumo do gol por 15,2 km/l
        carrosPopulares.put("gol", 15.2);
        System.out.println("Carros populares e seus consumos com gol atualizado: "+carrosPopulares);
//        Confira se o modelo tucson está no dicionário
        System.out.println("A lista possui o modelo Tucson? "+carrosPopulares.containsKey("tucson"));
//        Exiba o consumo do Uno
        System.out.println("O consumo do uno é: "+carrosPopulares.get("uno"));
//        Exiba todos os modelos
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Todos os modelos da lista: "+modelos);
//        Exiba todos os consumos dos carros
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("Todos os consumos dos modelos da lista: "+consumos);
//        Exiba o modelo mais economico e seu consumo
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String,Double>> entries =carrosPopulares.entrySet();
        String modeloMaisEconomico;
        for (Map.Entry<String,Double> entry:entries) {
            if (entry.getValue().equals(melhorConsumo)){
                modeloMaisEconomico= entry.getKey();
                System.out.println("Modelo mais econômico: "+modeloMaisEconomico+" com o consumo de "+melhorConsumo+" km/l");
            }
            
        }
//        Exiba o modelo mais economico e seu consumo
        Double piorConsumo = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String,Double>>entries1= carrosPopulares.entrySet();
        String modeloMenosEconomico;
        for (Map.Entry<String,Double>entry:entries1){
            if (entry.getValue().equals(piorConsumo)){
                modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo menos econômico: "+modeloMenosEconomico+" com o consumo de "+piorConsumo+" km/l");
            }
        }
//        Exiba a soma dos consumos
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos é: "+soma);
//        Exiba a media deste dicionário de carros
        System.out.println("A media de consumo destes carros é: "+soma/carrosPopulares.size());
//        Remova os modelos com consumo igual a 15,6 km/l
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println("Modelos com consumo de 15.6 km/l removidos: "+carrosPopulares);
//        Exiba os modelos conforme ordem de inserçaõ
        Map<String,Double> carrosPopularesOrdenados = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Carros populares por ordem de inserção: "+carrosPopularesOrdenados);
        //        Exiba o terceiro modelo adicionado
//       não possivel

//        Exiba o dicionario ordenado pelo modelo
        Map<String,Double> carrosPopularesOrdenadosModelo = new TreeMap<>(carrosPopularesOrdenados){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Carros populares por modelos: "+carrosPopularesOrdenadosModelo);
//        Apague o dicionario de carros
        carrosPopulares.clear();
        System.out.println("Dicionário de carros deletado: "+carrosPopulares);
//        Verfique se o dicionario está vazio
        System.out.println("Dicionário de carros está vazio? "+carrosPopulares.isEmpty());
    }
}
