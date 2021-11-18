package $7genericCreatingClassesAndMethod.$7nongenericmethodlimits;

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
        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper mapHelper = new MapHelper();

//        mapHelper.addEntries(studentsMap, studentIds, studentNames);
//        mapHelper.printEntries(studentsMap);

        Map<Integer, Double> studentsMap1 = new HashMap<>();
        mapHelper.addEntries(studentsMap1, studentIds, studentScores);
        mapHelper.printEntries(studentsMap1);

    }

}
