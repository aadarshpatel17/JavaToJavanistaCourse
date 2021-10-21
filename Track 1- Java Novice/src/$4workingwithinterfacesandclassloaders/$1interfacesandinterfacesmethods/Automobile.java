package $4workingwithinterfacesandclassloaders.$1interfacesandinterfacesmethods;

public interface Automobile {

//    Abstract Classes: An Abstract is one which cannot be directly instantiated.

//    Abstract Methods: Declared in abstract classes and must defined or get overridden
//      in classes which inherits this abstract classes.

//    interfaces: Means by which interaction or communication is achieved.
//      An interface is a construct in which every method is abstract.
//      By default everything which is declared as are PUBLIC.
//      An interface doesn't contain any implementations.

//    Variables in interfaces are PUBLIC, STATIC, and FINAL.
    String safetyAssessmentProgram = "Global NCAP";

//  Signature of methods
    String getMake();

    String getModel();

    Double getPrice();

}
