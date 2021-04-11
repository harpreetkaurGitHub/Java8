package LambdaExpression1;

import java.util.Comparator;

public class ComparatorLambda {

    public static void main(String[] args) {

        /**
         * Imperative Comparator
         */
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return integer.compareTo(t1);
            }
        };
        System.out.println("Comparator comparing ::" + comparator1.compare(4,7));

        /**
         * Comparator Lambda
         */

        Comparator<Integer> comparator2 = (integer,t1) -> integer.compareTo(t1);
        System.out.println("Lambda Comparator comparing :: " + comparator2.compare(3,3));

    }
}
