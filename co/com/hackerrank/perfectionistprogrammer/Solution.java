package co.com.hackerrank.perfectionistprogrammer;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<List<Integer>> scenarios = new ArrayList<List<Integer>>();

        for (int i = 0; i <= 3; i ++){
            scenarios.add(new ArrayList<Integer>());
        }

        scenarios.get(0).add(2);
        scenarios.get(0).add(5);
        scenarios.get(1).add(40);
        scenarios.get(1).add(110);
        scenarios.get(2).add(20);
        scenarios.get(2).add(30);
        scenarios.get(3).add(5);
        scenarios.get(3).add(10);


        List<Boolean> returnList = Result.isFinishedWorkAtDay(scenarios);

        System.out.println(returnList);

    }
}
