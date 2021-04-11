package LambdaExpression1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeDeclarative2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,3,5,7,9,22,44,35,78,59);

        /**
         * Imperative Approach --> Step by step approach
         */

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : integerList){
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("Imperative Approach ::" +uniqueList);


        /**
         * Declarative Approach --> Direct Result Approach
         */

        List<Integer> uniqueList2 = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println("Declarative Approach ::" +uniqueList2);

    }
}
