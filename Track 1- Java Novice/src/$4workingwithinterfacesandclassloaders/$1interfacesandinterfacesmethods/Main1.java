package $4workingwithinterfacesandclassloaders.$1interfacesandinterfacesmethods;

public class Main1 {

        public static void main(String[] args) {

//            Sedan sedan = new Sedan("Honda", "Civic", 12000.0);
            Automobile sedan = new Sedan("Honda", "Civic", 12000.0);

            System.out.println("Sedan make: " + sedan.getMake());
            System.out.println("Sedan model: " + sedan.getModel());
            System.out.println("Sedan price: " + sedan.getPrice());

            System.out.println("Variable of Interface (Using Instance Reference): " + sedan.safetyAssessmentProgram);
            System.out.println("Variable of Interface (Using Class Reference): " + Sedan.safetyAssessmentProgram);
            System.out.println("Variable of Interface (Using Interface Reference): " + Automobile.safetyAssessmentProgram);

            System.out.println("Sedan: " + sedan);

        }

}
