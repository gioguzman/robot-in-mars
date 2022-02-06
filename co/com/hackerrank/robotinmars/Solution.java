package co.com.hackerrank.robotinmars;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<String> instruction = new ArrayList<>();
        instruction.add("RUULLLDDDR");
        instruction.add("U");
        instruction.add("UUU");

        List<Integer> returnList = Result.calculateMaxReturn(instruction);

        System.out.println(returnList);

    }
}
