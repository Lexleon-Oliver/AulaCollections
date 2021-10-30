package com.digitalioonovationone.collectionsjava.StreamsApi;

//import com.digitalioonovationone.collectionsjava.List.Gato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExpressionLambda {
    /* uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e um modificador de acesso
    A idéia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em java tem a sintaxe
    definida como (argumento) -> (corpo)
     */

    //Sem a LambdaExpression
        public static void main(String[] args) {
       /* List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};
        gatos.sort(Comparator.comparing(new Function<Gato, String> )) {
            @Override
            public String apply(Gato gato) {
                return gato.getNome();
            }
        });*/

            //Com a LambdaExpression
       /* List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};
        gatos.sort(Comparator.comparing((Gato gato) -> gato.getNome); */
        }
}
class ReferenceMethod{
    /*simplifica lamba expressions*/
//    public static void main(String[] args) {
//        /*Com reference method*/
//        List<Gato> gatos = new ArrayList<>() {{
//            add(new Gato("John", 18, "preto"));
//            add(new Gato("Simba", 6, "tigrado"));
//            add(new Gato("John", 12, "amarelo"));
//        }};
//        gatos.sort(Comparator.comparing(Gato::getNome));
//    }
}