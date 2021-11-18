package $7genericCreatingClassesAndMethod.$8parameterizingclasses;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * Identifying the Limitations of Non-generic Methods
     *  -
     */

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper<Integer, String> mapHelper = new MapHelper<>();

        mapHelper.addEntries(studentsMap, studentIds, studentNames);
        mapHelper.printEntries(studentsMap);

        System.out.println();

        Map<Integer, Double> studentsMap1 = new HashMap<>();

        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper<Integer, Double> mapHelper1 = new MapHelper<>();

        mapHelper1.addEntries(studentsMap1, studentIds, studentScores);
        mapHelper1.printEntries(studentsMap1);

    }

}
