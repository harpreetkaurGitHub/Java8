package LambdaExpression1;

public class RunnableLambda {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Imperative Expression");
            }
        };

        /**
         * Use above thing as Lambda Expression
         */

        Runnable runnable1 = () -> {
            System.out.println("Runnable Lambda Expression");
        };

        // Single Statement not needed {} Okay!!
        Runnable runnable2 = () -> System.out.println("One Line Lambda Expression");


        new Thread(runnable).start();
        new Thread(runnable1).start();
        new Thread(runnable2).start();
        //Game Changer haha !!
        new Thread(() -> System.out.println("I am executing into the thread..!!")).start();

    }
}
