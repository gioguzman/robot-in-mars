package co.com.hackerrank.perfectionistprogrammer;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'podraCumplir' function below.
     *
     * The function is expected to return a BOOLEAN_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY caso as parameter.
     */

    public static List<Boolean> isFinishedWorkAtDay(List<List<Integer>> testScenario) {
        // Write your code here

        int deadline = 0, functionsExpects = 0, functionsNewAtDay = 0, functionsDelete = 0, totalFunctions = 0;
        boolean completedWork = false;
        List<Boolean> finishedWork = new ArrayList<>();

        for(int i = 0; i <= testScenario.get(0).size() -1; i ++){
            deadline = testScenario.get(0).get(i);
            functionsExpects = testScenario.get(1).get(i);
            functionsNewAtDay = testScenario.get(2).get(i);
            functionsDelete = testScenario.get(3).get(i);

            for (int j = 1; j <= deadline; j++){
                totalFunctions += functionsNewAtDay;
                if (totalFunctions >= functionsExpects){
                    completedWork = true;
                }else{
                    totalFunctions -= functionsDelete;
                }
            }
            finishedWork.add(completedWork);
            totalFunctions = 0;
        }
        return finishedWork;
    }

}
