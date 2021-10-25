package $12reflection.$9anonymousLocal;

public class Main3 {

    /**
     * Anonymous, Local, Member Classes, and Interfaces
     *  -
     *
     * Query on type parameters, whether a class is anonymous or an inner class, and so on.
     */

    private static class HR extends Department {
        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) {

        Department hr = new HR();

        System.out.println("**************** HR");

        System.out.println("Is local class: " + hr.getClass().isLocalClass());
        System.out.println("Is member class: " + hr.getClass().isMemberClass());

        System.out.println();

    }

}
