package $5collectionList.$1usingparameterizedlists;

import java.util.ArrayList;

public class AddElementInParameterizedArrayList {

    public static void main(String[] args) {

        ArrayList<String> currencyList = new ArrayList<>();

        currencyList.add("INR");
        currencyList.add("EUR");
        currencyList.add("USD");

        System.out.println("Currency List: " + currencyList);

    }

}
