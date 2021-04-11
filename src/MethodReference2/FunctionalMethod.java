package MethodReference2;

import java.util.Locale;
import java.util.function.Function;

public class FunctionalMethod {

    /**
     * Lambda Expresion
     */
    static Function<String,String> toUpperCase = (s) -> s.toUpperCase();

    /**
     * Method Reference
     */
    static Function<String,String> toLowerCase = String::toLowerCase;

    public static void main(String[] args) {

        System.out.println(toUpperCase.apply("Lambda Method Reference"));
        System.out.println(toLowerCase.apply("Method Reference"));
    }
}


//todo 1.Refactor Lambda Expression
// 2. Constructor Reference
// 3. Consumer
