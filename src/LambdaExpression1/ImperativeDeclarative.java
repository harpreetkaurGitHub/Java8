package LambdaExpression1;

import java.util.stream.IntStream;

public class ImperativeDeclarative {

    public static void main(String[] args) {

        /**
         * Imperative Approach --> Step by step approach
         */

        int sum1 =0;
        for (int i=0;i<=100;i++) {
            sum1 += i;
        }
        System.out.println("Imperative Approach :: " + sum1);



        /**
         * Declarative Approach --> Direct Result Approach
         */

        int sum2 = IntStream.rangeClosed(1,100).parallel().sum();
        System.out.println("Declarative Approach :: "+sum2);

    }
}
