package $2handlingException.$4usingfinallyblock;

public class FinallyWithoutCatch {

    public static void main(String[] args) {

        int num = 6;
        try {
            System.out.println("Start of the program!");
            System.out.println("num/0: " + (num / 0));
        }
        finally {
            System.out.println("finally block invoked!");
        }
        System.out.println("Start of the program!");

    }

}
