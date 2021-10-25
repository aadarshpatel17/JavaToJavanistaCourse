package $12reflection.$9anonymousLocal;

public class Main {

    /**
     * Anonymous, Local, Member Classes, and Interfaces
     *  -
     *
     * Query on type parameters, whether a class is anonymous or an inner class, and so on.
     */

    public static void main(String[] args) {

        System.out.println("*********** Deliverable");
        System.out.println("Is anonymous class: " + Deliverable.class.isAnonymousClass());
        System.out.println("Is local class: " + Deliverable.class.isLocalClass());
        System.out.println("Is interface: " + Deliverable.class.isInterface());

        System.out.println();

//        implementing interfaces using anonymous class
        Deliverable webApplication = new Deliverable() {
            @Override
            public String getProjectName() {
                return "Mongo Web Application";
            }

            @Override
            public String getProjectStatus() {
                return "In Progress";
            }
        };

        System.out.println("************* Instance of Deliverable (web application)");
        System.out.println("Is anonymous class: " + webApplication.getClass().isAnonymousClass());
        System.out.println("Is local class: " + webApplication.getClass().isLocalClass());
        System.out.println("Is interface: " + webApplication.getClass().isInterface());

        System.out.println();

//        implementing local class
        class MobileApplication implements Deliverable {

            @Override
            public String getProjectName() {
                return "Mongo Mobile Application";
            }

            @Override
            public String getProjectStatus() {
                return "Deployed";
            }
        }

        Deliverable mobileApplication = new MobileApplication();

        System.out.println("************* Instance of Deliverable (mobile application)");
        System.out.println("Is anonymous class: " + mobileApplication.getClass().isAnonymousClass());
        System.out.println("Is local class: " + mobileApplication.getClass().isLocalClass());
        System.out.println("Is interface: " + mobileApplication.getClass().isInterface());

        System.out.println();

    }

}
