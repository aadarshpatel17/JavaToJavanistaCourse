package $3_0overrindingandusingaccessmodifiers.$4usingfinalwithfieldsmethodsandclasses;

public class Main {

    public static void main(String[] args) {

//        final with fields
//        it's not permissible to reassign the value of any field after it's
//        been initialized.
//        final fields can be assign in a constructor and initialized block

//        final with methods
//        A method that has been marked as final cannot be overridden.

//        final with classes
//        A class that has been marked as final cannot be extended.

        Property alpha = new Property("Residential Property", "Alpha", 1200);
        Property beta = new Property("Commercial Property", "Beta", 2200);
        Property gamma = new Property("Industrial Property", "Gamma", 4201);
        Property delta = new Property("Plot", "Delta", 1240);

        System.out.println("alpha: " + alpha);
        System.out.println("beta: " + beta);
        System.out.println("gamma: " + gamma);
        System.out.println("delta: " + delta);
        System.out.println();

//        alpha.setId(1000);
//        beta.setProjectName("Omega");
//        gamma.setPropertySize(4500);
//        delta.setPropertyType("Government Land");


    }

}
