package $12reflection.$1creatingcClass;

public class Main {

    public static void main(String[] args) {

        /**
         * Creating Classes and Instantiating Objects
         */

        Employee jack = new Employee();
        System.out.println("Employee Jack: " + jack);

        Employee jessica = new Employee("Jessica", "VP", 124000);
        System.out.println("Employee Jessica: " + jessica);

    }

}
