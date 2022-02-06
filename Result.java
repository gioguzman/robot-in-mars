import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'calcularMaximoRetorno' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY instruccion as parameter.
     */
    public static List<Integer> calculateMaxReturn(List<String> instruccion) {
        // Write your code here

        int positionX = 0, positionY = 0, actualReturn, majorReturn = 0;
        List<Integer> maxReturn = new ArrayList<>();

        for(String instruccionesList : instruccion){
            char [] movimientos = instruccionesList.toCharArray();

            for (char movimiento : movimientos){
                switch (movimiento){
                    case 'R':
                        positionX ++;
                        break;
                    case 'L':
                        positionX --;
                        break;
                    case 'U':
                        positionY ++;
                        break;
                    case 'D':
                        positionY --;
                        break;
                }
                actualReturn = Math.abs(positionX) + Math.abs(positionY);
                if (actualReturn > majorReturn){
                    majorReturn = actualReturn;
                }
            }
            maxReturn.add(majorReturn);
            majorReturn = 0;
            positionX = 0;
            positionY = 0;
        }
        return maxReturn;
    }

}
