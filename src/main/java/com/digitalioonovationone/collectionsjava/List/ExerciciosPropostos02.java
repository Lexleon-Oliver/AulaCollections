package com.digitalioonovationone.collectionsjava.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciciosPropostos02 {
    public static void main(String[] args) {
//        Armazenar a temperatura media dos 6 primeiros meses do ano em uma lista, calcule a media semestral e exibir as
//        temperaturas acima da média e que mês ocorreram por extenso. (Exemplo 1-Janeiro, 2-Fevereiro)
        List<Double> temperaturas = new ArrayList<>();
        temperaturas.add(24d);
        temperaturas.add(25.1);
        temperaturas.add(24.5);
        temperaturas.add(25d);
        temperaturas.add(23.2);
        temperaturas.add(22.5);

        Iterator<Double> iterator= temperaturas.iterator();
        Double total = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            total += next;
        }
        Double media = total/ temperaturas.size();
        System.out.println("Media semestral de temperatura: "+media);
        for (Double temp : temperaturas) {
            if(temp > media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }

    }
}
