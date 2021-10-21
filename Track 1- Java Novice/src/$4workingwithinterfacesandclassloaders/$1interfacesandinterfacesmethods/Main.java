package $4workingwithinterfacesandclassloaders.$1interfacesandinterfacesmethods;

public class Main {

    public static void main(String[] args) {

        Sedan sedan = new Sedan();

        System.out.println("Sedan make: " + sedan.getMake());
        System.out.println("Sedan model: " + sedan.getModel());
        System.out.println("Sedan price: " + sedan.getPrice());


//        we cannot directly instantiated interfaces like:
//        Automobile automobile = new Automobile();

//        but we can instantiated interfaces like
//        Automobile automobile = new Automobile() {
//            @Override
//            public String getMake() {
//                return null;
//            }
//
//            @Override
//            public String getModel() {
//                return null;
//            }
//
//            @Override
//            public Double getPrice() {
//                return null;
//            }
//        };

    }

}