package $12reflection.$9anonymousLocal;

public class Main2 {

    /**
     * Anonymous, Local, Member Classes, and Interfaces
     *  -
     *
     * Query on type parameters, whether a class is anonymous or an inner class, and so on.
     */

    public static void main(String[] args) {

        Employee julian  = new Employee(43000, 5);

        System.out.println("********** Employee");

        System.out.println("Is local class: " + julian.getClass().isLocalClass());
        System.out.println("Is member class: " + julian.getClass().isMemberClass());

        System.out.println();

        Employee.Salary salary = julian.getSalary();

        System.out.println("********** Employee.Salary");

        System.out.println(salary.toString());

        System.out.println("Is local class: " + salary.getClass().isLocalClass());
        System.out.println("Is member class: " + salary.getClass().isMemberClass());

        System.out.println();

    }

}
