import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaVariable {

    // int value = 4; //not-acceptable

    public static void main(String[] args) {

        int value = 4; // acceptable

        Consumer<Integer> consumer = (i) -> {
            //value++; //not-acceptable
//            value = 3; // not-acceptable

            System.out.println(value+i);

           // value = 2; //not-acceptable
        };
        // value = 5; // not-acceptable

        consumer.accept(2);

    }
}
