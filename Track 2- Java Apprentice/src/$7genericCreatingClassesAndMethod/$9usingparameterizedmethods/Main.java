package $7genericCreatingClassesAndMethod.$9usingparameterizedmethods;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * Using Parameterized Methods
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};
        MapHelper.addEntries(studentsMap, studentIds, studentNames);
        MapHelper.printEntries(studentsMap);

        System.out.println();

        Map<Integer, Double> studentsMap1 = new HashMap<>();
        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};
        /* can also use as below */
        MapHelper.<Integer, Double>addEntries(studentsMap1, studentIds, studentScores);
        MapHelper.<Integer, Double>printEntries(studentsMap1);

    }

}
